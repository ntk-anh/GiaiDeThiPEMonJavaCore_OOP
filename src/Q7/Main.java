package Q7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.print("Enter customer name: ");String customerName=scanner.nextLine();
		System.out.print("Enter reservation code: ");String code=scanner.nextLine();
		System.out.print("Enter TC: ");int chon=scanner.nextInt();
		
		ReservationCode r=new ReservationCode(customerName, code);
		if (chon==1) {
			System.out.println("OUTPUT: ");
			System.out.println(r.toString());
		}else {
			System.out.println("OUTPUT: ");
			System.out.println(r.getCode());
		}
	}

}
