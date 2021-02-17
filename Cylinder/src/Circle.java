
public class Circle {
	private double radius;

	public Circle(double radius) {
		if (radius <= 0) {
			radius = 0;
		}
		else {
		this.radius = radius;
		}
	}

	/*public Circle(double radius2) {
		// TODO Auto-generated constructor stub
	}*/

	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return (radius * radius * Math.PI);
	}
	
	public double getCircumference() {
		return (2 * Math.PI * radius);
	}
}
