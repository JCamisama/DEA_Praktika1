package packpraktika1;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;



public class ReadWriteProbaKlasea {

	/*
	public static void main(String[] args){
		
		String filename = "proba.txt";
		
		try{
			
			PrintWriter outputStream = new PrintWriter(filename);
			outputStream.println(" Hello there, this is just an innocent comment!");
			outputStream.flush();
			outputStream.close();
			
			System.out.print("Eginda!");
		}
		
		catch (FileNotFoundException e){
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
*/
/*
	public static void main(String[] args) throws IOException {
		
		FileWriter 		fw 		 = null;
		BufferedWriter  bw 	 	 = null;
		PrintWriter		pw 		 = null;
		String 			filename = "proba.txt";
		
		try{	
			
			fw = new FileWriter(filename, true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			pw.println("Shane");
			pw.println("Root");
			pw.println("Ben");
			
			System.out.println("Data succesfully appended into file!");
			pw.flush();
			
		}
		
		catch(IOException e){
			
			//Do nothing
		}
		
		finally{
			
			try{
				
				pw.close();
				bw.close();
				fw.close();
			}
			
			catch(IOException e){
				
				//Do nothing
			}
		}
		
		
	}
	
	*/
}
