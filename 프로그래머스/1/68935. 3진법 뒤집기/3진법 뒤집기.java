/*3진법 뒤집기*/
class Solution {
    public int solution(int n) {
        String baseTen = trinary(n);
        int answer = decimal(baseTen);
        
        return answer;
    }
    public static String trinary(int n){ // 3진수로 바꾸는 메서드
        // ex) case1: 45 / 3 = 15 ... 0
        // case 2: 15 / 3 = 5 ... 0
        // case 3: 5 / 3 = 1 ... 2
        // case 4: 1 / 3 = 0 ... 1
        // 3진수는 1200 이지만, 
        // 어차피 과정에서 앞뒤 반전을 해야하니 0021 순으로 문자열 만들기 
        String result = "";
        while(n > 0){
            int tmp = n % 3; 
            result += tmp;
            n =  n / 3;
        }        
        return result;
    }
    public static int decimal(String result){ // 10진수로 바꾸는 메서드
        int returnInt = 0;
        int power = 0;
        for(int i = result.length()-1; i >= 0; i--){
            int digit = result.charAt(i) - '0'; // 문자 char를 int로
            returnInt += digit * (int)(Math.pow(3, power)); 
            power++; //자릿수에 따른 지수 변화 
        }
        return returnInt;
    }
}