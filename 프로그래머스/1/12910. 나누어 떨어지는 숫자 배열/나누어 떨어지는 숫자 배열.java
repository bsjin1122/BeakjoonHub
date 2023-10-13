/* 나누어 떨어지는 숫자 배열 */
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answerList = new ArrayList<>();
        for(int num : arr){
            if(num % divisor == 0){
                answerList.add(num);
            }
        }
        if(answerList.size() == 0) answerList.add(-1); // element가 하나도 없을 때
        Collections.sort(answerList); // ArrayList를 정렬
    
        // ArrayList의 크기만큼 int 배열 생성
        int[] answer = new int[answerList.size()];

        // ArrayList의 요소를 int 배열로 복사
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}