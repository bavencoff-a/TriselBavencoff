package com.persistance;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.metier.Habitation;

import com.metier.Poubelle;

import com.metier.Usager;

public class HabitationDAO extends DAO<Habitation> {

	@Override
	public boolean create(Habitation obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Habitation obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Habitation obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Habitation find(int id) {
			return null;
	}

	@Override
	public Habitation find(String id) {
		Connection cnx = AccesBd.getInstance();
		String adresseRue,codePostal,adresseVille,idUsager;
		PoubelleDAO pbDAO = new PoubelleDAO();
		UsagerDAO usDAO = new UsagerDAO();
		
		Habitation habitation = null;
		Usager usager ;
		ResultSet rsPoubelle,rsHabitation;
		Poubelle poubelle = null;

		
		try{
			
			String sql = "SELECT * FROM habitation WHERE idHabitation = '" + id + "' ;";
		
			rsHabitation = cnx.createStatement().executeQuery(sql);
			if(rsHabitation.next()){
				adresseRue = rsHabitation.getString("adresseRue");
				codePostal = rsHabitation.getString("codePostal");
				adresseVille =rsHabitation.getString("adresseVille");
				idUsager = rsHabitation.getString("idUsager");
				
				usager = usDAO.find(idUsager);
				
				habitation = new Habitation(id,adresseRue,codePostal,adresseVille,usager);
				
				sql = "SELECT idPoubelle FROM poubelle WHERE  idHabitation = '" + id + "' ;";
				rsPoubelle = cnx.createStatement().executeQuery(sql);
				
				while(rsPoubelle.next()){
					poubelle = pbDAO.find(rsPoubelle.getString("idPoubelle"));
					habitation.ajoutPoubelle(poubelle);
				}
			}
			
			
		}
		catch(Exception e){
			System.out.println("Erreur");
		}

		return habitation;
	}

	@Override
	public ArrayList<Habitation> retrieve() {
		// TODO Auto-generated method stub
		ArrayList<Habitation> lesHab = new ArrayList<Habitation>();
		
		
		Connection cnx = AccesBd.getInstance();
		ResultSet rsHabitation;
		try{
			String sql = "SELECT idHabitation FROM habitation;";
			
			rsHabitation = cnx.createStatement().executeQuery(sql);
			while(rsHabitation.next()){
				lesHab.add(this.find(rsHabitation.getString("idHabitation")));
			}
		}
		catch(Exception e){
			System.out.println("Erreur");
		}
		
		return lesHab;
	}

}
