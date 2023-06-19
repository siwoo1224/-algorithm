class Solution {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split("");
        int count = 0;
        for(int i=0; i<split.length; i++){
            if(split[i].equals(" ")){
                count = 0;
            }
            else if(count % 2 == 0){
                split[i] = split[i].toUpperCase();
                count++;
            }
            else if(count % 2 != 0){
                split[i] = split[i].toLowerCase();
                count++;
            }
            answer += split[i];
        }
        return answer;
    }
}