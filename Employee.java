public class Employee{
	protected String name;
	protected String address;
	protected float salary;
	
	public Employee (String name, String address, float salary) {
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public float getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}