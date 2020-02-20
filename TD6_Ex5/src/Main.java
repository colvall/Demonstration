
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Employe e;
	
	
	e= new Employe("aaa", "a", 15);
	
	e.ajouterEmploye();
	
	
	
	e= new Employe("bbb", "b", 22);
	e.ajouterEmploye();
	
	
	e= new Employe("ccc", "c", 31);
	e.ajouterEmploye();
	e= new Employe("ddd", "d", 10);
	e.ajouterEmploye();
	
	
	if (Employe.chercherEmploye(99)==null) System.out.println("null");
    System.out.println(Employe.chercherEmploye(100).toString());
    System.out.println(Employe.chercherEmploye(102).toString());
    System.out.println(Employe.chercherEmploye(100).toString());
	
	 int n=4;
	 
	 
	 if (n <= (Employe.getNumMax() - Employe.getINITIAL()) +1)
	  { 
		System.out.println("Les " +n + " derniers employés sont:");
	    for(int i=0; i<n; i++){
	    		System.out.println(Employe.chercherDerniersEmployes(n)[i].toString());
	    }
	  }
	 else System.out.println("Erreur: Il n'y a pas "+ n + "employés dans la liste");
	 
	}
}
