import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;  // 원형 수열의 길이
        Set<Integer> sums = new HashSet<>();  // 연속 부분 수열의 합을 저장할 집합
        
        // 원형 수열을 다루기 위해 배열을 두 번 이어붙임
        int[] extendedElements = new int[2 * n];
        for (int i = 0; i < n; i++) {
            extendedElements[i] = elements[i];
            extendedElements[i + n] = elements[i];
        }
        
        // 길이 1부터 n까지의 모든 연속 부분 수열의 합을 계산
        for (int length = 1; length <= n; length++) {  // 첫 번째 포문: 부분 수열의 길이를 조절
            for (int start = 0; start < n; start++) {  // 두 번째 포문: 시작 인덱스를 조절
                int currentSum = 0;
                // 현재 길이의 부분 수열의 합을 계산
                for (int j = 0; j < length; j++) {  // 세 번째 포문: 현재 부분 수열의 각 원소에 접근
                    currentSum += extendedElements[start + j];
                }
                // 계산된 합을 집합에 추가하여 중복을 제거
                sums.add(currentSum);
            }
        }
        
        // 집합의 크기 반환 (중복되지 않는 연속 부분 수열의 합의 개수)
        return sums.size();

    }
}