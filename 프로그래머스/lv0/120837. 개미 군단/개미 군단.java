class Solution {
    public int solution(int hp) {
        int answer = 0;

        for (int i = 0; 0 < hp; i++){
            if(hp % 5 == 0){
                answer += hp / 5;
                hp -= (hp / 5) * 5;
            }else{
                hp -= 3;
                answer += 1;
            }
        }
        if(hp < 0){
            answer += hp+2;
        }
        return answer;
    }
}