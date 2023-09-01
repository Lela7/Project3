package Sablon.Test.web.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class TakmicarDTO {
	
	@Positive (message= "Id mora biti pozitivan broj.")
	private Long id;
	
	@NotBlank
	private String imePrezime;
	
	private int brojMedalja;
	
	@NotBlank
	private String datumRodjenja;
	
	private Long drzavaId;
	private String drzavaNaziv;
	private String drzavaOznaka;
	
	public TakmicarDTO () {
		
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

	public Long getDrzavaId() {
		return drzavaId;
	}

	public void setDrzavaId(Long drzavaId) {
		this.drzavaId = drzavaId;
	}

	public String getDrzavaNaziv() {
		return drzavaNaziv;
	}

	public void setDrzavaNaziv(String drzavaNaziv) {
		this.drzavaNaziv = drzavaNaziv;
	}

	public String getDrzavaOznaka() {
		return drzavaOznaka;
	}

	public void setDrzavaOznaka(String drzavaOznaka) {
		this.drzavaOznaka = drzavaOznaka;
	}
	
	
	
	
	

}
