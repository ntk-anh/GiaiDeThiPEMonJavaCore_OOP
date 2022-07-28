package Q5;

import java.util.jar.Attributes.Name;

import javax.management.remote.SubjectDelegationPermission;

public class Seller extends Employee {

	private double revenue;

	public Seller() {
		// TODO Auto-generated constructor stub
	}

	public Seller(String name, double salary, double revenue) {
		super(name, salary);
		this.revenue = revenue;
	}

	public double getSalary() {
		if (revenue < 30000) {
			return super.getSalary() + 0.05 * revenue;
		} else {
			return super.getSalary() + 0.1 * revenue;
		}

	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" + super.getName() + "\t" + super.getSalary() + "\t" + revenue;
	}

}
