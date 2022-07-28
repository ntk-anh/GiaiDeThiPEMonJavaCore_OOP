package Q2;

import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.Scanner;

public class Main {
	public static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		
	

		System.out.print("Enter name of a computer: ");String name=sc.nextLine();
		System.out.print("Enter color of a computer: ");String color=sc.nextLine();
		System.out.print("Enter series of a computer: ");String series=sc.nextLine();
		System.out.print("Enter price of a computer: ");double price=sc.nextDouble();
		System.out.println("1. TC = 1 - test toString function");
		System.out.println("2. TC = 2 - test getSalePrice function");
		System.out.println("3. TC = 3 - test Name function");
		System.out.println("Enter TC: ");int chon=sc.nextInt();
		
		SComputer s= new SComputer(name,color,price,series);
		switch (chon) {
		case 1:			
			System.out.println("OUTPUT: \n" + s.toString());
			break;
		case 2:
			System.out.println("OUTPUT: \n" + s.getSalePrice());
			break;
		case 3:
			
			break;
		default:
			break;
		}

	}

}
