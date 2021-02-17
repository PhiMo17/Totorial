
public class Cuboid extends Rectangle{

	private double height;
	
	public Cuboid(double width, double lenght, double height) {
		super(width, lenght);
		// TODO Auto-generated constructor stub
		
		if(height <=0) {
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
		double Area1 = ((super.getLength() * height));
		double Area2 = ((super.getWidth() * height));
		return (Area1 * 2 + Area2 * 2 + super.getArea() * 2);
		
	}
}
