package KIOSK;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<FoodMenu> Box;
    private int orderNumber;

    public Order() {
        Box = new ArrayList<>();
        orderNumber = 1;
    }

    public void  addBox(FoodMenu menu){
        Box.add(menu);
    }

    public List<FoodMenu> getBox(){
        return Box;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void ClearBox(){ // 취소 기록 삭제
        Box.clear();
    }
    public void setOrderNumber(int orderNumber){
        this.orderNumber = orderNumber;
    }

    public double totalPrice(){
        double total = 0; /// 변수 0 초기화
        for (FoodMenu menu : Box){
            String priceWithSymbol = menu.getPrice();
            String priceString = priceWithSymbol.replaceAll("[^0-9]+", ""); // 숫자이외 모든 문자 제거
            total += Double.parseDouble(priceString);
        }
        return total;
    }
}
