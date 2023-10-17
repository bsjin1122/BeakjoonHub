/* 약수의 개수와 덧셈 */
import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int k = left; k <= right; k++){
            int divisorNum = divisorFunc(k);
            if(divisorNum % 2 == 0 ){
                answer += k;
            }else{
                answer -= k;
            }
        }
        
        return answer;
    }
    
    public int divisorFunc(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i ==0) count++;
        }
        return count;
    } 
    
}