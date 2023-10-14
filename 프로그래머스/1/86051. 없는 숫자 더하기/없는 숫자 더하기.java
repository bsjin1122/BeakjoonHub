/* 없는 숫자 더하기 */
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int sum = 0;
        
        for(int num : numbers){
            sum += num;
        }        
        answer = 45 - sum;
        return answer;
    }
}