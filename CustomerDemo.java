package app;
import utility.*;
import java.util.*;

public class CustomerDemo {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Are you a registered customer..");
		System.out.println("Enter yes or no..");
		String type = sc.next();
		if(type == "yes") {
			System.out.println("Please enter your mail id, name and registration number..");
	        String mailid = sc.next();
	        String name = sc.next();
	        int reg_no = sc.nextInt();
	        RegCustomer r1 = new RegCustomer(mailid, name, reg_no);
	        r1.display();   
	        r1.giveDiscount(1750f);
		}   
		
		else {
			System.out.println("Please enter your mail id, name and..");
	        String mailid = sc.next();
	        String name = sc.next();
	        Customer c1 = new Customer(mailid, name);
	        c1.display(); 
	        c1.giveDiscount(1750f);
		}
			
	}
}
