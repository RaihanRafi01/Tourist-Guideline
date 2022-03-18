                 
				 // Using File I/O
package shylet;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class AvailableFood {

	
	public void FoodInfo(){
		File f = new File("Food.txt");
		try {
			
			f.createNewFile();
			
		}
		catch (IOException io) {
			System.out.println("IOException occurred");
		}

		

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);

			String line = "";
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch (IOException io) {
			System.out.println("IOException occurred");
		}
		finally {
			try {
				fr.close();
			}
			catch (IOException io1) {
				System.out.println("Can not close the resource");
			}
		}
	}

}