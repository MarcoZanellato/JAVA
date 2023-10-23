package piastreinterface;

public class Pavimento{
	private Piastrella piastrella;
	private int numero_piastrelle;
		
	public Pavimento(Piastrella piastrella, int numero_piastrelle) {
		this.piastrella = piastrella;
		this.numero_piastrelle = numero_piastrelle;
	}
	public Piastrella getPiastrella() {
		return piastrella;
	}
	public void setPiastrella(Piastrella piastrella) {
		this.piastrella = piastrella;
	}
	public int getNumero_piastrelle() {
		return numero_piastrelle;
	}
	public void setNumero_piastrelle(int numero_piastrelle) {
		this.numero_piastrelle = numero_piastrelle;
	}
	public double getSuperficie(){
		return numero_piastrelle * piastrella.getArea();
	}
}	
	