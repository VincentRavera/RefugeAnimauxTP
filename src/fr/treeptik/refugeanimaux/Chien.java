package fr.treeptik.refugeanimaux;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Chien")
public class Chien extends Animal{

	private static final long serialVersionUID = 1L;
	
	private String race;

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

}
