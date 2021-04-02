package 다리를지나는트럭;

import java.util.*;

class Solution {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int sum = 0;
		int index = 0;
		Deque<Integer> q = new ArrayDeque<>();

		for (int i = 0; i < bridge_length; i++) {
			q.add(0);
		}
		
		
		while(index < truck_weights.length) {
			sum = sum - q.pop();
			if(weight - sum >= truck_weights[index]) {
				q.add(truck_weights[index]);
				sum = sum + truck_weights[index];
				index ++;
			}else {
				q.add(0);
			}
			answer ++;
			
		}
		

		
		return answer + bridge_length;
	}
}

public class programers_bridge {

	public static void main(String[] args) {
		Solution s = new Solution();
		// 5	5	[2, 2, 2, 2, 1, 1, 1, 1, 1]	19
		// 2 10   7,4,5,6
		int a = s.solution(5, 5, new int[] { 2, 2, 2, 2, 1, 1, 1, 1, 1 });

		System.out.println(a);
	}

}

