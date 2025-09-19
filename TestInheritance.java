class Room{
    int length,breadth;
    Room(){
        length =breadth=0;
    }
    Room(int l,int b){
        length=l;
        breadth=b;
    }
    int area(){
        return(length * breadth);
    }
}
class BedRoom extends Room{
    int height;
    BedRoom(int l,int b,int h){
        super(l,b);
        height=h;
    }
   int volume(){
    return(length *breadth * height);
   }
}

class TestInheritance{
    public static void main(String args[])
    {
        BedRoom R=new BedRoom (10,20,30);
        int A = R.area();
        int V = R.volume(); 
        System.out.println("Area="+A);
        System.out.println("volume="+V);
    }
}