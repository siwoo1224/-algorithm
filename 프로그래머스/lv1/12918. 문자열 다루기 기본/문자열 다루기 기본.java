class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int size = s.length();
        String a = "^[0-9]*$";
        if(size == 4 || size == 6){
           answer = s.matches(a);
        }else answer = false;
        return answer;
    }
}