package admin.pkg.ddh;

public class Saison {

	Integer numero;
	String resume;
	Integer anneeDiffusion;
	Integer idStatut;
	Integer idSerie;
	
	/**
	 * @param numero
	 * @param resume
	 * @param anneeDiffusion
	 * @param idStatut
	 * @param idSerie
	 */
	public Saison(Integer numero, String resume, Integer anneeDiffusion, Integer idStatut, Integer idSerie) {
		super();
		this.numero = numero;
		this.resume = resume;
		this.anneeDiffusion = anneeDiffusion;
		this.idStatut = idStatut;
		this.idSerie = idSerie;
	}

	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * @return the resume
	 */
	public String getResume() {
		return resume;
	}

	/**
	 * @param resume the resume to set
	 */
	public void setResume(String resume) {
		this.resume = resume;
	}

	/**
	 * @return the anneeDiffusion
	 */
	public Integer getAnneeDiffusion() {
		return anneeDiffusion;
	}

	/**
	 * @param anneeDiffusion the anneeDiffusion to set
	 */
	public void setAnneeDiffusion(Integer anneeDiffusion) {
		this.anneeDiffusion = anneeDiffusion;
	}

	/**
	 * @return the idStatut
	 */
	public Integer getIdStatut() {
		return idStatut;
	}

	/**
	 * @param idStatut the idStatut to set
	 */
	public void setIdStatut(Integer idStatut) {
		this.idStatut = idStatut;
	}

	/**
	 * @return the idSerie
	 */
	public Integer getIdSerie() {
		return idSerie;
	}

	/**
	 * @param idSerie the idSerie to set
	 */
	public void setIdSerie(Integer idSerie) {
		this.idSerie = idSerie;
	}
	
	
	
	
	
}
