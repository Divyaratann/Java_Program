class Arraysorting {
    public static void main(String args[]) {
        int arr[] = {69, 74, 24, 18, 88, 101, 104, 56};
        int n = arr.length;

        System.out.println("Array Before Sorting=");
        for (int i = 0; i < n; i++) {
            System.out.print("  " + arr[i]);

        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(); 
        System.out.println("Array After Sorting=");
        for (int i = 0; i < n; i++) {
            System.out.print("  " + arr[i]);
        }
    }
}
