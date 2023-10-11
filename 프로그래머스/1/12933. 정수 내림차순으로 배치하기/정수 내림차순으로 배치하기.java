/* 정수 내림차순으로 배치하기 */
import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Integer> numbersArray = new ArrayList<>();
        char[] numberChar = Long.toString(n).toCharArray();
        for (char c : numberChar) {
            int charToInt = c - '0';
            numbersArray.add(charToInt);
        }
        // ArrayList 정렬
        Collections.sort(numbersArray);
      
        StringBuilder result = new StringBuilder();
        for (Integer num : numbersArray) {
            result.append(num);
        }
       

        String combinedString = result.reverse().toString();
        answer = Long.parseLong(combinedString);
       
        
        return answer;
    }
}