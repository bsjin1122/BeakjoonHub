class Solution {
    public int[] solution(int n, long left, long right) {
        // right - left + 1 길이의 배열 생성 (잘라낸 배열의 크기)
        int length = (int)(right - left + 1);
        int[] answer = new int[length];

        // left부터 right까지 각 인덱스를 순회
        for (long i = left; i <= right; i++) {
            // row와 col 계산
            int row = (int)(i / n); // i를 n으로 나눈 몫이 행 인덱스
            int col = (int)(i % n); // i를 n으로 나눈 나머지가 열 인덱스

            // 해당 위치의 값을 계산하여 배열에 저장
            answer[(int)(i - left)] = Math.max(row, col) + 1;
        }

        return answer;
    }
}
