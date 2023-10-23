package piastreinterface;

public class PiastreInterface {
	
	public static void main(String[] args) {
		//Definizione dimensioni delle piastrelle, in centimetri
		Piastrella piastrella_1 = new PiastrellaQuadrata(50);
		Piastrella piastrella_2 = new PiastrellaQuadrata(30);
		Piastrella piastrella_3 = new PiastrellaTriangolare(50,40);
		//Definizione Numero di piastrelle per ogni pavimento
		Pavimento pavimento_1 = new Pavimento(piastrella_1, 100);
		Pavimento pavimento_2 = new Pavimento(piastrella_2, 150);
		Pavimento pavimento_3 = new Pavimento(piastrella_3,200);
		
		//Visualizza la superficie dei pavimenti in metri quadrati
		System.out.println("********************************************");		
		System.out.println("ESERCIZIO CON INTERFACE");
		System.out.println("CALCOLO AREA DEI PAVIMENTI");
		System.out.println("********************************************");
		System.out.print("La superficie del pavimento 1 e'= m2. ");
		System.out.printf("%.2f",pavimento_1.getSuperficie()/10000);
		System.out.println();
		System.out.print("La superficie del pavimento 2 e'= m2. ");
		System.out.printf("%.2f",pavimento_2.getSuperficie()/10000);
		System.out.println();
		System.out.print("La superficie del pavimento 3 e'= m2. ");
		System.out.printf("%.2f",pavimento_3.getSuperficie()/10000);
		System.out.println("\n********************************************");		
	}

}