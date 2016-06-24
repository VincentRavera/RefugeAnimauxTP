package fr.treeptik.refugeanimaux;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="type")
public abstract class Animal implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	protected Integer id;
	protected String nom;
	protected Integer age;
	protected Date dernierVaccin;
	
	
	
	
	public Animal() {
	}
	public Animal(Integer id, String nom, Integer age, Date dernierVaccin) {
		this.id = id;
		this.nom = nom;
		this.age = age;
		this.dernierVaccin = dernierVaccin;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getDernierVaccin() {
		return dernierVaccin;
	}
	public void setDernierVaccin(Date dernierVaccin) {
		this.dernierVaccin = dernierVaccin;
	}
	
	

}
