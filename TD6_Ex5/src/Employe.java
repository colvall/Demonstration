public class Employe {
  
 private static final int INITIAl = 100;
 
 private String nom, prenom;
 private int num;
 private int nas;
 
 private static int numMax= INITIAl;
 private static  final int MAX=500;
 private static Employe[] liste= new Employe[MAX];  
  
 Employe(String n, String p, int nas){
	this.nom= n;
	this.prenom = p;
	this.nas= nas;
	this.num = numMax;
	numMax++;
	
 }

 int getNum(){return num;}
 
 String getNom(){return nom;}
 
 String getPrenom(){return prenom;}
 
 static int getNumMax(){return numMax-1;}
 static int getINITIAL(){return INITIAl;}

 
 
  void ajouterEmploye() {
	 if (numMax-INITIAl <= MAX) {
	 liste[this.num-INITIAl]= this;}
 }
 
 
 
 
  static Employe chercherEmploye(int num) {
	  if ((num-INITIAl < MAX) && (num-INITIAl >=0)) return liste[num-INITIAl];
	  else return null;
  }
 
  // recherche et retourne les n derniers employés
  
  static Employe [] chercherDerniersEmployes(int n) {
	  Employe[] temp = new Employe[n];   //déclare un tableau de taille n qui sera retourné (il contient les n derniers employés)
	   int j =0;
		  for (int i=(numMax-INITIAl)-1; i> (numMax-INITIAl)- 1 -n; i--){ // parcours de la liste en partant de la fin 
		  temp[j]= liste[i];											// récupàre les n derniers emplyés dans le tableau temp 
		  j++;															// l'indice j permet de rmplir le tableau temp
	     }  	  
	  
	  return temp;
  }
 
  public String toString(){
	  
	  return ("Le nom est : " + nom + ", le prenom est :" + prenom + ", le numero est :" + num+ " le NAS est :" + nas);
  }
}
