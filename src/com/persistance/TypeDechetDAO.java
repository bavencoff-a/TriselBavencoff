package com.persistance;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.metier.TypeDechet;
import com.metier.Usager;

public class TypeDechetDAO extends DAO<TypeDechet> {

	@Override
	public boolean create(TypeDechet obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(TypeDechet obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(TypeDechet obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TypeDechet find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeDechet find(String id) {
		// TODO Auto-generated method stub
		Connection cnx = AccesBd.getInstance();
		String libelle;
		Double tarif;
		ResultSet rsTypedechet;
		TypeDechet TypeDechet = null;
		try{

			String sql = "SELECT * FROM typedechet WHERE idTypeDechet = '" + id + "' ;";
			
			rsTypedechet = cnx.createStatement().executeQuery(sql);
			if(rsTypedechet.next()){
				libelle = rsTypedechet.getString("libelle");
				tarif = rsTypedechet.getDouble("tarif");
				
				TypeDechet = new TypeDechet(id,libelle,tarif);
			}
			
			
		}
		catch(Exception e){
			System.out.println("Erreur");
		}
		return TypeDechet;
	}

	@Override
	public ArrayList<TypeDechet> retrieve() {
		// TODO Auto-generated method stub
		return null;
	}

}
