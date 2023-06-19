import java.util.stream.Stream;
class Solution {
    public boolean solution(int x) {
        int sum = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).sum();

//        if (x % sum == 0) {
//            return true;
//        }else {
//            return false;
//        }
        return (x % sum == 0) ? true : false;
    }
}