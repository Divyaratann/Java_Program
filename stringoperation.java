class stringoperation{
    static String name[]={"Madras","Calcutta","Mumbai","Delhi","Chennai"};
    public static void main(String args[]) {
        int size = name.length;
        String Temp=null;
        for (int i=0; i<size ; i++){
            for(int j=i+1; j<size ;j++){
                if (name[j].compareTo (name [i]) < 0){
                    Temp = name[i];
                    name[i]=name[j];
                    name[j]=Temp;
                }
            }
        }
        System.out.println("sorted city list=");
        for(int i=0;i<size;i++) {
            System.out.println(" "+name[i]);
        }

        }
    }
        
    

