class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = fibonacci(n);
        return answer;
    }
    public static int fibonacci(int n){
        // 나머지 연산의 특징: (a+b) % m = ((a % m) + (b % m)) % m
        int m = 1234567;
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b % m;
            b = temp % m;
        }
        return b % m;
    }
    // public static int fibonacci(int n){
    //     if (n <= 1) { // 예외상황을 적어놓지 않으면 무한 반복이 된다. 
    //         return n;
    //     }
    //     return fibonacci(n-1) + fibonacci(n-2);
    // }
    
}