class Solution {
    public int solution(String my_string) {
        int b = 0;
        for (int i = 0; i < my_string.length(); i++) {
           if( 49 <= my_string.charAt(i) && my_string.charAt(i) <= 57){
//               System.out.println(my_string.charAt(i) + ":::=>" + (int)my_string.charAt(i));
//               System.out.println(Integer.parseInt(String.valueOf(my_string.charAt(i))));
               b += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }
        return b;
    }
}