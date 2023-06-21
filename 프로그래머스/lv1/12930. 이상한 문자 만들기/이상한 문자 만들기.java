class Solution {
    static public String solution(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0) {
                    sb.append(Character.toUpperCase(word.charAt(i)));

                } else if (i % 2 == 1) {
                    sb.append(Character.toLowerCase(word.charAt(i)));

                }
            }
            sb.append(" ");
        }
        if(sb.length() != s.length()){
            sb.setLength(sb.length() - 1);
            int x = s.length() - sb.length();
            for (int i = 0; i < x; i++) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}