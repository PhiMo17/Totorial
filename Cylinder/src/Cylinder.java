
public class Cylinder extends Circle{
	
	private double height;

	public Cylinder(double radius, double height) {
		super(radius);
		// TODO Auto-generated constructor stub
		
		if(height <= 0) {
			this.height = 0;
		}
		else {
			this.height = height;
		}
	}

	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return super.getArea() * height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		//return super.getArea();
		
		double AreaFlat = super.getCircumference() * height;
		
		return AreaFlat + (super.getArea() * 2);
	}
	
	
}
