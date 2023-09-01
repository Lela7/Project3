package Sablon.Test.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



//Država:
//Id - identifikator
//Naziv - tekstualna, obavezna, jedinstvena vrednost vrednost
//Oznaka - tekstualna, jedinstvena, troslovna oznaka države (npr. SRB, USA i sl.)

@Entity
public class Drzava {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique=true, nullable=false)
	private String naziv;
	
	@Column(unique=true, length=3)
	private String oznaka;
	
	@OneToMany (mappedBy = "drzava", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private List <Takmicar> takmicari= new ArrayList<>();

	public Drzava(String naziv, String oznaka, List<Takmicar> takmicari) {
		super();
		this.naziv = naziv;
		this.oznaka = oznaka;
		this.takmicari = takmicari;
	}
	
	public Drzava() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOznaka() {
		return oznaka;
	}

	public void setOznaka(String oznaka) {
		this.oznaka = oznaka;
	}

	public List<Takmicar> getTakmicari() {
		return takmicari;
	}

	public void setTakmicari(List<Takmicar> takmicari) {
		this.takmicari = takmicari;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drzava other = (Drzava) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Drzava [id=" + id + ", naziv=" + naziv + ", oznaka=" + oznaka + "]";
	}
	
	
	
	

}
