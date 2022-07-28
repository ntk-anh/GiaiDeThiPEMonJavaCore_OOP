package Q1;
import java.util.Set;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name.toUpperCase();//viết hoa tất cả chữ
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}

	@Override
	public String toString() {
		return age + "\t" + name;
	}	
}
