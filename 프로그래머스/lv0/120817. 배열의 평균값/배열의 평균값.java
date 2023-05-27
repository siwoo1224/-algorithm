class Solution {
    public double solution(int[] numbers) {
        double number = 0;
        for (int i = 0; i<numbers.length; i++){
            number += numbers[i];
        }
        return number /= numbers.length;
    }
}