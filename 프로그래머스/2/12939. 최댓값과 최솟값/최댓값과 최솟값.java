import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
       
        // 콤마를 기준으로 문자열 분할
        String[] splitStr = s.split(" ");
        int[] intArray = new int[splitStr.length];
        for(int i = 0; i< splitStr.length; i++){
            intArray[i] = Integer.parseInt(splitStr[i]);
        }
        Arrays.sort(intArray);
        answer = intArray[0] + " " + intArray[intArray.length-1];

        return answer;
    }
}