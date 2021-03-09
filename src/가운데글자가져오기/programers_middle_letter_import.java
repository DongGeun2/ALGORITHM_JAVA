package 가운데글자가져오기;

class Solution2{
    public String solution(String s) {
        String answer = "";
//        if(s.length() % 2 ==0) {
//            answer = s.substring(s.length()/2, s.length()/2+2);
//        }else {
//            answer = s.substring(s.length()/2, s.length()/2+1);
//        }
//        
        return answer = s.length() % 2 ==0?answer = s.substring(s.length()/2-1, s.length()/2+1):
            s.substring(s.length()/2, s.length()/2+1);
        
    }
}
public class programers_middle_letter_import {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("qwer"));
    }
}
