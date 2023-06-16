class Solution {
    public long solution(int price, int money, int count) {
        long a = 0; // 내가 사용한 총 금액
        long answer = 0;
        for (int i = 1; i <= count; i++) {
            a += i * price;
        }
        if(a > money){
            answer = a - money;
        }
        return answer;
    }
}