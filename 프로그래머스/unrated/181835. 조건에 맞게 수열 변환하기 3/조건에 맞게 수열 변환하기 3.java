class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
         if (k % 2 == 0){//k가 짝수일때
            for(int i = 0; i<arr.length; i++){
                answer[i] = arr[i] + k;
            }
        }else {//k가 홀수일때
            for(int i = 0; i<arr.length; i++){
                answer[i] = arr[i] * k;
            }
        }//조건문 끝
        return answer;
    }
}