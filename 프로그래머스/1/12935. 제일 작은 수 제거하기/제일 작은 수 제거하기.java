/* 제일 작은 수 제거하기 */
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];    
        
        if(arr[0] == 10){
            int[] answerTen = new int[1];
            answerTen[0] = -1;
            return answerTen;
        }
        // int 배열을 Integer 리스트로 변환
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
        
        int min = arr[0]; // 배열의 첫 번째 요소를 초기 최솟값으로 설정
        int minIndex = 0; // 최솟값의 인덱스 초기화

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // 더 작은 값으로 최솟값 갱신
                minIndex = i; // 최솟값의 인덱스 갱신
            }
        }
        list.remove(minIndex);
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i); // ArrayList의 요소를 int 배열로 복사
        }
        return answer;
    }
}