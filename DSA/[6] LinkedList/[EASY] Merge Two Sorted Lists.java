/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;

        //APPROACH 1: Using new LinkedList
        ListNode mergedList=new ListNode(00);//assigning a default value to prevent not being null
        ListNode head=mergedList; //head pointer for returning the list finally
        ListNode temp1=list1;
        ListNode temp2=list2;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<=temp2.val)
            {
                mergedList.next=temp1;
                temp1=temp1.next;
                mergedList=mergedList.next;
            }
            else
            {
            mergedList.next=temp2;
                temp2=temp2.next;
                 mergedList=mergedList.next;
            }
        }   
        if(temp2!=null)
        {
            mergedList.next=temp2;
        }
        else  mergedList.next=temp1;
        return head.next;     

        //APPROACH 2: Appending to List1
        // ListNode temp1=list1;
        // ListNode temp2=list2;
        // ListNode prev_temp1=null;
        // while(temp1!=null && temp2!=null)
        // {
        //     //add temp2 of List2 before temp1 of List1
        //     if(temp2.val<=temp1.val)
        //     {
        //         ListNode temp=temp2.next;
        //         temp2.next=temp1;
        //         if(prev_temp1!=null)
        //         {
        //           prev_temp1.next=temp2;  
        //           prev_temp1=prev_temp1.next;
        //         } 
        //         if(prev_temp1==null) 
        //         {
        //             list1=temp2;
        //             prev_temp1=list1;
        //         }
        //         temp2=temp;
        //     }
        //     else
        //     {
        //         prev_temp1=temp1;
        //         if(temp1.next==null) break;
        //         temp1=temp1.next;
        //     }
        // }
        // if(temp2!=null) temp1.next=temp2;
        // return list1;
    }

}
