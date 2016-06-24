package fr.treeptik.refugeanimaux;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Chat")
public class Chat extends Animal{

	private static final long serialVersionUID = 1L;
	
	private String couleur;

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
	

}
