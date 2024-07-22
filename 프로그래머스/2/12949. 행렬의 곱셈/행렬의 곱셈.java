import java.util.stream.IntStream;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        // 삼중 포문 대신 사용하기 
        IntStream.range(0, arr1.length).parallel().forEach(i-> {
            for(int j = 0; j < arr2[0].length; j++){
                for(int k = 0; k < arr1[0].length; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        });
            
        return answer;
    }
}