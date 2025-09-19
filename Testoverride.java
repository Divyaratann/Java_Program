class Super{
    int x ;
    Super(int x){ 
    this.x=x;
    }

public void display(){
    System.out.println("Super x="+ x);

}
}
class Sub extends Super{
    int y ;
    Sub(int x,int y){
        super(x);
        this.y=y;
    }

public void display(){
    System.out.println("Super x="+x);
    System.out.println("Super y="+y);
}
}
class Testoverride{
    public static void main(String args[])
    {
        Sub obj=new Sub(10,20);
        obj.display();
    }
}