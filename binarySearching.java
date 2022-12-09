public class binarySearching {
    public static void main(String[] args) {
        int key = 7;
        int[] arr = { 1, 2, 4, 5, 7, 8, 9 };
        int li = 0;
        int hi = arr.length - 1;
        int mid = (li + hi) / 2;
        while (li <= hi) {
            if (arr[mid] == key) {
                System.out.println(mid);
                break;
            } else if (arr[mid] < key) {
                li = mid + 1;
            } else {
                hi = mid - 1;
            }
            mid = (li + hi) / 2;
        }
    }
}
