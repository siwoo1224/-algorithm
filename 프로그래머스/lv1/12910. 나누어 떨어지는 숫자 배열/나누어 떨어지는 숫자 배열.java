import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int[] array = Arrays.stream(arr).filter(value -> value % divisor == 0).sorted().toArray();
        int[] answer = {-1};
        return (array.length != 0 ) ? array : answer;
    }
}