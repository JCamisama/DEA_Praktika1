package packpraktika1;

import java.util.ArrayList;

public class PelikulaGuztiak {
	
	private static PelikulaGuztiak nirePelikulak;
	private ListaPelikulak zerrenda;
	
	private PelikulaGuztiak(){
			
			this.zerrenda = new ListaPelikulak();
		}
	public static synchronized PelikulaGuztiak getNirePelikulak(){
			
		if(PelikulaGuztiak.nirePelikulak == null){
			
			PelikulaGuztiak.nirePelikulak = new PelikulaGuztiak();
		}
		
		return PelikulaGuztiak.nirePelikulak;
	}
	
	public void gehituPelikula(Pelikula pFilma){
		
		this.zerrenda.gehituPelikula(pFilma);
	}
	
	public void ezabatuFilma(Pelikula pFilma){
		
		this.zerrenda.ezabatuFilma(pFilma);
	}
	
	public Pelikula pelikulaBilatu(Pelikula pFilma) {
		
		return this.zerrenda.pelikulaBilatu(pFilma);
	}
	
	
}
