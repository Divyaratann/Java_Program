class BreakContinue{
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++){
            System.out.println(" ");
            if(i>=10)
            break ;
        for (int j = 1; j <=100; j++) {
            
            System.out.println("*");
               if (j==i)
               continue ;
            
        }
            
        }
        System.out.println("terminate by break");
    }
    
}
