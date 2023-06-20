class Solution {
    
    public int solution1(int n) {
        String result = "";

//        N진법 -> 10진법
//        Integer.parseInt(i, N);
//        10진법 -> N진법
//        String binaryString = Integer.toBinaryString(n);// 2진법
//        System.out.println(binaryString);
//        String octalString = Integer.toOctalString(n);// 8진법
//        System.out.println(octalString);
//        String hexString = Integer.toHexString(n);// 16진법
//        System.out.println(hexString);

        while (n != 0) {
            result += n % 3;
            n /= 3;
        }
        return Integer.parseInt(result, 3);
    }
    
    public int solution(int n) {
        String jinsu = Integer.toString(n, 3); // 10 => 3
        int length = jinsu.length();
        String result = "";
        for (int i = length -1; i >= 0; i--) result += jinsu.charAt(i);

        return Integer.parseInt(result, 3);
    }
}