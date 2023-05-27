class Solution {
    public int solution(int n) {
        String a = Integer.toString(n);
        int b = 0;
        for(int i = 0; i < a.length(); i++) {
            b += Integer.parseInt(a.substring(i,i+1));
        }
        return b;
    }
}