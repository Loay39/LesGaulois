package personnage;

public class Chef {
	private String nom;
	private int force;
	private Village village;
	public Chef(String nom, int force, Village village) {
		this.nom = nom;
		this.force = force;
		this.village = village;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) { 
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le chef"+nom+":";
	}

}
