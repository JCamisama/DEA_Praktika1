package packpraktika1;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaAktoreak {
	
	private ArrayList<Aktorea> zerrenda;
	
	public ListaAktoreak(){
		
		this.zerrenda = new ArrayList<Aktorea>();
	}
	

	private Iterator<Aktorea> getIteradorea(){
		
		return this.zerrenda.iterator();
	}
	
	public void gehituAktorea(Aktorea pAktore){
		
		this.zerrenda.add(pAktore);
	}
	
	public void ezabatuAktorea(Aktorea pAktore){
		
		this.zerrenda.remove(pAktore);
	}

}
