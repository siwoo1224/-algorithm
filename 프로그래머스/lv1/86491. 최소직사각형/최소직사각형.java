class Solution {
    public int solution(int[][] sizes) {
        int maxw = 0; //가로
        int maxh = 0; //세로
        int length = sizes.length;
        for (int i = 0; i < length; i++) {
            int w = Math.max(sizes[i][0],sizes[i][1]);
            int h = Math.min(sizes[i][0],sizes[i][1]);
            maxw = Math.max(w, maxw);
            maxh = Math.max(h, maxh);
        }
        return maxh * maxw;
    }
}