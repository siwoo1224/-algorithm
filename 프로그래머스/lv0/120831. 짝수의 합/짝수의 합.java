class Solution {
    public int solution(int n) {
        int 짝수 = 0;
        int 홀수 = 0;
        
        for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) { // 짝수 조건식
				짝수 += i; // even = even + i;
			} else { // 홀수 조건식 : i%2==1 또는 i%2!=0;
				홀수 += i; // odd = odd + i;
			}
		}
        return 짝수;
    }
}