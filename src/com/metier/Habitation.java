package com.metier;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Habitation {
	
	private String idHabitation;
	private String adresseRue;
	private String codePostal;
	private String adresseVille;
	private Usager Usager;
	private ArrayList<Poubelle> lesPoubelle;
	
	
	/**
	 *Constructeur de la classe habitation 
	 * @param idHabitation
	 * @param adresseRue
	 * @param codePostal
	 * @param adresseVille
	 * @param usager
	 */
	public Habitation(String idHabitation, String adresseRue, String codePostal, String adresseVille,
			com.metier.Usager usager) {
		super();
		this.idHabitation = idHabitation;
		this.adresseRue = adresseRue;
		this.codePostal = codePostal;
		this.adresseVille = adresseVille;
		Usager = usager;
		this.lesPoubelle = new ArrayList<Poubelle>();
	}
	/**
	 * getAdresseRue
	 * @return retourne l'adresseRue de type string
	 */
	public String getAdresseRue() {
		return adresseRue;
	}
	/**
	 * getCodePostal
	 * @return retourne le CodePostal de type string
	 */
	public String getCodePostal() {
		return codePostal;
	}
	/**
	 * getAdresseVille
	 * @return retourne l'Adresse Ville de type string
	 */
	public String getAdresseVille() {
		return adresseVille;
	}
	/**
	 * getUsager
	 * @see Usager
	 * @return retourne l'objet usager de l'habitation
	 */
	public Usager getUsager() {
		return Usager;
	}
	/**
	 * ajoutPoubelle
	 * @param unePoubelle est un objet poubelle qui seras ajoutee a l'arrayList de poubelle d'habitation
	 */
	public void ajoutPoubelle(Poubelle unePoubelle)
	{
		lesPoubelle.add(unePoubelle);
	}
	
	/**
	 * getLesPoubelle
	 * @return ArrayList<Poubelle> La liste des poubelles de l'habitation
	 */
	public ArrayList<Poubelle> getLesPoubelle() {
		return lesPoubelle;
	}
	/**
	 * getIdHabitation
	 * @return String retourne l'id de l'habitation
	 */
	public String getIdHabitation() {
		return idHabitation;
	}
	/**
	 *  getCout
	 *  parcoure les poubelles de la liste poubelle et fais appel a la methode getcout de poubelle
	 *  @see Poubelle
	 * @param an 
	 * @param mois
	 * @return double : revois le cout total des levee effectuee pendant le mois et l'annee pris en parametre
	 */
	public double getCout(int an,int mois)
	{
		//variable
		double lecout = 0.00;
		//debut
		for(Poubelle poubelle : lesPoubelle){
			lecout = lecout + poubelle.getCout(an, mois);
		}

		return lecout;
	}
	/**
	 * ToString
	 */
	@Override
	public String toString() {
		return "Habitation [idHabitation=" + idHabitation + ", adresseRue=" + adresseRue + ", codePostal=" + codePostal
				+ ", adresseVille=" + adresseVille + ", Usager=" + Usager + "]";
	}
	
	
}
