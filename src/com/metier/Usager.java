package com.metier;

public class Usager {
	private String idUsager;
	private String nom;
	private String prenom;
	private String adresseRueUsager;
	private String adresseVilleUsager;
	private String cpUsager;
	private String nomUser;
	private String motDePasse;
	

/**
 * Constructeur de Usager
 * @param idUsager
 * @param nom
 * @param prenom
 * @param adresseRueUsager
 * @param adresseVilleUsager
 * @param cpUsager
 * @param nomUser
 * @param motDePasse
 */
	public Usager(String idUsager, String nom, String prenom, String adresseRueUsager, String adresseVilleUsager,
			String cpUsager, String nomUser, String motDePasse) {
		super();
		this.idUsager = idUsager;
		this.nom = nom;
		this.prenom = prenom;
		this.adresseRueUsager = adresseRueUsager;
		this.adresseVilleUsager = adresseVilleUsager;
		this.cpUsager = cpUsager;
		this.nomUser = nomUser;
		this.motDePasse = motDePasse;
	}
	
/**
 * getNom
 * @return String nom
 */
	public String getNom() {
		return nom;
	}
/**
 *  setNom
 * @param nom modifier le nom
 */
	public void setNom(String nom) {
		this.nom = nom;
	}
/**
 *  getPrenom
 * @return String prenom
 */
	public String getPrenom() {
		return prenom;
	}
/**
 *  setPrenom
 * @param prenom : modifile prenom
 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
/**
 * getAdresseRueUsager
 * @return String adresseRueUsager
 */
	public String getAdresseRueUsager() {
		return adresseRueUsager;
	}
/**
 * setAdresseRueUsager
 * @param adresseRueUsager : modifi l'adresse rue de l'usager
 */
	public void setAdresseRueUsager(String adresseRueUsager) {
		this.adresseRueUsager = adresseRueUsager;
	}
/**
 * getAdresseVilleUsager
 * @return String adresseVilleUsager
 */
	public String getAdresseVilleUsager() {
		return adresseVilleUsager;
	}
/**
 * setAdresseVilleUsager
 * @param adresseVilleUsager modifi l'adresse de la ville de l'usager
 */
	public void setAdresseVilleUsager(String adresseVilleUsager) {
		this.adresseVilleUsager = adresseVilleUsager;
	}
/**
 * getCpUsager
 * @return String le code postale de l'Usager 
 */
	public String getCpUsager() {
		return cpUsager;
	}
/**
 * setCpUsager
 * @param cpUsager : modifi le code postal de l'usager
 */
	public void setCpUsager(String cpUsager) {
		this.cpUsager = cpUsager;
	}
/**
 * getNomUser
 * @return String nomUser
 */
	public String getNomUser() {
		return nomUser;
	}
/**
 * setNomUser
 * @param nomUser modifie le nomUser
 */
	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}
/**
 * getMotDePasse
 * @return String motDePasse
 */
	public String getMotDePasse() {
		return motDePasse;
	}
/**
 * setMotDePasse
 * @param motDePasse : modifi le mot de passe de l'usager
 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
/**
 * getIdUsager
 * @return String idUsager
 */
	public String getIdUsager() {
		return idUsager;
	}
/**
 * ToString
 */
	@Override
	public String toString() {
		return "Usager [idUsager=" + idUsager + ", nom=" + nom + ", prenom=" + prenom + ", adresseRueUsager="
				+ adresseRueUsager + ", adresseVilleUsager=" + adresseVilleUsager + ", cpUsager=" + cpUsager
				+ ", nomUser=" + nomUser + ", motDePasse=" + motDePasse + "]";
	}
	
}
