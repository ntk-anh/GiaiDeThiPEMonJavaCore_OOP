package Q3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static MyBicycle myb = new MyBicycle();

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Bicycle> bicycles=new ArrayList<>();

			
			Bicycle b1=new Bicycle(110,"Yamaha 2017A");
			bicycles.add(b1);
			Bicycle b2=new Bicycle(250,"Audi 2017B");
			bicycles.add(b2);
			Bicycle b3=new Bicycle(120,"Porche 2017C");
			bicycles.add(b3);
		
		


		System.out.print("And more how many bicycle: ");int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.print("Bicycle name: ");String name=sc.nextLine();
			System.out.print("Bicycle price: ");float price=Float.parseFloat(sc.nextLine());
			
//			Bicycle b=new Bicycle(price,name);
			bicycles.add(new Bicycle(price,name));
		}
		
		System.out.print("Enter test function (1-f1,2-f2): "); int chon=Integer.parseInt(sc.nextLine());
		if (chon==1) {
			myb.f1(bicycles);
			System.out.println("OUTPUT: ");
			for (int i = 0; i < bicycles.size(); i++){
				System.out.println(bicycles.get(i).getName()); 
			}
		}else {
			System.out.println("Enter given bicycle name: ");String name=sc.nextLine();
			System.out.println("OUTPUT: ");
			int result = myb.f2(bicycles, name);
			System.out.println(result);
		}
	}

}
