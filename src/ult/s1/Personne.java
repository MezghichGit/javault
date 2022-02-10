package ult.s1;

public class Personne {
	//attribut de classe
	static int maxAge = 100;
	// attributs d'instance
	String name;
	int age;
	
	//les méthodes d'instance
	
	public void info()
	{
		System.out.println("Je suis une personne");
		System.out.println("Mon nom : "+this.name);
		System.out.println("Mon age : "+this.age);
	}
	
	// une méthode de classe(une méthode statique)
	
	public static void getAgeMax()
	{
		System.out.println("Age Max = "+maxAge);
	}
	
	public Personne() {  //Un constructeur par défaut
		System.out.println("Création d'un objet Personne");
	}
	
	public Personne(String n, int a) {  //Un deuxième constructeur avec paramètres
		
		name = n;
		age = a;

		System.out.println("Création d'un objet Personne avec deux paramètres");
	}
	
		public Personne(String n) {  //Un deuxième constructeur avec 1 paramètre
		
		name = n;
		System.out.println("Création d'un objet Personne avec 1 paramètre : le nom");
	}
		
		public Personne(int a) {  //Un deuxième constructeur avec 1 paramètre
			
			age = a;

			System.out.println("Création d'un objet Personne avec  1 paramètre : l'age");
		}

}
