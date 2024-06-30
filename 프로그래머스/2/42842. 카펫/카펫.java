// 노란색 격자가 위치하기 위해선, 가로3/세로3 이상
// 1. 카펫 사이즈의 경우의 수를 구해야 한다. (0 x 0)
// - brown 격자 수 + yellow 격자 수의 약수를 구한다. 
// - brown 10, yellow 2 라고 가정, (1, 12), (2, 6), (3, 4), (4, 3), (6, 2), (12, 1)
// 2. 가로 >= 세로의 길이 -> (4, 3) (6, 2) (12, 1)
// 3. 가운데 노란색 격자가 위치하기 위해선, 최소 가로세로 3이상이므로 2번째 3번째는 걸러진다. 
// 4. yellow 개수만큼 노란색 격자가 가운데 위치할 수 있는지 구해야 한다. 
// (가로 - 2) * (세로 -2) = yellow 개수

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for (int i = 3; i < sum; i++) {
            int j = sum / i;
            
            if (sum % i == 0 && j >= 3) {
                int col = Math.max(i, j);
                int row = Math.min(i, j);
                int center = (col - 2) * (row - 2);
                
                if (center == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                    return answer;
                }
            }
        }
        return answer;
    }
}