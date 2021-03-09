package 두정수의합;

class solution{
    public long solution(int a, int b) {
        long answer = 0;
        for(int i = a; i <= b; i++) {
            answer += i;
        }
        if(answer == 0){
            for(int i = b; i <= a; i++) {
            answer += i;
            }
        }
        return answer;
    }
}

public class programers_sum_between_two_integers {
    public static void main(String[] args) {
        solution s = new solution();
        System.out.println(s.solution(5, 3));
    }
}
