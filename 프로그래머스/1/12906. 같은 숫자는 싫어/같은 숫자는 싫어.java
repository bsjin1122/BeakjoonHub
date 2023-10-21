/* 같은 숫자는 싫어 */
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i = 1; i< arr.length; i++){
            if(stack.peek() == arr[i]){
                continue;
            }else{
                stack.push(arr[i]);
            }
        }
        int[] answer = new int[stack.size()];
        
        // 스택의 내용을 ArrayList로 복사
        ArrayList<Integer> arrayList = new ArrayList<>(stack);
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}