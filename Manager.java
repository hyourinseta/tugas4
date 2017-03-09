public class Manager extends Employee {
	private float bonus;

	public Manager(String name, String address, float salary) {
		super(name, address, salary);
	}
	
	@Override
	public float getSalary() {
		return super.getSalary() + this.getBonus();
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
}