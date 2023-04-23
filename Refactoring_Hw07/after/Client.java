package Refactoring_Hw07.after;

import java.util.Scanner;

public class Client {
	private Department_manage Dept = new Department_manage();
	private Scanner scanner = new Scanner(System.in);
	private Customer customer1 = new Customer("Park", "Busan", 10000);

	public void makeOrder() {
		Dept.makeOrder(scanner,customer1,10);
	}
	
	public void cancelOrder() {
		Dept.cancelOrder(scanner);
	}
}
