import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);

		int n = citations.length; // 논문의 개수

		// Step 2: H-Index를 찾습니다
		for (int i = 0; i < n; i++) {
			int h = n - i; // 현재 논문보다 인용 횟수가 많은 논문의 수
			if (citations[i] >= h) {
				return h; // 조건을 만족하는 최대 h 값을 반환합니다
			}
		}

		// 조건을 만족하는 H-Index를 찾지 못한 경우 0을 반환합니다
		return 0;
    }
}