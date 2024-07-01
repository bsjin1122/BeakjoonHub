import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        // 배열을 작은 순서대로 정렬
        Arrays.sort(people);
        // 가장 가벼운 사람의 인덱스
        int light = 0;
        // 가장 무거운 사람의 인덱스
        int heavy = people.length - 1;
        
         // 두 포인터를 사용하여 처리
        while (light <= heavy) {
            // 가장 가벼운 사람과 가장 무거운 사람을 함께 태울 수 있으면
            if (people[light] + people[heavy] <= limit) {
                light++;
                heavy--;
            } else {
                // 함께 태울 수 없으면 가장 무거운 사람만 태움
                heavy--;
            }
            // 구명보트 사용 카운트 증가
            answer++;
        }
        return answer;
    }
}