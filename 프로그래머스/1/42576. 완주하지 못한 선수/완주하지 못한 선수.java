/*완주하지 못한 선수*/
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 참가자 목록과 완주자 목록의 빈도수를 맵에 저장
        Map<String, Integer> participantMap = new HashMap<>();
        for (String p : participant) {
            //getOrDefault 해당 키가 맵에 존재하지 않을 때 default값 반환
            participantMap.put(p, participantMap.getOrDefault(p, 0) + 1); // 하나씩 더해주고,
        }
        for (String c : completion) {
            participantMap.put(c, participantMap.get(c) - 1); // 같은거 있으면 하나씩 차감
        }

        // 빈도수가 0이 아닌 참가자를 찾음
        String incompleteRunner = null;
        for (Map.Entry<String, Integer> entry : participantMap.entrySet()) {
            if (entry.getValue() != 0) {
                incompleteRunner = entry.getKey();
                break;
            }
        }

        // 완주하지 못한 참가자 출력
        return incompleteRunner;
    }
}