import java.lang.Math;

class Solution {
    public int solution(int n) {
        if((int)(Math.sqrt(n)) == Math.sqrt(n)){
            return 1;
        }else{
            return 2;
        }
        
        //다른풀이
        /*int answer = 2;
        for (int i = 1; i < n; i++) {
            if (n%i == 0 && n == i*i) answer = 1;
        }
        return answer;*/
    }
}