package packpraktika1;
import java.util.*;

public class Aktorea {
	
	private String 				izena;
	private ListaPelikulak		starringPelikula; //Jardun duen pelikularen posizioa (errenkada) gordeko da
	
	public Aktorea(String pIzena){
		
		this.izena = pIzena;
	}
	
	public void gehituPelikula(Pelikula pFilma){
		
		this.starringPelikula.gehituAktorea(pFilma);
	}

}
