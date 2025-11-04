class MathOperation{
    public static float mul(float x, float y) {

         float t = x*y;
         return (t);
        
    }
    public static float divide(float a,float b){
            return(a/b);
}
} 
 
class MathApplication{
     public static void main(String args[]){
        float z =MathOperation.mul(4.0f,5.0f);
        float D =MathOperation.divide(z,2.0f);
        System.out.println("Division ="+D);
        System.out.println("Multiplication ="+z);
     }  
}   
