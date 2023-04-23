package Refactoring_Hw07.before;

public class TestOrder {
    public static void main(String[] args) {
        Customer customer = new Customer("Customer", "Customeradress",10000);
        Customer customer2 = new Customer("Customer2", "Customeradress2",40000);
        Order order1 = new Order(customer,"item1", 12, false);
        Order order2 = new Order(customer2,"item2",13,true);

        Client client = new Client();
        client.makeOrder();
        client.makeOrder();
        client.cancelOrder();
    }
}
