import java.util.Arrays;
import java.util.Collections;
class Solution {
     public long solution(long n) {
        String[] split = Long.toString(n).split("");

        Arrays.sort(split, Collections.reverseOrder());
        String a = "";
        for (int i = 0; i < split.length; i++) {
            a += split[i];
        }

        return Long.parseLong(a);
    }
}