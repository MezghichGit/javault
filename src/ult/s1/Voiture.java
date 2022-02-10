package ult.s1;

public class Voiture {
	
	//attributs d'instance
	String marque;
	String modele;
	String immatriculation;
	String couleur;
	double prix;
	
	//attributs de classe
	static int vitesseMax = 300;
	static int nbVoitures = 0;
	
	// Un constructeur par d�faut(sans param�tres)
	
	public Voiture() {
		nbVoitures++;
		System.out.println("Une nouvelle voiture");
	}
	
	// Un constructeur avec param�tres
	public Voiture(String marque, String modele, String immatriculation, String couleur, double prix) {
		nbVoitures++;
		this.marque = marque;
		this.modele = modele;
		this.immatriculation = immatriculation;
		this.couleur = couleur;
		this.prix = prix;
	}
	
	// m�thode d'instance
	
	public void descriptionVoiture()
	{
		System.out.println("La marque = "+ this.marque);
		System.out.println("La mod�le = "+ this.modele);
		System.out.println("L'immatriculation = "+ this.immatriculation);
		System.out.println("La couleur = "+ this.couleur);
		System.out.println("Le prix  = "+ this.prix);
	}
	
	// les m�thodes statiques
	
	public static void getVitesseMax()
	{
		System.out.println("La vitesse Max d'une voiture = "+ vitesseMax);
	}
	
	public static void nbreDeVoitures()
	{
		System.out.println("Le nombre de voitures = "+ nbVoitures);
	}

}
