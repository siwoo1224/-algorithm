import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] array = {};
        array =  Arrays.stream(arr).filter(value -> value % divisor == 0).sorted().toArray();
        if(array.length == 0){
            array = new int[]{-1};
        }
        return array;
    }
}