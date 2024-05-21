import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class Solution{
    public int solution(int []A, int []B){
        int answer = 0;

        // PriorityQueue를 역순 비교자로 초기화
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(Collections.reverseOrder());

        // 모든 요소를 PriorityQueue에 추가
        for (int num : A) {
            priorityQueue.add(num);
        }
        for (int num : B) {
            priorityQueue2.add(num);
        }

        // PriorityQueue에서 요소를 하나씩 꺼내어 배열에 다시 넣기
        for (int i = 0; i < A.length; i++) {
            A[i] = priorityQueue.poll();
            B[i] = priorityQueue2.poll();
        }
        for (int k = 0; k < A.length; k++) {
            answer += A[k] * B[k];
        }
        
        return answer;
    }
}