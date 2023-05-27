import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String replace = my_string.replaceAll("[^0-9]","");
        int[] a = new int[replace.length()];
        for (int i = 0; i<replace.length(); i++){
            a[i] = Integer.parseInt(String.valueOf(replace.charAt(i)));
        }
        Arrays.sort(a);
        return a;
    }
}