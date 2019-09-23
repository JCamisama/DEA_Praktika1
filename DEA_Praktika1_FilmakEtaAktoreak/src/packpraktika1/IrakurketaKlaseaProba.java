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
			
		//HAU AZPIPROGRAMA BAT IZANGO DA	
			//Aktore eta pelikula guztien zerrendei deia
			PelikulaGuztiak	peliMaster	= PelikulaGuztiak.getNirePelikulak();
			AktoreGuztiak	aktorMaster	= AktoreGuztiak.getNireAktoreak();
			
			
			Pelikula	pelikulaHau		= new Pelikula(pelikulaIzena);
			int			AktorPosizio	= 0;
			
			/*while( AktorPosizio < aktoreak.length ){
				
				Aktorea	aktoreHau	= new Aktorea(aktoreak[AktorPosizio]);
				
				aktoreHau.gehituPelikula(pelikulaHau);
				aktorMaster.gehituAktorea(aktoreHau);  //ez errepikatzearena EZ DAGO INPLEMENTATUTA ORAINDIK
				peliMaster.gehituPelikula(pelikulaHau);//ez errepikatzearena EZ DAGO INPLEMENTATUTA ORAINDIK
				pelikulaHau.aktoreBerriaSartu(aktoreHau);
					
				
			}*/
			
			
			
			System.out.println(pelikulaIzena);
			//System.out.println(peliAktBanatuak[1]);
			
			//aktorMaster.inprimatuAktoreak();
			
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
