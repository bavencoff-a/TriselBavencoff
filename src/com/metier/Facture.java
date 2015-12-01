package com.metier;



public class Facture {
	
	private int idF;
	
	private String idHabitation;
	private String nomF;
	
	private int moisF;
	private int anneeF;
	
	public Facture(String nom,int a,int m,String idH){
		idHabitation = idH;
		nomF = nom;
		moisF = m;
		anneeF = a;
		
	}
	public Facture(int id,String nom,int a,int m,String idH){
		idF = id;
		idHabitation = idH;
		nomF = nom;
		moisF = m;
		anneeF = a;
	}
	public int getIdF() {
		return idF;
	}
	public String getIdHabitation() {
		return idHabitation;
	}
	public void setIdHabitation(String idHabitation) {
		this.idHabitation = idHabitation;
	}
	public int getMois() {
		return moisF;
	}
	public void setMois(int mois) {
		this.moisF = mois;
	}
	public int getAnnee() {
		return anneeF;
	}
	public void setAnnee(int annee) {
		this.anneeF = annee;
	}
	public String getNomF() {
		return nomF;
	}
	public void setNomF(String nomF) {
		this.nomF = nomF;
	}
}
