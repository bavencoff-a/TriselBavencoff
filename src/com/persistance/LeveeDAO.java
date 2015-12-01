package com.persistance;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.*;

import com.metier.Levee;

public class LeveeDAO extends DAO<Levee> {

	@Override
	public boolean create(Levee obj) {
		// TODO Auto-generated method stub
		Connection cnx = AccesBd.getInstance();
		
		try{
			
			
			Date laDateSQL = new java.sql.Date(obj.getLaDate().getTime());
			String sql = "INSERT INTO levee(laDate,poids,idPoubelle) VALUES('"+laDateSQL+"',"+obj.getPoids()+",'"+obj.getIdPoubelle()+"');";
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
	public boolean delete(Levee obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Levee obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Levee find(int id) {
		// TODO Auto-generated method stub
		Connection cnx = AccesBd.getInstance();
		Double poids;
		String idPoubelle;
		ResultSet rsLevee;
		Levee lv = null;
		try{
	
			
			
			String sql = "SELECT * FROM Levee WHERE idLevee = " + id + " ;";
			
			rsLevee = cnx.createStatement().executeQuery(sql);
			if(rsLevee.next()){
				Date dateUtil = new Date(rsLevee.getDate("laDate").getTime());
				poids = rsLevee.getDouble("poids");
				idPoubelle = rsLevee.getString("idPoubelle");
				
				lv = new Levee(id,dateUtil,poids,idPoubelle);
			}
			
			
		}
		catch(Exception e){
			System.out.println("Erreur");
		}
		
		return lv;
	}

	@Override
	public Levee find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Levee> retrieve() {
		// TODO Auto-generated method stub
		return null;
	}

}
