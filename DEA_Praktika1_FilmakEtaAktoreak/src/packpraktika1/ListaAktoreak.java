package packpraktika1;

import java.io.PrintWriter;
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
	
	public Aktorea aktoreaBilatu(Aktorea pAktore) {
		
		Iterator<Aktorea>	itr			= this.getIteradorea();
		Aktorea				egungoAktorea	= null;
		boolean				topatua		= false;
		
		while( itr.hasNext() || topatua==true ){
			
			egungoAktorea = itr.next();
			
			if (egungoAktorea.equals(pAktore)) {
				
				topatua = true;	
				System.out.println("Zure aktorea listan dago");								
			}			
		}
		
		if (topatua == false) {
			
			System.out.println("Zure aktorea ez dago listan, baina orain sartuko dugu");
			this.gehituAktorea(pAktore);
			egungoAktorea = itr.next();
		}
		
	return egungoAktorea;
		
	}
	
		
	public void inprimatuAktoreak(){
		
		Iterator<Aktorea>	itr			= this.getIteradorea();
		Aktorea				aktoreHau	= null;
		
		while( itr.hasNext() ){
			
			aktoreHau = itr.next();
			aktoreHau.inprimatuAktorea();
		}
	}

	public void idatziAktoreGuztiak(PrintWriter pOutputStream){
		
		Iterator<Aktorea> itr		= this.getIteradorea();
		Aktorea			  aktoreHau = null;
		
		while(itr.hasNext() ){
			
			aktoreHau = itr.next();
			aktoreHau.idatziAktorearenIzena(pOutputStream);
		}
		
	}
}
