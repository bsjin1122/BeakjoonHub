import java.sql.SQLOutput;
import java.util.StringTokenizer;

class Solution {
    public int[] solution(String s) {
        StringBuilder sb = new StringBuilder(s);

        int count = 0;
        int zeroCount = 0;
        int[] answer = {count, zeroCount};

        // 반복문을 사용하여 문자열의 각 자리에서 "0"을 제거
        String originStr;
        String deleteStr;
        while(!sb.toString().equals("1")){
            originStr = sb.toString();
            deleteStr = deleteZero(sb.toString());
            zeroCount += originStr.length() - deleteStr.length();
            count++;
            sb.delete(0,originStr.length());
            String binStr = createBinary(deleteStr.length());
            sb.append(binStr);
        }
        answer[0] = count;
        answer[1] = zeroCount; 
        return answer;
    }
    public static String deleteZero(String string){
        String delete = string.replace("0", "");
        return delete;
    }
    public static String createBinary(int len){
        String binaryString = Integer.toBinaryString(len);
        return binaryString;
    }
}