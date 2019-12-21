package admin.pkg.ddh;

import java.util.Date;

public class Episode {

	Integer id;
	Integer numero;
	String titre;
	String titreOriginal;
	Integer duree;
	String resume;
	Date dateRealisation;
	Date premiereDiffusion;
	Integer idPublic;
	Integer idStatut;
	Integer idSaison;
	Integer note;
	
	
	/**
	 * @param id
	 * @param numero
	 * @param titre
	 * @param titreOriginal
	 * @param duree
	 * @param resume
	 * @param dateRealisation
	 * @param premiereDiffusion
	 * @param idPublic
	 * @param idStatut
	 * @param idSaison
	 */
	public Episode(Integer id, Integer numero, String titre, String titreOriginal, Integer duree, String resume,
			Date dateRealisation, Date premiereDiffusion, Integer idPublic, Integer idStatut, Integer idSaison, Integer note) {
		super();
		this.id = id;
		this.numero = numero;
		this.titre = titre;
		this.titreOriginal = titreOriginal;
		this.duree = duree;
		this.resume = resume;
		this.dateRealisation = dateRealisation;
		this.premiereDiffusion = premiereDiffusion;
		this.idPublic = idPublic;
		this.idStatut = idStatut;
		this.idSaison = idSaison;
		this.note = note;
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
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}


	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}


	/**
	 * @return the titreOriginal
	 */
	public String getTitreOriginal() {
		return titreOriginal;
	}


	/**
	 * @param titreOriginal the titreOriginal to set
	 */
	public void setTitreOriginal(String titreOriginal) {
		this.titreOriginal = titreOriginal;
	}


	/**
	 * @return the duree
	 */
	public Integer getDuree() {
		return duree;
	}


	/**
	 * @param duree the duree to set
	 */
	public void setDuree(Integer duree) {
		this.duree = duree;
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
	 * @return the dateRealisation
	 */
	public Date getDateRealisation() {
		return dateRealisation;
	}


	/**
	 * @param dateRealisation the dateRealisation to set
	 */
	public void setDateRealisation(Date dateRealisation) {
		this.dateRealisation = dateRealisation;
	}


	/**
	 * @return the premiereDiffusion
	 */
	public Date getPremiereDiffusion() {
		return premiereDiffusion;
	}


	/**
	 * @param premiereDiffusion the premiereDiffusion to set
	 */
	public void setPremiereDiffusion(Date premiereDiffusion) {
		this.premiereDiffusion = premiereDiffusion;
	}


	/**
	 * @return the idPublic
	 */
	public Integer getIdPublic() {
		return idPublic;
	}


	/**
	 * @param idPublic the idPublic to set
	 */
	public void setIdPublic(Integer idPublic) {
		this.idPublic = idPublic;
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
	 * @return the idSaison
	 */
	public Integer getIdSaison() {
		return idSaison;
	}


	/**
	 * @param idSaison the idSaison to set
	 */
	public void setIdSaison(Integer idSaison) {
		this.idSaison = idSaison;
	}


	/**
	 * @return the note
	 */
	public Integer getNote() {
		return note;
	}


	/**
	 * @param note the note to set
	 */
	public void setNote(Integer note) {
		this.note = note;
	}
	
	
	
	
	
}
