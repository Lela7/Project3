package Sablon.Test.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//Prijava:
//Id - identifikator
//Datum prijave - obavezna vrednost
//Disciplina - ime discipline u kojoj se takmiči (npr. košarka, skok u dalj, tenis i sl.)
//Takmičar - veza sa instancom klase Takmičar (jedna prijava se vezuje za jednog
//takmičara, dok se jedan takmičar može prijaviti više puta npr. atletičar se
//prijavljuje za sprint na 100 i 200m ili teniser za nastupanje u singl i dubl
//mečevima

@Entity
public class Prijava {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String datumPrijave;
	
	@Column
	private String disciplina;
	
	@ManyToOne
	private Takmicar takmicar;

	public Prijava(String datumPrijave, String disciplina, Takmicar takmicar) {
		super();
		this.datumPrijave = datumPrijave;
		this.disciplina = disciplina;
		this.takmicar = takmicar;
	}
	
	public Prijava() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDatumPrijave() {
		return datumPrijave;
	}

	public void setDatumPrijave(String datumPrijave) {
		this.datumPrijave = datumPrijave;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Takmicar getTakmicar() {
		return takmicar;
	}

	public void setTakmicar(Takmicar takmicar) {
		this.takmicar = takmicar;
		if(takmicar !=null && !takmicar.getPrijave().contains(this)) {
			takmicar.getPrijave().add(this);
		}
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prijava other = (Prijava) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Prijava [id=" + id + ", datumPrijave=" + datumPrijave + ", disciplina=" + disciplina + ", takmicar="
				+ takmicar + "]";
	}
	
	
	
	
	
	

}
