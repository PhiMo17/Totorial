
public class Rectangle {

	private double width;
	private double length;
	public Rectangle(double width, double lenght) {
		if(width <= 0) {
			this.width = 0;
		}
		else {
			this.width = width;
		}
		
		if(lenght <= 0) {
			this.length = 0;
		}
		else {
			this.length = lenght;
		}
	}
	
	

	public double getWidth() {
		return width;
	}



	public double getLength() {
		return length;
	}



	public double getArea() {
		return width * length;
	}
}
