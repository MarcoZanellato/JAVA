package piastre;

public class PiastrellaQuadrata extends Piastrella {	
	private double lato;
	
	public PiastrellaQuadrata(double lato) {
		super();
		this.lato = lato;
	}
	public double getLato() {
		return lato;
	}
	public void setLato(double lato) {
		this.lato = lato;
	}
	//@0verride
	public double getArea() {
		return Math.pow(lato,2);
	}
}
