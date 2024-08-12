
public class Trapezio {
	private double base;
	private double BASE;
	private double altura;

	public Trapezio(double b, double B, double a) {
		this.base = b;
		this.BASE = B;
		this.altura = a;
	}

	public String forma() {
		double area = ((this.base + this.BASE) * this.altura) / 2;
		return "A área do Trapezio é " + area;
	}
}
