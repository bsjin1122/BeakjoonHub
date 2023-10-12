class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        char[] xArray = String.valueOf(x).toCharArray();
        int count = 0;
        for(char c : xArray){
            count += c - '0';
        }
        if(x % count == 0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}
//      다른 사람의 푼 답
//      int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
//      return x % sum == 0;