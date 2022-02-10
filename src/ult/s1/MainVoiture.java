package ult.s1;

public class MainVoiture {

	public static void main(String[] args) {
		Voiture.nbreDeVoitures();
		Voiture v1 = new Voiture(); //constructeur par défaut
		System.out.println("*****");
		
		Voiture.nbreDeVoitures();
		
		v1.descriptionVoiture();
		System.out.println("*****");
		Voiture v2 = new Voiture("Golf","Golf 8","200 Tunis 2","Noir",90000);
		System.out.println("*****");
		Voiture.nbreDeVoitures();
		
		v2.descriptionVoiture();
		
		Voiture v3 = new Voiture("Polo","Polo 6","180 Tunis 300","Blanc",12000);
		System.out.println("*****");
		v3.descriptionVoiture();
		System.out.println("*****");
		Voiture.nbreDeVoitures();
		Voiture.getVitesseMax();

	}

}
