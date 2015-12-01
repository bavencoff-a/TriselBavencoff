package com.metier;

public class TypeDechet {
	
	private String code;
	private String libelle;
	private Double tarif;
	/**
	 * constructeur TypeDechet
	 * @param code (string)
	 * @param libelle (string)
	 * @param tarif (Double)
	 */
	public TypeDechet(String code, String libelle, Double tarif) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.tarif = tarif;
	}
	/**
	 * getLibelle
	 * @return String libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * setLibelle
	 * @param libelle (String) : modifie le libelle 
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * getTarif
	 * @return Double tarif
	 */
	public Double getTarif() {
		return tarif;
	}
	/**
	 * setTarif
	 * @param tarif (Double) modifie le tarif
	 */
	public void setTarif(Double tarif) {
		this.tarif = tarif;
	}
	/**
	 * getCode
	 * @return String code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * ToString
	 */
	@Override
	public String toString() {
		return "TypeDechet [code=" + code + ", libelle=" + libelle + ", tarif=" + tarif + "]";
	}
	
}
