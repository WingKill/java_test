
class Rectangle {
	private double width = 0;
	private double height = 0;

	public Rectangle(double width,double height){
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}	
}
