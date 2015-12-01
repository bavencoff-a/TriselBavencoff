package com.persistance;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.metier.Levee;
import com.metier.Usager;

public class UsagerDAO extends DAO<Usager> {

	@Override
	public boolean create(Usager obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Usager obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Usager obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usager find(int id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Usager find(String id) {
		// TODO Auto-generated method stub
		Connection cnx = AccesBd.getInstance();
		String nom,prenom,nomUser,mdpUser,adresseRue,adresseVille,code_Postal;
		ResultSet rsUsager;
		Usager usager = null;
		try{

			String sql = "SELECT * FROM usager WHERE idUsager = '" + id + "' ;";
			
			rsUsager = cnx.createStatement().executeQuery(sql);
			if(rsUsager.next()){
				nom = rsUsager.getString("nom");
				prenom = rsUsager.getString("prenom");
				nomUser=  rsUsager.getString("nomUser");
				mdpUser = rsUsager.getString("motDePasse");
				adresseRue = rsUsager.getString("adresse_Rue");
				adresseVille = rsUsager.getString("adresse_Ville");				
				code_Postal = String.valueOf(rsUsager.getString("code_Postal"));
				
				usager = new Usager(id,nom,prenom,adresseRue,adresseVille,code_Postal,nomUser,mdpUser);
			}
			
			
		}
		catch(Exception e){
			System.out.println("Erreur");
		}
		return usager;
	}

	@Override
	public ArrayList<Usager> retrieve() {
		// TODO Auto-generated method stub
		return null;
	}

}
