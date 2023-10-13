class Solution {
    public int solution(int num) {
        int answer = 0;
        long collatzNum = 0;
        boolean flag = true;
        if(num == 1) return 0; //case 1: num이 0일 때
        
         collatzNum = (long) num ;
          while(collatzNum != 1){
            if(collatzNum % 2 == 0){
                collatzNum = collatzNum /2;
                answer++;
            }else{
                collatzNum = (collatzNum * 3) + 1;
                answer++;
            }
            if(answer > 500){
                return -1;
            }else{
                continue;
            } 
          }
          if(collatzNum == 1){
              return answer;
          }
        return answer;
        
    }
}

/*
if(num % 2 == 0){
                collatzNum = num / 2;
            }else if(num % 2 == 1){
                collatzNum = (num * 3) + 1;
            }
*/