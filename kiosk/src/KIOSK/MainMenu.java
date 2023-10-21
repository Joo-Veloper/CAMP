package KIOSK;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    List<FoodMenu> Coffee = new ArrayList<>();
    List<FoodMenu> Tea = new ArrayList<>();
    List<FoodMenu> Frappucino = new ArrayList<>();
    List<FoodMenu> Cake = new ArrayList<>();
    Order order = new Order();
    Scanner sc = new Scanner(System.in);

    public MainMenu() {
        Coffee.add(new FoodMenu("스타벅스 돌체 라떼", "5900", "깔끔한 무지방 우유와 부드러운 돌체 시럽이 들어간 음료로 달콤하고 진한 커피 라떼"));
        Coffee.add(new FoodMenu("화이트 초콜릿 모카", "5900", "에스프레소를 신선한 우유 그리고 얼음과 섞어 휘핑크림으로 마무리한 음료"));
        Coffee.add(new FoodMenu("카라멜 마끼야또", "5900", " 에스프레소를 부은 후 벌집 모양으로 카라멜 드리즐을 올린 달콤한 커피 음료"));
        Coffee.add(new FoodMenu("아메리카노", "4500", "스타벅스의 깔끔하고 강렬한 에스프레소를 가장 부드럽게 잘 느낄 수 있는 커피"));
        Coffee.add(new FoodMenu("카페모카", "5500", "휘핑크림으로 마무리한 음료로 진한 에스프레소와 초콜릿 맛이 어우러진 커피"));
        Coffee.add(new FoodMenu("카푸치노", "5000", "에스프레소에 따뜻한 우유와 벨벳 같은 우유 거품이 1:1 비율로 어우러져 마무리된 커피"));
        Coffee.add(new FoodMenu("카페라떼", "5000", "스팀 밀크를 만나 부드러워진 커피 위에 우유 거품을 살짝 얹은 대표적인 커피"));

        Frappucino.add(new FoodMenu("자바칩 프라푸치노", "6300", "커피, 모카 소스, 진한 초콜릿 칩이 입안 가득 느껴지는 스타벅스에서만 맛볼 수 있는 프라푸치노"));
        Frappucino.add(new FoodMenu("피스타치오 아보카도 초콜릿 프라푸치노", "6300", "오트를 사용해 더 맛있는 프라푸치노"));
        Frappucino.add(new FoodMenu("초콜릿 크림 칩 프라푸치노", "6300", "모카 소스와 진한 초콜릿 칩, 초콜릿 드리즐이 올라간 달콤한 크림 프라푸치노"));

        Tea.add(new FoodMenu("유자 민트티", "5900", "은은한 진저와 상쾌한 민트 티가 조화로운 유자 민트 티"));
        Tea.add(new FoodMenu("얼 그레이 티", "5300", "꽃향 가득한 라벤더와 베르가못 향이 진한 홍차와 블렌딩된 향긋한 블랙 티"));
        Tea.add(new FoodMenu("히비스커스 블렌드 티", "5500", "히비스커스, 사과, 파파야, 망고, 레몬그라스 등이 블렌딩된 상큼한 허브 티"));

        Cake.add(new FoodMenu("바질 토마토 크림치즈 베이글", "6600", "바질, 반건조 토마토, 크림치즈의 조합이 이색적인 베이글로 크림치즈가 듬뿍 샌드되어 든든하게 즐길 수 있습니다"));
        Cake.add(new FoodMenu("미니 클래식 스콘", "5600", "미니 사이즈의 담백한 스콘입니다."));
        Cake.add(new FoodMenu("바질 치즈 포카치아", "6600", "바질 페스토와 모짜렐라, 체다 & 고다 치즈가 채워진 촉촉하고 폭신한 식감의 포카치아입니다"));
    }

    public void showMainMenu() {
        System.out.println("**************************************** StarBucks ****************************************");
        System.out.println("*                          아래 메뉴판을 보고 메뉴를 골라 입력해주세요                           *");
        System.out.println("*                                      [MAIN MENU]                                         *");
        System.out.println("*                                     1. Coffee                                           *");
        System.out.println("*                                     2. Frappucino                                       *");
        System.out.println("*                                     3. Tea                                              *");
        System.out.println("*                                     4. Cake                                             *");
        System.out.println("*                                      [ORDER MENU]                                       *");
        System.out.println("*                              5. Order  - 장바구니를 확인 후 주문합니다.                     *");
        System.out.println("*                              6. Cancel - 진행중인 주문을 취소합니다.                        *");
        System.out.println("********************************************************************************************");

        System.out.println("번호 입력 ->");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                CoffeeMenu();
                break;
            case 2:
                FrappucinoMenu();
                break;
            case 3:
                TeaMenu();
                break;
            case 4:
                CakeMenu();
                break;
            case 5:
                OrderCheck();
                break;
            case 6:
                OrderCancel();
                break;
            default:
                break;
        }
    }

    ////////////////////////////////////////////////CoffeeMenu////////////////////////////////////////////////////
    public void CoffeeMenu() {
        for (int i = 0; i < Coffee.size(); i++) { // for 루프로 커피 목록 순회  (List = size)
            FoodMenu menu = Coffee.get(i);
            System.out.println((i + 1) + " " + menu.getName() + " | " + menu.getPrice() + " | " + menu.getDescription());
        }
        System.out.println("상품을 선택해 주세요");
        int choiceCoffee = sc.nextInt(); // 정수 입력
        // 유효성 검사
        if (choiceCoffee < 1 || choiceCoffee > Coffee.size()) {
            System.out.println("유효한 메뉴 번호를 입력하세요.");
            CoffeeMenu(); // 다시 메뉴를 표시하도록 재귀 호출
            return;
        }
        // 선택 상품
        FoodMenu selectedCoffee = Coffee.get(choiceCoffee);
        System.out.println("선택한 상품: " + selectedCoffee.getName() + " " + selectedCoffee.getPrice());
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1.확인        2.취소");

        int check = sc.nextInt();

        if (check == 1) {
            order.addBox(selectedCoffee);
            System.out.println(selectedCoffee.getName() + " 가 장바구니에 추가되었습니다.");
            System.out.println();
        } else if (check == 2) {
            System.out.println("장바구니 추가가 취소되었습니다.");
        } else {
            System.out.println("숫자를 잘못 입력하였습니다.");
        }
        showMainMenu();
    }



    //////////////////////////////////////////////////////FrappucinoMenu//////////////////////////////////////////////////////
    public void FrappucinoMenu() {
        for (int i = 0; i < Frappucino.size(); i++) {
            FoodMenu menu = Frappucino.get(i);
            System.out.println((i + 1) + " " + menu.getName() + " | " + menu.getPrice() + " | " + menu.getDescription());
        }
        System.out.println("상품을 선택해 주세요");
        int choiceFrappucino = sc.nextInt();

        if (choiceFrappucino < 1 || choiceFrappucino > Frappucino.size()) {
            System.out.println("유효한 메뉴 번호를 입력하세요.");
            CoffeeMenu();
            return;
        }

        // 선택 상품
        FoodMenu selectedFrappucino = Frappucino.get(choiceFrappucino);
        System.out.println("선택한 상품: " + selectedFrappucino.getName() + " " + selectedFrappucino.getPrice());
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1.확인        2.취소");

        int check = sc.nextInt();

        if (check == 1) {
            order.addBox(selectedFrappucino);
            System.out.println(selectedFrappucino.getName() + " 가 장바구니에 추가되었습니다.");
            System.out.println();
        } else if (check == 2) {
            System.out.println("장바구니 추가가 취소되었습니다.");
        } else
            System.out.println("숫자를 잘못 입력하였습니다.");
        showMainMenu();
    }

    ///////////////////////////////////////////////////////TeaMenu//////////////////////////////////////////////////////
    public void TeaMenu() {
        for (int i = 0; i < Tea.size(); i++) {
            FoodMenu menu = Tea.get(i);
            System.out.println((i + 1) + " " + menu.getName() + " | " + menu.getPrice() + " | " + menu.getDescription());
        }
        System.out.println("상품을 선택해 주세요");
        int choiceTea = sc.nextInt();

        if (choiceTea < 1 || choiceTea > Tea.size()) {
            System.out.println("유효한 메뉴 번호를 입력하세요.");
            CoffeeMenu();
            return;
        }

        // 선택 상품
        FoodMenu selectedTea = Tea.get(choiceTea);
        System.out.println("선택한 상품: " + selectedTea.getName() + " " + selectedTea.getPrice());
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1.확인        2.취소");

        int check = sc.nextInt();

        if (check == 1) {
            order.addBox(selectedTea);
            System.out.println(selectedTea.getName() + " 가 장바구니에 추가되었습니다.");
            System.out.println();
        } else if (check == 2) {
            System.out.println("장바구니 추가가 취소되었습니다.");
        } else
            System.out.println("숫자를 잘못 입력하였습니다.");
        showMainMenu();
    }

    //////////////////////////////////////////////////////CakeMenu//////////////////////////////////////////////////////
    public void CakeMenu() {
        for (int i = 0; i < Cake.size(); i++) {
            FoodMenu menu = Cake.get(i);
            System.out.println((i + 1) + " " + menu.getName() + " | " + menu.getPrice() + " | " + menu.getDescription());
        }
        System.out.println("상품을 선택해 주세요");
        int choiceCake = sc.nextInt();

        if (choiceCake < 1 || choiceCake > Cake.size()) {
            System.out.println("유효한 메뉴 번호를 입력하세요.");
            CoffeeMenu();
            return;
        }

        // 선택 상품
        FoodMenu selectedCake = Cake.get(choiceCake);
        System.out.println("선택한 상품: " + selectedCake.getName() + " " + selectedCake.getPrice());
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1.확인        2.취소");

        int check = sc.nextInt();

        if (check == 1) {
            order.addBox(selectedCake);
            System.out.println(selectedCake.getName() + " 가 장바구니에 추가되었습니다.");
            System.out.println();
        } else if (check == 2) {
            System.out.println("장바구니 추가가 취소되었습니다.");
        } else
            System.out.println("숫자를 잘못 입력하였습니다.");
        showMainMenu();
    }

    /////////////////////////////////////////OrderCheck///////////////////////////////////////////////////////////////////////////////////////////////////////
    public void OrderCheck() {
        System.out.println("주문 확인 해주세요?");


        List<FoodMenu> Box = order.getBox();
        for (int i = 0; i < Box.size(); i++) {
            FoodMenu menu = Box.get(i);
            System.out.println(menu.getName() + " " + menu.getPrice() + " " + menu.getDescription());
        }
        System.out.println("[Total]");
        System.out.println(order.totalPrice() + " 원 입니다."); //////////////////////////

        System.out.println("1.주문        2. 메뉴판");
        int check = sc.nextInt();

        if (check == 1) {
            OrderComplete();
        } else if (check == 2) {
            System.out.println(" 처음으로 돌아갑니다. ");
            showMainMenu();
        }
    }
    public void OrderComplete(){
        int orderNumber = order.getOrderNumber();

        System.out.println("주문이 완료되었습니다.");
        System.out.println("대기번호는 " + orderNumber + " 입니다.");
        System.out.println("3초후 메뉴판으로 돌아갑니다.");

        order.ClearBox();
        order.setOrderNumber(orderNumber + 1);

        try {
            for (int i = 3; i >0 ; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println(e);
        }
        showMainMenu();
    }

    public void OrderCancel() {
        System.out.println("주문 취소하시겠습니까?");
        System.out.println("1. 확인       2. 취소");
        int cancelNumber = sc.nextInt();

        if (cancelNumber == 1) {
            order.ClearBox();
            System.out.println("주문이 취소되었습니다.");
        } else if (cancelNumber == 2) {
            System.out.println("메뉴판으로 돌아갑니다.");
        }
        showMainMenu();
    }

}



