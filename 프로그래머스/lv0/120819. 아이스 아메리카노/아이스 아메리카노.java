class Solution {
    public int[] solution(int money) {
        int 커피 = 5500;
        int[] answer = new int[2];
        
        answer[0] = money/커피;
        answer[1] = money%커피;
        
        
        return answer;
    }
}