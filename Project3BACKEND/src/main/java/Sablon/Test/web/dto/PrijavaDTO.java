package Sablon.Test.web.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class PrijavaDTO {
	
	@Positive(message= "Id mora biti pozitivan broj")
	private Long id;
	
	@NotBlank
	private String datumPrijave;
	
	@NotBlank
	private String disciplina;
	
	private Long takmicarId;
	private String takmicarImePrezime;
	
	
	public PrijavaDTO() {
		
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


	public Long getTakmicarId() {
		return takmicarId;
	}


	public void setTakmicarId(Long takmicarId) {
		this.takmicarId = takmicarId;
	}


	public String getTakmicarImePrezime() {
		return takmicarImePrezime;
	}


	public void setTakmicarImePrezime(String takmicarImePrezime) {
		this.takmicarImePrezime = takmicarImePrezime;
	}



	
	
	

}
