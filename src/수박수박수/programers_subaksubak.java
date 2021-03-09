package 수박수박수;
class Solution3 {
    public String solution(int n) {
        String answer = "";
        for(int i = 0; i< n; i++) {
            if(i % 2 == 1) {
                answer += "박";
            }else {
                answer += "수";
            }
        }
        
        return answer;
    }
}


public class programers_subaksubak {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.solution(4));
        
        
    }

}
