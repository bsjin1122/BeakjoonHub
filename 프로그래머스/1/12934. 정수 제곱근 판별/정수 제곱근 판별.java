/* 정수 제곱근 판별 */
class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrtInt = Math.sqrt(n);
        //(힌트얻음)
        // 숫자의 제곱근을 계산하고 그 결과가 정수인지 확인 
        // 이를 위해 Math 클래스의 sqrt 메서드를 사용하고, 
        // 그 결과를 소수 부분을 제거하고 정수 부분만 남기는 방식으로 확인할 수 있다.
        if (sqrtInt == (int) sqrtInt) {
            answer = (long) Math.pow(sqrtInt +1, 2);
        } else {
            answer = -1;
        }
        
        return answer;
    }
}