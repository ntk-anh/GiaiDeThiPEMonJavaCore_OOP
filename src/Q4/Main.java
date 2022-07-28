package Q4;

import java.util.Scanner;

public class Main {

	public static Scanner sc= new Scanner(System.in);
	public static MyHouse myHouse=new MyHouse();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1. TC = 1 - test getPricetoUSD()");
		System.out.println("2. TC = 2 - test getCode()");
		System.out.print("Enter TC: ");String chon=sc.nextLine();
		if (chon.equals("1")) {
			System.out.print("Enter price in VND: ");
			myHouse.setPrice(sc.nextInt());
			System.out.println("OUTPUT: ");
			System.out.print(myHouse. getPricetoUSD());
		}else {
			System.out.print("Enter a address: ");
			myHouse.setAddress(sc.nextLine());
			System.out.println("OUTPUT: ");
			System.out.print(myHouse.getCode());
		}
	}

}
