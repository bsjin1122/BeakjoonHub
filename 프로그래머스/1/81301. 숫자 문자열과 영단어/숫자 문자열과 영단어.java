/*숫자 문자열과 영단어*/
import java.util.*;
class Solution {
   
    public int solution(String s) {
        String[] engNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int answer = 0;
        for(int i =0; i< engNum.length; i++){
            s = s.replace(engNum[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}