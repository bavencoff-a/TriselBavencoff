package com.persistance;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.metier.Levee;
import com.metier.Poubelle;
import com.metier.TypeDechet;

public class PoubelleDAO extends DAO<Poubelle> {

	@Override
	public boolean create(Poubelle obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Poubelle obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Poubelle obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Poubelle find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Poubelle find(String id) {
		
		Connection cnx = AccesBd.getInstance();
		String idTypeDechet,idHabitation;
		TypeDechetDAO tdDAO = new TypeDechetDAO();
		LeveeDAO lvDAO = new LeveeDAO();
		Levee laLevee;
		ResultSet rsPoubelle,rsLesLeve;
		TypeDechet TypeDechet = null;
		Poubelle poubelle = null;

		
		try{
			
			String sql = "SELECT * FROM poubelle WHERE idPoubelle = '" + id + "' ;";
			
			rsPoubelle = cnx.createStatement().executeQuery(sql);
			if(rsPoubelle.next()){
				idTypeDechet = rsPoubelle.getString("idTypeDechet");
				idHabitation = rsPoubelle.getString("idHabitation");
				
				TypeDechet = tdDAO.find(idTypeDechet);
				
				poubelle = new Poubelle(id,TypeDechet,idHabitation);
				
				sql = "SELECT idLevee FROM levee WHERE  idPoubelle = '" + id + "' ;";
				rsLesLeve = cnx.createStatement().executeQuery(sql);
				
				while(rsLesLeve.next()){
					laLevee = lvDAO.find(rsLesLeve.getInt("idLevee"));
					poubelle.ajoutLevee(laLevee);
				}
			}
			
			
		}
		catch(Exception e){
			System.out.println("Erreur");
		}
		
		return poubelle;
	}

	@Override
	public ArrayList<Poubelle> retrieve() {
		// TODO Auto-generated method stub
		return null;
	}

}
