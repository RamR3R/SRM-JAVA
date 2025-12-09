package day6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		try {
			
			FileWriter writer = new FileWriter("srm.txt" , true);
			BufferedWriter bw = new BufferedWriter(writer);		
//			bw.write("Ram is the Trainer for this");
			
			String[] names = {"Ram" , "Sam" , "Jam" };
			
			for(String i : names)
			{
				bw.write(i+"\n");
			}
			
			
			bw.close();
//			writer.write("\nTrying out file operations");
//			writer.close();
//			FileReader reader = new FileReader("srm.txt");
//			BufferedReader br = new BufferedReader(reader);
//			
//			String line = br.readLine();
//			line = br.readLine();
//			line = br.readLine();
//			System.out.println(line);
			
			
//			int x = reader.read();
//			while(x != -1)
//			{
//				System.out.print((char)x);
//				x = reader.read();
//			}
//			System.out.println(x);
			
			System.out.println("Success reading");
		} 
		catch (Exception e) 
		{
			System.out.println("Error in file");
		}
	}

}
