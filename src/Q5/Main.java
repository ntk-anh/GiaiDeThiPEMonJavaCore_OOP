package Q5;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.print("Enter employee name: ");String name=sc.nextLine();
			System.out.print("Enter employee salary: ");double salary=sc.nextDouble();
			System.out.print("Enter employee revenue: ");double revenue=sc.nextDouble();
			System.out.print("Enter TC: ");int chon=sc.nextInt();
			Seller seller=new Seller(name,salary,revenue);
			
			System.out.println("OUTPUT: ");
		
			if (chon==1) {
				System.out.println(seller.toString()); 
			}else {
				System.out.println(seller.getSalary()); 
			}
		
		

	}

}
