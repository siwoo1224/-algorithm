class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str2 = str2.replace(str1,"1");
        for(int i = 0; i<str2.length(); i++){
            if(str2.charAt(i) == '1'){
                answer = 1;
            }
        }
        return answer;
    }
}