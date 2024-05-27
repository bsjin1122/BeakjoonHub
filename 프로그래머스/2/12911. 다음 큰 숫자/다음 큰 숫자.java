class Solution {
    public int solution(int n) {
        int answer = 0;
        String nResult = Integer.toBinaryString(n).replace("0", "");
        for (int i = n+1; i < 1000000; i++) {
            String iResult = Integer.toBinaryString(i).replace("0", "");
            if(iResult.equals(nResult)){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}