package 오픈채팅방_2019카카오;

import java.util.*;

public class Solution_KaKao {
	 public String[] solution(String[] record) {
		   
	       Map<String, String> User = new HashMap<String, String>();
	       List<String> Users = new ArrayList<String>();
	       
	       for(int i = 0; i < record.length; i++) {
	        	
	        	String[] userinfo = record[i].split(" ");
	        	
	        	if(userinfo.length > 2) {
	        		User.put(userinfo[1], userinfo[2]);
	        	}
	        	
	        }
	        
	       for(int i = 0; i < record.length; i++ ){
	    	   
	    	   String[] userinfo = record[i].split(" ");
	    	   
	       }
	       
	       
	       for(int i = 0; i < record.length; i++) {
	        	
	        	String[] userinfo = record[i].split(" ");
	        	
	        	if(userinfo[0].equals("Enter")) {
	        		if(User.containsKey(userinfo[1])) {
	        			Users.add(User.get(userinfo[1]) + "님이 들어왔습니다.");
	        		}else {
	        			Users.add(userinfo[1] + "님이 들어왔습니다.");
	        			
	        		}
	        		
	        	}else if(userinfo[0].equals("Leave")){
	        		Users.add(User.get(userinfo[1]) + "님이 나갔습니다.");
	        	}
	        	
	        }
	        
	        String[] answer = new String[Users.size()];
	        for(int i = 0; i < Users.size(); i++) {
	        	answer[i] = Users.get(i); 
	        }
	        
	        
	        return answer;
	    }
	 
	 
	 public static void main(String[] args) {
		 Solution_KaKao s = new Solution_KaKao();
	    	
	    	String[] data = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
	    	
	    	String[] a = s.solution(data);
	    	
	    	for(String b : a) {
	    		System.out.println(b);
	    	}
	    	
	    	System.out.println("------------------------");
	    	
	    	String[] List = {"Enter uid0606 Gimoi", "Enter uid4567 Prodo", "Leave uid0606", "Enter uid1234 Prodo", "Change uid1234 OhYeah"};
	        String[] c = s.solution(List);
	        
	        for(String b : c) {
	    		System.out.println(b);
	    	}
	        
	        System.out.println("------------------------");
	        
	        String[] d = {"Enter uid0606 Gimoi", "Enter uid4567 Prodo", "Leave uid0606", "Enter uid0606 Prodo", "Change uid1234 OhYeah"};
	        String[] w = s.solution(d);
	        
	        for(String b : w) {
	    		System.out.println(b);
	    	}
	        
		 
	}
	    
	 
}



