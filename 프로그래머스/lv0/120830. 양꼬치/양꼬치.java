class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int 서비스 = (n / 10);
        int 양꼬치 = 0;
        int 음료 = 0;
        for(int i = 0; i < n; i++){
            양꼬치 = 양꼬치 + 12000;
        }
        k = k - 서비스;
        for(int j = 0; j<k; j++){
            음료 = 음료 + 2000;
        }
        answer = 양꼬치 + 음료;
        return answer;
    }
}