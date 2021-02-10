
public class ComplexNumber {

	private double real;
	private double imaginary;
	
	public ComplexNumber(double real, double imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}
	
	public void add(double real, double imaginary) {
		this.real += real;
		this.imaginary += imaginary;
	}
	
	public void add(ComplexNumber add) {
		this.real += add.real;
		this.imaginary += add.imaginary; 
	}
	
	public void subtract(double real, double imaginary) {
		this.real -= real;
		this.imaginary -= imaginary;
	}
	
	public void subtract(ComplexNumber subtract) {
		this.real -= subtract.real;
		this.imaginary -= subtract.imaginary;
	}
}
