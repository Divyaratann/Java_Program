class Room{
      int length,breath;
      void getdata (int l,int b ){
        length=l;
        breath=b;

      }
}
 class RoomArea {  
        public static void main(String args[]) {
        Room obj=new Room();
        obj. getdata(10,20);
        int Area= obj.length * obj.breath;
        System.out.println("Area of Room=" +Area );
    }
 }
