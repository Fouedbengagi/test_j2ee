package comm.isamm.beans;

public class livre {
	private String intitule;
	private String isbn;
	private String auteur;
	
	
	
	public livre(String intitule, String isbn, String auteur) {
		super();
		this.intitule = intitule;
		this.isbn = isbn;
		this.auteur = auteur;
	}
	public livre () {}
	
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	

}
