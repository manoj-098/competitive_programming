class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        if(head.next==null) return head;
        
        //APPROACH 1: Use ArrayList
        //APPROACH 2: Count the number of 0s, 1s, 2s and then reinitialize the given node (or)
        //            create new node. Then insertatBeginning(2) ,insertatBeginning(1),
        //            insertatBeginning(0) for respective no.of times
        //APPROACH 3: Using three pointers - but dont know how :)
        
        //APPROACH 1: ArrayList
        Node temp=head;
        List<Integer> list=new ArrayList<>();
        while(temp!=null)
        {
            list.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(list);
        temp=head;
        for(int N:list)
        {
            temp.data=N;
            temp=temp.next;
        }
        return head;

        //APPROACH 2: Freqeunecy and continuous insertion in a new list
        Node curr=head;
        
        int zero=0,one=0,two=0;
        while(curr!=null){
            if(curr.data==0){
                zero++;
            }
            else if(curr.data==1){
                one++;
            }else if(curr.data==2){
                two++;
            }
            curr=curr.next;
        }
        curr=head;
            while(zero!=0){
               curr.data=0;
                zero--;
                curr=curr.next;
            }
            while(one!=0){
               curr.data=1;
                one--;
                curr=curr.next;
            }
            while(two!=0){
               curr.data=2;
                two--;
                curr=curr.next;
            }
            return head;

        //APPROACH 3: Three pointer - dont know how? 
        //We will try to solvein two passes
        //Pass 1: Put all 0 in front
        //Pass 2: Put all 1 in front
        
        //Pass 1
        Node temp=head;
        Node prev=null;
        Node start=head;
        while(temp!=null)
        {
            
            if(temp.data==0)
            {
                Node temp0=temp;
                temp0.next=null;
                if(prev!=null)
                {
                    prev.next=temp.next;
                }
                temp0.next=start;
                start=temp0;
                head=start;
            }
            prev=temp;
            temp=temp.next;
        }
        return null; //.......need to be continued
        
    }
}
