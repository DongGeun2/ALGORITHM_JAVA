package 약수의합;

class Solution_numberSum {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }
}


public class programers_numberSum {

    public static void main(String[] args) {
        Solution_numberSum s = new Solution_numberSum();
        System.out.println(s.solution(12));

    }

}
