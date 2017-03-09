public class Square extends Shape {
	private float side;
	private String name;
	private float area;

	@Override
	public String getName(){
		return name;
	}

	@Override
	public float getArea(){
		this.area = this.getSide() * this.getSide();
		return area;
	} 

	public void setName(String name) {
		this.name = name;
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}
}