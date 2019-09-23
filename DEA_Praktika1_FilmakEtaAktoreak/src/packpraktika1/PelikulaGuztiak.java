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

}
