class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=0; i < n+1; i++) {
            if(i % 2 == 0) {
            System.out.println(i);
            answer += i;
            }
        }
        
        
        return answer;
    }
}