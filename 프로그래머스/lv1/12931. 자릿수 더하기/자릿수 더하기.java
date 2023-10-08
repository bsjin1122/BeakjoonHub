/* 자릿수 더하기 */
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] intToString = String.valueOf(n).toCharArray();
        for(char x : intToString){
            int num = x - '0'; 
            //char 문자를 int로 변환하기 위해 각 문자에서 '0' 문자의 유니코드 코드 포인트를 뺍니다. 
            answer += num;
        }
        return answer;
    }
}