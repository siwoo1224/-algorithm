class Solution {
    public int[] solution(int[] num_list, int n) {
        
        // int size = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;
        // int[] answer = new int[size];
        
        int size = 0;
        for(int j = 0; j<num_list.length; j += n){
            size++;
        }
        int[] answer = new int[size];
        int a = 0;
        for(int i = 0; i<answer.length; i++){
            answer[i] = num_list[a];
            a += n;
        }
        return answer;
    }
}