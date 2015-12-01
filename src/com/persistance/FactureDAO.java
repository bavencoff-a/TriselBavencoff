package com.persistance;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.util.ArrayList;

import com.metier.Facture;

public class FactureDAO extends DAO<Facture> {

	@Override
	public boolean create(Facture obj) {
		// TODO Auto-generated method stub
		Connection cnx = AccesBd.getInstance();
		
		try{
			
			String sql = "INSERT INTO Facture(,Nom,Annee,Mois,IdHabitation) VALUES('"+obj.getNomF()+"',"+obj.getAnnee()+",'"+obj.getMois()+","+obj.getIdHabitation()+"');";
			System.out.println("log test 1 ");
			Statement requete = cnx.createStatement();
			System.out.println("create = "+requete.execute(sql));

			
		}
		catch(Exception e){
			System.out.println("Erreur");
		}
		return false;
	}

	@Override
	public boolean delete(Facture obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Facture obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Facture find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Facture find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Facture> retrieve() {
		// TODO Auto-generated method stub
		return null;
	}

}
