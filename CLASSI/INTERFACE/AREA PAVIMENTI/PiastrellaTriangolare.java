package piastreinterface;

public class PiastrellaTriangolare implements Piastrella {
	private double base;
	private double lato_obliquo;
			
	public PiastrellaTriangolare(double base, double lato_obliquo) {
		super();
		this.base = base;
		this.lato_obliquo = lato_obliquo;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public void setLato_obliquo(double lato_obliquo) {
		this.lato_obliquo = lato_obliquo;
	}
	public double getBase() {
		return base;
	}			
	public double getLato_obliquo() {
		return lato_obliquo;
	}
	//@0verride
	public double getArea() {
		double altezza = Math. sqrt(Math.pow(lato_obliquo, 2) - Math.pow(base/2, 2));
		return (base*altezza/2);
	}	
}
