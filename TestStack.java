 class TestStack{
        public static void main(String args[]) {
            Stack stk = new Stack();
            stk.push(10);
            stk.push(20);
            stk.push(30);
            stk.push(40);
            while(!stk.isEmpty()){
                System.out.println(stk.pop());
            }
        }
}
class Stack{
    private int A[];
    private int top;
    public Stack(){
        A = new int[10];
        top=-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void push(int val){
        if (top == A.length-1){
            System.out.println("Stack overflow");
        }else{
            top++;
            A[top] = val;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }else{
            int val = A [top];
            top--;
            return val;
        }
    }
}
