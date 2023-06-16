import java.util.stream.IntStream;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            if(!IntStream.of(numbers).anyMatch(value -> value == finalI)){
                answer += i;
            }
        }
        return answer;
        
        // int sum = 45;
        // for (int i : numbers) {
        //     sum -= i;
        // }
        // return sum;
    }
}