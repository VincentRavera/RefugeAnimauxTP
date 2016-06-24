package fr.treeptik.refugeanimaux;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Perroquet")
public class Perroquet extends Animal{

	private static final long serialVersionUID = 1L;
	
	private Long taille;

	public Long getTaille() {
		return taille;
	}

	public void setTaille(Long taille) {
		this.taille = taille;
	}

}
