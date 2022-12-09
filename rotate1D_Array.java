public class rotate1D_Array {
    public static void main(String[] args) {
        int[] arr = { 28, 4, 6, 50, 2 }; // 6,50,2,28,4 //4,28 ,2,50,6 = 6,50,2,28,4
        int k = 3;
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
