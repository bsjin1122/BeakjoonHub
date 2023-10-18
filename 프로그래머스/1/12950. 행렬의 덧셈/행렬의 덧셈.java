/* 행렬의 덧셈 */
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // ex) [[1], [2]] -> arr1[1][2] 인 이중 배열, answer의 형태도 같아야 
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i = 0; i< arr1.length; i++){
            for(int k = 0; k < arr1[0].length; k++){
                answer[i][k] += (arr1[i][k] + arr2[i][k]);
            }
        }
        return answer;
    }
}