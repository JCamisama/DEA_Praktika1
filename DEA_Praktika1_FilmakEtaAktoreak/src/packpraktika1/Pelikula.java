package packpraktika1;
import java.util.ArrayList;



public class Pelikula{
	
	private String			izena;
	private int				diruBilketa;
	private ListaAktoreak	jardunDutenak;
	
	public Pelikula(String pIzena){
		
		this.izena			= pIzena;
		this.jardunDutenak	= new ListaAktoreak();
	}
	
	public void aktoreBerriaSartu(Aktorea pAktore){
		
		this.jardunDutenak.gehituAktorea(pAktore);
		
	}
	
	public void pelikulaBatenAktoreakBilatu(Pelikula pFilma) {
		
		PelikulaGuztiak pelikulak = PelikulaGuztiak.getNirePelikulak();
		Pelikula bilatuNahiDenPelikula = null;
		bilatuNahiDenPelikula = pelikulak.pelikulaBilatu(pFilma);
		System.out.println(bilatuNahiDenPelikula.jardunDutenak);	
		
	}
	
	//public void gehituAktorea

}
