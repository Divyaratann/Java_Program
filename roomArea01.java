class Room{
      int length,breath;
      void getdata (int l,int b ){
        length=l;
        breath=b;
 }
      int Area(){
        return length*breath;
      }
} 
 class roomArea01 {  
        public static void main(String args[]) {
        Room obj=new Room();
        obj. getdata(10,20);
        int Area= obj.Area();
        System.out.println("Area of Room=" +Area );
    }
 }

