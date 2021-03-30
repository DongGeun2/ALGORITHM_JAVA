package 완주하지못한선수;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int count = 0;
        boolean s = true;
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        while(s) {
        	if(!participant[count].equals(completion[(count == completion.length)?count-1:count])) {
        		answer = participant[count];
        		s = false;
        	}else {
        		count++;
        	}
        }
        
        return answer;
    }
}


public class programers_participant {
	public static void main(String[] args) {
		Solution s = new Solution();
		
		String[] c = {"leo", "kiki", "eden"}; 
		String[] y = {"eden", "kiki"};
		
		String[] d = {"mislav", "stanko", "mislav", "ana"};
		String[] o = {"stanko", "ana", "mislav"};
		
		String a = s.solution(d, o);
		System.out.println(a);
	}
}
