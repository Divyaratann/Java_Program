class Throwdemo {
    static void demoproC(){
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside decomproC");
            throw e;
        }
    }
    public static void main(String args[]) {
        try {
            demoproC();
        } catch (NullPointerException e) {
            System.out.println("Reconnect "+e);
        }
        
    }
    
}
