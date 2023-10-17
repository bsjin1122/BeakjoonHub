import java.util.*;
/* 문자열 내림차순으로 배치하기 */
class Solution {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        StringBuilder tmp = new StringBuilder(new String(charArr));
        String answer = tmp.reverse().toString();
        
        return answer;
    }
}