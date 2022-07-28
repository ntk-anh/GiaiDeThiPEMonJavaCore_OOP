package Q1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter Person Name: ");
			String name = sc.nextLine();
			System.out.print("Enter Person Age: ");
			int age = sc.nextInt();

			System.out.println("1. TC = 1 - test getName()");
			System.out.println("2. TC = 2 - test setAge()");
			System.out.println("3. TC = 3 - test toString()");

			Person p = new Person(name, age);
			System.out.print("Enter TC: ");
			int chon = sc.nextInt();

		
				
				switch (chon) {
				case 1:
					System.out.println("OUTPUT:\n" + p.getName());
					break;
				case 2:
					System.out.print("Enter your new age: ");
					int ageNew = sc.nextInt();
					p.setAge(ageNew);
					System.out.println("OUTPUT:\n" + p.getAge());
					break;
				case 3:
					System.out.println(p.toString());
					break;
				}		
		}	
	}
}
