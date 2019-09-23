package packpraktika1;

import java.util.ArrayList;

public class AktoreGuztiak {
	
	private static AktoreGuztiak nireAktoreak;
	private ListaAktoreak zerrenda;
	
	private AktoreGuztiak(){
		
		this.zerrenda = new ListaAktoreak();
	}
	
	public static synchronized AktoreGuztiak getNireAktoreak(){
		
		if( nireAktoreak == null){
			
			nireAktoreak = new AktoreGuztiak();	
		}
		
		return nireAktoreak;
	}

	public void gehituAktorea(Aktorea pAktore){
		
		this.zerrenda.gehituAktorea(pAktore);
	}
	
	public void ezabatuAktorea(Aktorea pAktore){
		
		this.zerrenda.ezabatuAktorea(pAktore);
	}
	
	
	public void inprimatuAktoreak(){
		
		this.zerrenda.inprimatuAktoreak();
	}
}
