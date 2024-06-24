import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop(); // 스택에서 같은 문자 제거
            } else {
                stack.push(ch); // 스택에 문자 추가
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}