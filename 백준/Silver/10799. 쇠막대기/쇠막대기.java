import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        int result = 0;

        Stack<Character> stack = new Stack<>();

        for(int i =0; i<input.length(); i++){
            if(input.charAt(i) == '('){
                stack.push('(');
            }else if(input.charAt(i)==')'){
                stack.pop();
            }

            if(i >0){
                if(input.charAt(i-1) == '(' && input.charAt(i) ==')'){
                    result += stack.size();
                }else if(input.charAt(i-1) == ')' && input.charAt(i) == ')'){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
