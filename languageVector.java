import java.util.*;
public class languageVector{
    public static void main(String args[]){
        Vector<String> list = new Vector<String>();
        int n = args.length;
        for(int i=0; i<n; i++){
            list.addElement(args[i]);
        }
        list.insertElementAt("cobol",2);
        int size = list.size();
        String listArray[]=new String[size];
        list.copyInto(listArray);
        System.out.println("list of language=");
        for (int i = 0; i < size ; i++)
{
         System.out.print(listArray[i]);
}                               
        
   }
}