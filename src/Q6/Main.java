package Q6;

import java.rmi.server.RemoteStub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCourse myCourse=new MyCourse();
		Scanner scanner=new Scanner(System.in);
		
		List<Course> list=new ArrayList<>();
		list.add(new Course("PRJ311",110));
		list.add(new Course("DBI202",150));
		list.add(new Course("PRF192",120));

		System.out.print("Add more how many course: ");int n=scanner.nextInt();scanner.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.print("Course name: ");String name=scanner.nextLine();
			System.out.print("Course fee: ");double fee=scanner.nextDouble();
			list.add(new Course(name, fee));
		}
		System.out.print("Enter test function (1-f1,2-f2: ");int chon=scanner.nextInt();
		if(chon==1) {
			System.out.print("Enter st: ");int st=scanner.nextInt();
			myCourse.f1(list, st);
			for (Course item : list) {
				System.out.println(item.getName());
			}
		}else {
			System.out.print("Enter course fee: ");double fee = scanner.nextDouble();
			System.out.println("OUTPUT: ");
			System.out.println(myCourse.f2(list, fee));
		}
		
	}

}
