package com.vue;
import java.io.FileNotFoundException;
import com.util.Parametre;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.sql.ResultSet;

import com.metier.*;
import com.persistance.AccesBd;
import com.persistance.DAO;
import com.persistance.HabitationDAO;
import com.persistance.LeveeDAO;
import com.persistance.PoubelleDAO;
import com.persistance.TypeDechetDAO;
import com.persistance.UsagerDAO;
import com.util.*;
import com.itextpdf.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
public class Programme {
	 
	public static void main(String[] args) {
		
		Parametre.testFacture();
		
	
		
		/*
		
		HabitationDAO hbDAO = new HabitationDAO();
		ArrayList<Habitation> lesHabitation = hbDAO.retrieve();
		
		if(lesHabitation.size() !=0){
			for(Habitation h : lesHabitation){
				double poids,tarif,tt =0.00;
				double toto = 0.00;
				ArrayList<Poubelle> lesPoubelles;
				System.out.println("                       FACTURE");
				System.out.println("___________________________________________________");
				System.out.println("Nom prenom : "+h.getUsager().getNom()+" "+h.getUsager().getPrenom());
				System.out.println("adresse : "+h.getAdresseRue()+ " "+h.getCodePostal() +" "+ h.getAdresseVille());
				System.out.println("____________________________________________________");
				System.out.println("code usager : "+h.getUsager().getIdUsager());
				System.out.println("Les pesées des poubelle au de mois de : juillet 2015");
				lesPoubelles = h.getLesPoubelle();
				for(Poubelle p : lesPoubelles){
					System.out.println("Poubelle : "+p.getIdPoubelle()+"  Nature des déchets : "+p.getNature().getLibelle());
					ArrayList<Levee> desLeves = p.getLesLevees(2015,07);
					for(Levee l : desLeves){
						poids = l.getPoids();
						tarif = p.getNature().getTarif();
						
						System.out.println("Date de pesée | nombre de kg | prix HT au kg | total ht |");
						System.out.println("      "+l.getLaDate()+"|     "+poids+"     |     "+tarif+"      |   "+tarif*poids+"  |");
						
						
					}
					toto = p.getCout(2015, 07);
					tt = tt + toto;
					System.out.println("total ht : "+toto);
				}
				
				System.out.println("total ht general : "+tt);
				System.out.println("Montant TVA : "+tt*0.20);
				System.out.println("Total TTC : "+tt*1.20);
				
				
			}
			
		}
		
		
	*/	
	}

}
