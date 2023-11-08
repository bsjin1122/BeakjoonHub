/*의상*/
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1; // 0 *= i 방지용
        
        // 옷 종류별 개수 
        HashMap<String, Integer> map = new HashMap<>();
        for(String[] item: clothes){
            map.put(item[1], map.getOrDefault(item[1], 0) +1);
        }
        // 모든 옷 조합의 수 
        for(Integer i: map.values()){
            answer *= i.intValue() + 1;
        }
        return answer -1; // 모든 종류의 옷을 입지 않은 경우 빼기
    }
}