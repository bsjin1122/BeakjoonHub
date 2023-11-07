/* 폰켓몬 */
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // HashSet을 생성하고 배열의 요소를 HashSet에 추가합니다.
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        if(set.size() == 1){
            answer = 1;
        }
        
        if(set.size() <= nums.length/2){
            answer = set.size();
        }else if(set.size() > nums.length/2){
            answer = nums.length/ 2;
        }
        return answer;
    }
}