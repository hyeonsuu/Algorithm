class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int i=0; i < my_string.length(); i++) {
            // 문자열의 길이 = 5개
            for(int j=0; j < n; j++) {
                // 반복해야할 n 크기 = 3
            // charAt -> 스트링을 한글자씩 출력하게 하는 함수
               answer += my_string.charAt(i);
                // 세번씩 반복해서 출력
            }
                
        }
        return answer;
    }
}