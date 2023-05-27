
import java.util.*;
class Solution {
    public int[] solution(String[] strlist) {
        int[] lenList = new int[strlist.length];
        
        for (int i = 0; i < strlist.length; i++) {
            lenList[i] = strlist[i].length();
        }
        return lenList;
    }
}