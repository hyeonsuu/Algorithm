

class Solution {
     public String solution(int age) {
        String answer="";
        String eng = "abcdefg";
        String temp= Integer.toString(age);                 // 매개변수로 들어온 int 를 String으로 바꿈
         
         /*
            코드에서 49를 더하는 이유는 아스키(ASCII) 코드에 기인합니다. 
            아스키 코드에서 숫자 '1'은 49에 해당하고, '0'부터 '9'까지는 연속적으로 10개의 문자 코드가 할당되어 있습니다.
            따라서, 각 숫자에 49를 더함으로써 원래의 숫자를 나타내는 문자의 다음 아스키 코드에 해당하는 문자로 변환되는 것입니다. 
            예를 들어, '0'에 49를 더하면 '1'이 되고, '1'에 49를 더하면 '2'가 됩니다.
         */
         
         for(int i=0; i<temp.length(); i++) {            // String의 크기만큼 for문
                answer+=(char) ((char) temp.charAt(i) + 49);  // String의 i번째 리터럴에 49를 더한 char값을 넣음
            }
            return answer;
    }
}
