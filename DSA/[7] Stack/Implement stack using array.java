class MyStack {
    private int[] arr;
    private int top;
    int len=0;
    

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        if(len==1000) return;
        arr[++top]=x;
        len++;
    }

    public int pop() {
        if(top==-1) return -1;
        // Your Code
        len--;
        return arr[top--];
    }
}
