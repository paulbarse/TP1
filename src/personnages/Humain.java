package personnages;

public class Humain {
	
	private String nom;
	private int argent;
	private String boisson;
	
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public void parler(String texte) {
		System.out.println(this.nom+" - "+texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! je m'appelle "+getNom()+" et j'aime boire du "+getBoisson());
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+getBoisson()+" ! GLOUPS !");
	}
	
	public void gagnerArgent(int n) {
		this.argent = getArgent()+n;
	}
	
	public void perdreArgent(int n) {
		this.argent = getArgent()-n;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public String getBoisson() {
		return boisson;
	}

}
