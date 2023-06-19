class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        if(answer.length == 0){
            answer = new int[]{-1};
        }else {
            int min = arr[0];
            for(int i=0;i<arr.length;i++) {
                if(min>arr[i]) {
                    min = arr[i];
                }
            }
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != min){
                    answer[j] = arr[i];
                    j++;
                }
            }
        }
        return answer;
    }
    // public int[] solution2(int[] arr) {
    //       if (arr.length <= 1) return new int[]{ -1 };
    //       int min = Arrays.stream(arr).min().getAsInt();
    //       return Arrays.stream(arr).filter(i -> i != min).toArray();
    // }
}