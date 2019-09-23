package packpraktika1;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaPelikulak {

	private ArrayList<Pelikula> zerrenda;
	
	public ListaPelikulak(){
		
		this.zerrenda = new ArrayList<Pelikula>();
	}
	
	
	
	private Iterator<Pelikula> getIteradorea(){
		
		return this.zerrenda.iterator();
	}
	
	public void gehituAktorea(Pelikula pFilma){
		
		this.zerrenda.add(pFilma);
	}
	
	public void ezabatuFilma(Pelikula pFilma){
		
		this.zerrenda.remove(pFilma);
	}
	
}
