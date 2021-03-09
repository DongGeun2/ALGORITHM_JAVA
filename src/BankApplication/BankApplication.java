package BankApplication;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);
    private static int count = 0;
    
    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("------------------------------------------------");
            System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택 >");
            
            int selectNo = scanner.nextInt();
            scanner.nextLine();
            
            if(selectNo == 1) {
                createAccount();
            }else if(selectNo == 2) {
                accountList();
            }else if(selectNo == 3) {
                deposit();
            }else if(selectNo == 4) {
                whithdraw();
            }else if(selectNo == 5) {
                System.out.println("프로그램 종료");
                return;
            }
        }
    }
    //계좌 생성
    private static void createAccount() {
    
        System.out.print("계좌번호 : ");
        String ano = scanner.nextLine();
        String PATTENANO = "([0-9]{3})-([0-9]{3})";
        while (!Pattern.matches(PATTENANO, ano)) {
            System.out.println("잘못입력 하셨습니다 ex) 111-111 ");
            System.out.print(">");
            ano = scanner.nextLine();
        }
        System.out.print("계좌주 : ");
        String owner = scanner.nextLine();
        System.out.print("초기입금금액 : ");
        int balance = scanner.nextInt();
        accountArray[count++] = new Account(ano,owner,balance);
        System.out.println("결과 : 계좌가 생성되었습니다.");
    }
    //계좌 목록보기
    private static void accountList() {
        System.out.println("------------");
        System.out.println("계좌목록");
        System.out.println("------------");
        for(int i = 0; i < count; i++) {
            System.out.println(accountArray[i].toString());
        }
        return;
    }
    //예금하기
    private static void deposit() {
        System.out.println("입금할 계좌의 번호를 입력해주세요 ");
        System.out.print(">");
        String ano = scanner.nextLine();
        System.out.println("입금할 금액을 입력해주세요 ");
        System.out.print(">");
        int money = scanner.nextInt();
        findAccount(ano,money,1);
    }
    //출금하기
    private static void whithdraw() {
        System.out.println("출금할 계좌의 번호를 입력해주세요 ");
        System.out.print(">");
        String ano = scanner.nextLine();
        System.out.println("출금할 금액을 입력해주세요 ");
        System.out.print(">");
        int money = scanner.nextInt();
        findAccount(ano,money,2);
    }
    
    //Account 배열에서 ano와 동일한 Account 객체 찾기
    private static int findAccount(String ano,int moneys, int num) {
        int money = moneys;
        for(int i = 0; i < count; i++) {
            if(accountArray[i].getAno().equals(ano) && num == 1) {
                accountArray[i].setdepositBalance(money);
                System.out.println(money+"원을 입금 하였습니다.");
            }else if(accountArray[i].getAno().equals(ano) && num == 2) {
                accountArray[i].setwithdrawBalance(money);
                System.out.println(money+"원을 출금 하였습니다.");
            }else {
                System.out.println("해당 계좌가 없습니다. 번호를 확인해주세요.");
            }
            
        }
        return money;
        //작성 위치
        //private static void deposit() 호출에서 이용
        //private static void whithdraw() 호출에서 이용
    }

}
