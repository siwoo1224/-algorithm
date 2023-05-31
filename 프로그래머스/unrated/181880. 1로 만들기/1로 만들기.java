class Solution {
    public int solution(int[] num_list) {
        int tot = 0;
        for(int i : num_list){
            int count = 0;
            while (i>1) {
                if(i % 2 == 0){
                    i = i / 2;
                    count++;
                }else {
                    i = (i - 1) / 2;
                    count++;
                }
                if(i==1){
                    break;
                }
            }
            tot += count;
        }
        return tot;
    }
}