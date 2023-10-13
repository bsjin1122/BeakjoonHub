/* 핸드폰 번호 가리기 */
class Solution {
    public String solution(String phone_number) {
        StringBuilder stringBuilder = new StringBuilder(phone_number);
        int number = phone_number.length() - 4; //뒤에서부터 count 
        String privateCode = "*".repeat(number); // 반복될 * 문자열
        stringBuilder.replace(0, number, privateCode); // replace로 대체 
        return stringBuilder.toString();
    }
}