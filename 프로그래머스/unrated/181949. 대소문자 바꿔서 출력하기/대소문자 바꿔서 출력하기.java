import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for(int i = 0; i< a.length();i++){
            char c = a.charAt(i);
            if (Character.isUpperCase(c)) { //문자가 대문자이면~
                answer += Character.toLowerCase(c);
            }else {
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);
        
        /*for (char b : a.toCharArray()){ // toCharArray() 문자를 배열로
            System.out.println(b);
        }*/
        
    }
}