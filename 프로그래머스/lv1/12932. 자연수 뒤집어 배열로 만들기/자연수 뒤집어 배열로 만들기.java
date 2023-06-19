class Solution {
    public int[] solution2(long n) {
        int cnt = 0;
        long a = n;
        while (a != 0) {
            a /= 10;
            cnt++;
        }
        int[] answer = new int[cnt];

        for (int i = 0; n != 0; i++) {
            answer[i] = (int) n % 10;
            n /= 10;
        }
        return answer;
    }
    
    public int[] solution(long n) {

        long num = n;
        int cnt = 0;

        while(num != 0){
            num /= 10;
            cnt++;
        }

        int[] answer = new int[cnt];

        num = n;
        for(int i = 0; num != 0; i++){
            answer[i] = (int)(num % 10);
            num /= 10;
        }

        return answer;
    }
}