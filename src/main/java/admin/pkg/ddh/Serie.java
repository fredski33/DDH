package admin.pkg.ddh;

public class Serie {
	
	Integer id;
	String nom;
	String nomOriginal;
	Integer anneeParution;
	String synopsis;
	Integer idStatut;
	Integer idPaysOrigine;
	
	/**
	 * @param id
	 * @param nom
	 * @param nomOriginal
	 * @param anneeParution
	 * @param synopsis
	 * @param idStatut
	 * @param idPaysOrigine
	 */
	public Serie(Integer id, String nom, String nomOriginal, Integer anneeParution, String synopsis, Integer idStatut,
			Integer idPaysOrigine) {
		super();
		this.id = id;
		this.nom = nom;
		this.nomOriginal = nomOriginal;
		this.anneeParution = anneeParution;
		this.synopsis = synopsis;
		this.idStatut = idStatut;
		this.idPaysOrigine = idPaysOrigine;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nomOriginal
	 */
	public String getNomOriginal() {
		return nomOriginal;
	}

	/**
	 * @param nomOriginal the nomOriginal to set
	 */
	public void setNomOriginal(String nomOriginal) {
		this.nomOriginal = nomOriginal;
	}

	/**
	 * @return the anneeParution
	 */
	public Integer getAnneeParution() {
		return anneeParution;
	}

	/**
	 * @param anneeParution the anneeParution to set
	 */
	public void setAnneeParution(Integer anneeParution) {
		this.anneeParution = anneeParution;
	}

	/**
	 * @return the synopsis
	 */
	public String getSynopsis() {
		return synopsis;
	}

	/**
	 * @param synopsis the synopsis to set
	 */
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
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
	 * @return the idPaysOrigine
	 */
	public Integer getIdPaysOrigine() {
		return idPaysOrigine;
	}

	/**
	 * @param idPaysOrigine the idPaysOrigine to set
	 */
	public void setIdPaysOrigine(Integer idPaysOrigine) {
		this.idPaysOrigine = idPaysOrigine;
	}
	
	

	
	

}
