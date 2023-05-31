class Solution {
    public int solution(int[] num_list) {
        String a = "";
        String b = "";
        for (int i = 0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0){
                a += String.valueOf(num_list[i]);
//                a += num_list[i] + "";
            }else {
                b += String.valueOf(num_list[i]);
//                a += num_list[i] + "";
            }
        }
//        for(int j : num_list){
//            if(num_list[i] % 2 == 0){
//                a += String.valueOf(j);
//                a += j + "";
//            }else {
//                b += String.valueOf(j);
//                a += j + "";
//            }
//        }
        
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}