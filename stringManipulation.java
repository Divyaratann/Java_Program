class stringManipulation{
    public static void main(String args[]){
        StringBuffer str=new StringBuffer("object language");
        System.out.println("original String "+str); 
        System.out.println("length of string" +str.length());
        for (int i=0 ; i< str.length() ; i++){
            int p=i+1;
            System.out.println("character at position:" +p+ "is:" + str.charAt(i));
        }
        String aString=new String (str.toString());
        int pos=aString.indexOf ("language");
        str.insert(pos,"Oriented");
        System.out.println("modified String "+str);
        str.append("impproves security");
        System.out.println("Append string"+str);
    }
}