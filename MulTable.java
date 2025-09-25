class MulTable{
      final static int row = 20;
      final static int column = 20;
    public static void main(String args[]) {
      
    int Product[][]=new int [row][column];
    System.out.println("Multiplication Table=");
    System.out.print("");
    int i,j;
    for (i=10;i<=row;i++){
        for (j=10;j<=column;j++){
            Product[i][j]=i * j;
            System.out.println(""+ Product [i][j]);

        }
        System.out.println("");
    }
    }
}
