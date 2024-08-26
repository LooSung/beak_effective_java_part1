package chapter01.item01;

import java.util.*;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    private OrderStatus orderStatus;

    // 매서드의 Naming으로 정적으로 관리한다.
    // 생성자를 만들어서 관리보다는 정적 팩터리 메서드를 이용해보자.
    // public static Order(Product, product, boolean, prime) {
    // }
    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;

        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {
        // Enum을 Set, Map을 사용할려면, EnumSet, EnumMap을 이용하라 가시성, 메모리, 타입안정상, 시간복잡도(메모리 효율성)을 가질 수 있다.
        Order order = new Order();
        if (order.orderStatus == OrderStatus.DELIVERED) {
            System.out.println("delivered");
        }
    }

}
