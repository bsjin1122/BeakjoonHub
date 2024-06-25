class Solution {
    public int solution(int[] arr) {
        int lcm = findLCM(arr);
        
        return lcm;
    }
    // 두 수의 GCD를 구하는 메서드 - 유클리드 호제법
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 두 수의 LCM을 구하는 메서드
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    // 여러 수의 LCM을 구하는 메서드
    public static int findLCM(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = lcm(result, numbers[i]);
        }
        return result;
    }
}