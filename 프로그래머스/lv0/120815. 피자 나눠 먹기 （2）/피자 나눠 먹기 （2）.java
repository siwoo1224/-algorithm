class Solution {
    public int solution(int n) {
        int answer = 6;
        for (int i = 0; answer%n != 0; i++ ){
            answer += 6;
        }
        return answer/6;
    }
}