/* 최대공약수와 최소공배수 */
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int tmp = 0;
        int gcd = 1;
        int bigger = 0;
        
        if(n > m){
            tmp = m; bigger = n;
        }else {
            tmp = n; bigger = m;
        }
        while(bigger % tmp != 0){
            
            gcd = bigger % tmp;
            bigger = tmp;
            tmp = gcd;
        }
        if(bigger % tmp == 0){
             answer[0] = tmp;
             answer[1] = (n * m) / tmp;
             return answer;       
         }
        answer[0] = gcd; // 최대공약수
        
        int lcm = 0; // 최소공배수
        lcm = (n * m) / gcd;
        answer[1] = lcm; 
        
        
        return answer;
    }
}