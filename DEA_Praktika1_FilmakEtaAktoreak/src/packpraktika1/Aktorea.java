package packpraktika1;
import java.io.PrintWriter;
import java.util.*;

public class Aktorea {
	
	private String 				izena;
	private ListaPelikulak		starringPelikula; //Jardun duen pelikularen posizioa (errenkada) gordeko da
	
	public Aktorea(String pIzena){
		
		this.izena = pIzena;
		starringPelikula = new ListaPelikulak();
	}
	
	public void gehituPelikula(Pelikula pFilma){
		
		this.starringPelikula.gehituPelikula(pFilma);
	}

	
	public void inprimatuAktorea(){
		
		System.out.println("\nIzen Osoa: " + this.izena + "\n\n");
		
	}
	
	public void idatziAktorearenIzena(PrintWriter pOutputStream){
		
		pOutputStream.println(this.izena);
	}
	
	public void aktoreBatenPelikulakBilatu(Aktorea pAktore) {
		
		AktoreGuztiak aktoreak = AktoreGuztiak.getNireAktoreak();
		Aktorea bilatuNahiDenAktorea = null;
		bilatuNahiDenAktorea = aktoreak.aktoreaBilatu(pAktore);		
		System.out.println(bilatuNahiDenAktorea.starringPelikula);		
		
	}
		
		
}
