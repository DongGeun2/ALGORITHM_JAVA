package 직사각형별찍기;

import java.util.Scanner;

public class programers_rectangular_star {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;
            
            for(int i = 0; i <= a; i++) {
                if(i == a) {
                    System.out.println();
                    i = 0;
                    ++count;
                    if(count == b) {
                        break;
                    }
                }
                System.out.print("*");
            }
            
            System.out.println("--------------------------------");
            
            for(int i = 0; i < b; i++) {
                for(int j = 0; j < a; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }
    }

