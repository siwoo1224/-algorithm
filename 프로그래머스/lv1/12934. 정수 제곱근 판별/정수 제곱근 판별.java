class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);

        if(sqrt == (int) sqrt){
            double v = sqrt + 1;
            answer = (long) (v * v);
        }else {
            answer = -1;
        }

        return answer;
    }
}