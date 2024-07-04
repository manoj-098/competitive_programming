class Solution {
    public void deleteNode(ListNode node) {
        //APPROACH 1: Time complexity------O(N)
        // ListNode afterNode=node.next;
        // while(afterNode.next!=null)
        // {
        //     node.val=afterNode.val;
        //     afterNode=afterNode.next;
        //     node=node.next;
        // }
        // node.val=afterNode.val;
        // node.next=null;

        //APPROACH 2: Time complexity------O(1)
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
