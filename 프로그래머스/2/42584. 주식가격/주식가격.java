import java.util.Stack;

public class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // 스택이 비어있지 않고, 현재 가격이 스택의 맨 위 가격보다 낮을 경우
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int idx = stack.pop(); // 스택에서 인덱스를 꺼냄
                answer[idx] = i - idx; // 가격이 떨어지지 않은 기간 계산
            }
            stack.push(i); // 현재 인덱스를 스택에 추가
        }

        // 스택에 남아 있는 인덱스 처리 (가격이 떨어지지 않았던 인덱스)
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = n - idx - 1; // 남아 있는 기간 계산
        }

        return answer;
    }
}
