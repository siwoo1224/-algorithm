class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a > b){
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        // for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) 
        //   answer += i;
        return answer;
    }
}