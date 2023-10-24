package KIOSK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("포장(1) 또는 매장(2)을 선택해주세요 ");
        int Choice = sc.nextInt();
        if (Choice == 1) {
            System.out.println("포장 주문을 시작합니다.");
            System.out.println("포장 주문하신 분들은 매장 식사 불가능 하십니다.");
        } else if (Choice == 2) {
            System.out.println("매장 주문을 시작합니다.");
        } else {
            System.out.println("잘못된 선택입니다. 프로그램을 종료합니다.");
            return;
        }

        MainMenu menu = new MainMenu();
        menu.showMainMenu();
    }
}
