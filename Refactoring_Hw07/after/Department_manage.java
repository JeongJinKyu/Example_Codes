package Refactoring_Hw07.after;

import java.util.Scanner;

public class Department_manage {
    private OrderDepartment orderDept = new OrderDepartment();
    private BillingDepartment billingDept = new BillingDepartment();
    private ShippingDepartment shippingDept = new ShippingDepartment();
    private Order order;

    public void makeOrder(Scanner scanner,Customer customer1,int threshold){
        String item = scanner.next();
        int quantity = scanner.nextInt();

        try {
            order = orderDept.makeOrder(customer1, item, quantity, quantity >= threshold);
            int price = order.getPrice();
            if ( billingDept.makePayment(order, price) )
                shippingDept.startShipping(order);
            else {
                order.setPending(true);
                throw new NotEnoughBalanceException(order);
            }
        }
        catch ( NotEnoughBalanceException e ) {
            System.out.println("You have not enough money to buy " + order.getItem());
        }
    }

    public void cancelOrder(Scanner scanner){
        System.out.println("Are you sure to cancel? ");
        String answer = scanner.next();
        if ( ! answer.toUpperCase().equals("Y") ) return;

        if ( orderDept.cancelOrder(order) ) {
            billingDept.refund(order);
            shippingDept.stopShipping(order);
        }
        else {
            System.out.println("The order cannot be cancelled");
        }
    }
}
