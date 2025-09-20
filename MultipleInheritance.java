 class A{
    protected int a;
    public A(int x){
        a=x;
    }
 }
 class B extends A{
    int b ;
    public B(int x,int y){
        super(x);
        b=y;
    }
 }
 class C extends B{
    int c;
    public C (int x,int y,int z){
        super(x,y);
        c=z;

    }
    int add(){
        return(a+b+c);

    }
 }
 class MultipleInheritance{
    public static void main(String args[]){
         C obj =new C(10,20,30);
         int sum = obj.add();
         System.out.println("sum="+sum);
    }
 }
