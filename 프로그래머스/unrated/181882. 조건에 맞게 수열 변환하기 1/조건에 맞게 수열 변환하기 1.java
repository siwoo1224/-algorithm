class Solution {
    public int[] solution(int[] arr) {
        int j =0;
                int[] answer = new int[arr.length];
        for(int i : arr){
            if(50 <= i && i % 2 == 0){
                answer[j] = i / 2;
            }else if(50 > i && i % 2 != 0){
                answer[j] = i * 2;
            }else {
                answer[j] = i;
            }
            j++;
        }
        return answer;
    }
}