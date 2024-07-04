public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //ANOTHER APPROACH WITHOUT FINDING LENGTH DIFFERENCE
    // if(headA == null || headB == null) return null;
    
    // ListNode a = headA;
    // ListNode b = headB;
    
    // //if a & b have different len, then we will stop the loop after second iteration
    // while( a != b){
    // 	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
    //     a = a == null? headB : a.next;
    //     b = b == null? headA : b.next;    
    // }
    
    // return a;

      //MY APPROACH
        if(headA==headB) return headA;  
        int lenA=0,lenB=0;
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null)
        {
            lenA++;
            tempA=tempA.next;
        }
        while(tempB!=null)
        {
            lenB++;
            tempB=tempB.next;
        }
        tempA=headA;
        tempB=headB;
        int diff=Math.abs(lenA-lenB);
      //if lenA is greater move tempA by diff times inorder to position both tempA and tempB at same points
        if(lenA>lenB)
        {
            while(diff-->0 && tempA!=null)
                tempA=tempA.next;
        }
        else
        {
            while(diff-->0 && tempB!=null)
                tempB=tempB.next;
        }
        //if after pointing the tempA and tempB at equal position, check if both are equal
        //if ther are equal, then that node is the intersection node. Eg: [1,2] [2]
        if(tempA==tempB) return tempA;
        //do not see the value, see similarity using next pointer
        while(tempA.next!=null && tempB.next!=null)
        {
            if(tempA.next==tempB.next) return tempA.next;
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return null;
    }
}
