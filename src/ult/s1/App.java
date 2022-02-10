package ult.s1;

public class App {

	public static void main(String[] args) {
		// p1 est une référence sur un objet de type Personne
		Personne p1 = new Personne();  // appel au constructeur par défaut
		
		// p2 est aussi une référence sur un objet de type Personne
		Personne p2 = new Personne("Ali",20); // appel au constructeur avec deux paramètres
		
		p1.info();
		p2.info();
		System.out.println("***********");
		Personne p3 = new Personne("Sami");
		p3.info();
		
		System.out.println("***********");
		Personne p4 = new Personne(21);
		p4.info();
		/*
		System.out.println("Les classes et les objets");
		
		System.out.println("Nom de p1 : " +p1.name);
		System.out.println("Age de p1 : " +p1.age);
		System.out.println("Age Max de toute personne : " +Personne.maxAge);
		System.out.println("Age Max de toute personne : " +p1.maxAge);
		System.out.println("Age Max de toute personne : " +p2.maxAge);
		p1.name = "Achraf";
		p1.age = 25;
		
		System.out.println("***********");
		
		System.out.println("Nom de p1 : " +p1.name);
		System.out.println("Age de p1 : " +p1.age);
		p1.info(); // un appel de la méthode info() sur l'objet Personne pointé par p1
		
		System.out.println("***********");
		
		p2.info();
		
		System.out.println("***********");
		Personne.getAgeMax(); // appel de la méthode de classe
		*/
	}

}
