package cse;
    public class Account{
        String name;
        double balance;
        public Account(String n,double b){
            name=n;
            balance=b;
        }
    public void show(){
        System.out.println("---------->");
        System.out.println("Name="+name+"&:"+balance);
    }
    
}

