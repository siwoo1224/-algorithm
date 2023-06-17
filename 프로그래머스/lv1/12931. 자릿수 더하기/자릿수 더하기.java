import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = Integer.toString(n);
        String[] b = a.split("");
        for (int i = 0; i < a.length(); i++) {
            answer += Integer.parseInt(b[i]);
        }
        return answer;
    }
    
    public int solution2(int n) {
        int answer = 0;

        while (n != 0) {
            System.out.println(n);
            answer += n % 10;
            System.out.println(answer);
            n /= 10;
        }

        return answer;
    }
}