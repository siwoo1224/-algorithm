import java.util.*;

public class Solution {
    public int[] solution1(int []arr) {
        int length = arr.length;
        int a = -1;
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if(arr[i] != a) integers.add(arr[i]);
            a = arr[i];
        }
        int [] result = new int[integers.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = integers.get(i);
        }

        return result;
    }
    
    static public int[] solution(int []arr) {
        int a = -1;
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != a) integers.add(arr[i]);
            a = arr[i];
        }

        int[] array = integers.stream().mapToInt(value -> value).toArray();
        return array;
    }
}