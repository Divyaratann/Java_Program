class TestEven implements Runnable{
    public void run(){
        for (int i=2;i<=40;i++){
        if(i%2 == 0){
            System.out.println("Even Number="+i);
        }
        System.out.println("Even Testeven Thread");
    }
}
}
class TestOdd implements Runnable{
    public void run(){
        for(int j=1;j<=40;j++){
            if(j%2!=0){
                System.out.println("odd number="+j);
            }
            System.out.println("From odd ");
        }
    }
}
class TestRunnable{
    public static void main(String args[]) {
        TestEven Evenobj =new TestEven();
        Thread obj1 =new Thread (Evenobj);
        obj1.start();
        TestOdd Oddobj = new TestOdd();
        Thread obj2 = new Thread (Oddobj);
        obj2.start();
        System.out.println("Exist from the main thread");
        
    }
}