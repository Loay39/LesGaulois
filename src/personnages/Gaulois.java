package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;		
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public String getNom() {
		return nom;
	}
	public int getEffetPotion() {
		return effetPotion;
	}
	public void parler(String texte) {
		System.out.println(prendreParole()+"<< "+texte +">>");
		
	}
	private String prendreParole() {
		// TODO Auto-generated method stub
		return null;
	}
	}
}

