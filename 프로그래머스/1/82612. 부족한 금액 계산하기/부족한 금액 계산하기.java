/* 부족한 금액 계산하기 */
class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long fee = 0;
        for(int i = 1; i <= count; i++){ // 3, 6, 9, 12 순으로 증가하기 때문에 
            fee += (price * i); // 해당하는 값을 더해줌
        }
        if(fee != (long) money){
            answer = fee - money;
        }else if(fee < (long) money){
            return 0;
        }else if(fee == (long) money){
            answer = fee - money;
        }
        return answer;
    }
}