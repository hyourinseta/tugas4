public class Circle extends Shape {
	private float radian;
	private String name;
	private float area;

	@Override
	public String getName(){
		return name;
	}

	@Override
	public float getArea(){
		this.area = (22/7) * this.getRadian() * this.getRadian();
		return area;
	} 

	public void setName(String name) {
		this.name = name;
	}

	public float getRadian() {
		return radian;
	}

	public void setRadian(float radian) {
		this.radian = radian;
	}
}