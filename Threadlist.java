class A  extends Thread{
    public void run(){
        for(int i=1; i<=20;i++){
            System.out.println("from thread A,i=" +i);
        }
        System.out.println("Exit from thraed A");
    }
}
class B extends Thread{
    public void run(){
        for (int j=20;j<=60;j++){
            System.out.println("form thread B,j=" +j);
        }
        System.out.println("exits from thread B");
    }
}
class C extends Thread{
    public void run(){
        for (int k=61;k<100;k++){
            System.out.println("From thread C,K="+k);
        }
        System.out.println("Exists from thread C");
    }
}
class Threadlist{
    public static void main(String args[])
    {
        A objA =new A();
        objA .start();
        B objB =new B();
        objB.start();
        new C().start();
    }
}