class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] sCharArray = s.toCharArray();
        int pCount = countChar(sCharArray, 'p', 'P'); //메서드 호출 
        int yCount = countChar(sCharArray, 'y', 'Y');
        
        if(pCount == yCount){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
    // char[] 안에 특정 문자의 개수 구하는 메서드
    public static int countChar(char[] sCharArray, char searchChar, char searchChar2){
        int count = 0;
        for (int i = 0; i < sCharArray.length; i++) {
            if (sCharArray[i] == searchChar || sCharArray[i] == searchChar2) {
                count++;
            }
        }
        return count;
    }
}