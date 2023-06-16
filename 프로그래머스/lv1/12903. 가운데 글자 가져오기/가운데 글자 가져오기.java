class Solution {
    public String solution(String s) {
        String answer = "";
        int l = s.length() / 2;
        if(s.length() % 2 == 0){
            answer = s.substring(l -1, l+1);
        }else {
            answer = s.substring(l, l+1);
        }
        return answer;
    }
}