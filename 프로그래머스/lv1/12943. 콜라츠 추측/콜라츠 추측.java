class Solution {
    public int solution(int num) {
        int count = 0;
        int result = num;
        while (result != 1) {
            if (count >= 500) return -1;
            if (result % 2 == 0) {
                result /= 2;
            } else if (result % 2 == 1) {
                result = result * 3 + 1;
            }
            count++;
        }
        return count;
    }
}