package no.hvl.dat100.jplab11.oppgave4;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.Innlegg;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {
	protected Innlegg[] innleggtabell;

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		Blogg tekst = new Blogg();
		Innlegg[] nyttinnlegg = tekst.getSamling();
			
		try {
			
			BufferedWriter skriver = null;
			skriver = new BufferedWriter(new FileWriter("blogg.dat"));
			for(int i = 0; i < nyttinnlegg.length; i++) {
				skriver.write(nyttinnlegg[i]+"");
			}
			skriver.close();
					
			
			
		} catch (Exception e) {
			System.out.println("FEIL");
		}
		
		return true;
			
	}
	
}
