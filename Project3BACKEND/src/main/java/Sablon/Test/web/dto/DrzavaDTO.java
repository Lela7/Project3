package Sablon.Test.web.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class DrzavaDTO {
	
	@Positive(message = "Id je uvek pozitivan broj.")
	private Long id;
	
	@NotBlank
	private String naziv;
	
	@Size(max=3, message="Oznaka drzave sadrzi najvise tri karaktera.")
	private String oznaka;
	
	public DrzavaDTO() {
		
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
	
	
	
	

}
