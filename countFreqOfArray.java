// -----count frequency of elements in array
//---can be done in two ways
//---1) using 2 loops i=0,j=i+1  (time complexity = ' O(N2) ')
//---2) using hashmap which is optimise O(N)

import java.util.HashMap;
import java.util.Map.Entry;

public class countFreqOfArray {
    public static void main(String[] args) {
        // int[] arr = { 15, 16, 27, 27, 28, 15 };
        int[] arr = { 1, 4, 1, 8, 4, 5, 1 }; // 1 = 3, 4 =2 , 8=1 ,5=1
        int n = arr.length;
        countFrequency(arr, n);
    }

    static void countFrequency(int[] arr, int n) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (result.containsKey(arr[i])) {
                result.put(arr[i], result.get(arr[i]) + 1);
            } else {
                result.put(arr[i], 1);
            }
        }
        for (Entry<Integer, Integer> i : result.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
