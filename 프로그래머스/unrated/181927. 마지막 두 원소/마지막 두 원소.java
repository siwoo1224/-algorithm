class Solution {
    public int[] solution(int[] num_list) {
        int a = num_list.length;
        int[] answer = new int[a+1];
        int last = 0;
        
        if(num_list[a-1] > num_list[a-2]){
            last = num_list[a-1] - num_list[a-2];
        }else {
            last = num_list[a-1] * 2;
        }
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        answer[answer.length - 1] = last;
        return answer;
    }
}