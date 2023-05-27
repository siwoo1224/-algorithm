class Solution {
    public int solution(String str1, String str2) {
        String a = str1.replace(str2, "");
        if(str1.length() == a.length()){
            return 2;
        }else{
            return 1;
        }
    }
}