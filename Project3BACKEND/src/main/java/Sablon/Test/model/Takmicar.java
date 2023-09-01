package Sablon.Test.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

//Takmičar:
//Id - identifikator
//Ime i prezime - tekstualna, obavezna vrednost
//Broj osvojenih medalja - numerička vrednost
//Datum rođenja - obavezna vrednost
//Država - veza sa instancom klase Država (svaki takmičar se takmiči za tačno
//jednu državu, dok se za jednu državu takmiči više od jednog takmičara)

@Entity
public class Takmicar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String imePrezime;
	
	@Column
	private int brojMedalja;
	
	@Column(nullable=false)
	private String datumRodjenja;
	
	@ManyToOne
	private Drzava drzava;
	
	@OneToMany (mappedBy= "takmicar", fetch= FetchType.EAGER, cascade=CascadeType.ALL)
	private Set <Prijava> prijave= new HashSet<>();

	public Takmicar(String imePrezime, int brojMedalja, String datumRodjenja, Drzava drzava, Set<Prijava> prijave) {
		super();
		this.imePrezime = imePrezime;
		this.brojMedalja = brojMedalja;
		this.datumRodjenja = datumRodjenja;
		this.drzava = drzava;
		this.prijave = prijave;
	}

	
	public Takmicar() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getImePrezime() {
		return imePrezime;
	}


	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}


	public int getBrojMedalja() {
		return brojMedalja;
	}


	public void setBrojMedalja(int brojMedalja) {
		this.brojMedalja = brojMedalja;
	}


	public String getDatumRodjenja() {
		return datumRodjenja;
	}


	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}


	public Drzava getDrzava() {
		return drzava;
	}


	public void setDrzava(Drzava drzava) {
		this.drzava = drzava;
		if(drzava != null && !drzava.getTakmicari().contains(this)) {
			drzava.getTakmicari().add(this);
		}
	}


	public Set<Prijava> getPrijave() {
		return prijave;
	}


	public void setPrijave(Set<Prijava> prijave) {
		this.prijave = prijave;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Takmicar other = (Takmicar) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "Takmicar [id=" + id + ", imePrezime=" + imePrezime + ", brojMedalja=" + brojMedalja + ", datumRodjenja="
				+ datumRodjenja + ", drzava=" + drzava + "]";
	}
	
	
	
	
	
	
}
