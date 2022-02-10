package ult.s1;

public class Personne {
	//attribut de classe
	static int maxAge = 100;
	// attributs d'instance
	String name;
	int age;
	
	//les m�thodes d'instance
	
	public void info()
	{
		System.out.println("Je suis une personne");
		System.out.println("Mon nom : "+this.name);
		System.out.println("Mon age : "+this.age);
	}
	
	// une m�thode de classe(une m�thode statique)
	
	public static void getAgeMax()
	{
		System.out.println("Age Max = "+maxAge);
	}
	
	public Personne() {  //Un constructeur par d�faut
		System.out.println("Cr�ation d'un objet Personne");
	}
	
	public Personne(String n, int a) {  //Un deuxi�me constructeur avec param�tres
		
		name = n;
		age = a;

		System.out.println("Cr�ation d'un objet Personne avec deux param�tres");
	}
	
		public Personne(String n) {  //Un deuxi�me constructeur avec 1 param�tre
		
		name = n;
		System.out.println("Cr�ation d'un objet Personne avec 1 param�tre : le nom");
	}
		
		public Personne(int a) {  //Un deuxi�me constructeur avec 1 param�tre
			
			age = a;

			System.out.println("Cr�ation d'un objet Personne avec  1 param�tre : l'age");
		}

}
