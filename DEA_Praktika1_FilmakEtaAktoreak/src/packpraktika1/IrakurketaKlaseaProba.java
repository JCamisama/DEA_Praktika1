package packpraktika1;
import java.io.*;
import java.util.*;

public class IrakurketaKlaseaProba {
	
	private Scanner x;
	
	
	
	public void fitxategiaIreki(){
		
		String filename = "FilmakAktoreak.txt";
		try{
			
			x = new Scanner(new File(filename));
		}
		
		catch(Exception e){
			
			System.out.println("Fitxategia ez da aurkitu.");
		}
	
	}
	
	public void fitxategiaIrakurri(){
		
		//while(x.hasNextLine()){
			
			String		lerroa			= this.x.nextLine();
			String[]	peliAktBanatuak = lerroa.split("\\s+--->\\s+");
			String		pelikulaIzena	= peliAktBanatuak[0];
			String[]	aktoreak		= peliAktBanatuak[1].split("\\s+&&&\\s+");
			
			
			Pelikula pelikulaHau = new Pelikula(pelikulaIzena);
			
			
			
			System.out.println(peliAktBanatuak[0]);
			System.out.println(peliAktBanatuak[1]);
			
		//}
	}
	
	public void fitxategiaItxi(){
		
		this.x.close();
	}

	public static void main(String[] args){
		
		IrakurketaKlaseaProba cHau = new IrakurketaKlaseaProba();
		
		cHau.fitxategiaIreki();
		cHau.fitxategiaIrakurri();
		cHau.fitxategiaItxi();
	}
}
