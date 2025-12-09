package day6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Test {

	public static void main(String[] args) {
		
		try 
		{
			FileReader fr = new FileReader("summa.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			line = br.readLine();
			while(line != null)
			{
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
			FileWriter fw = new FileWriter("summa.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String[] names = {"Ram" , "Sam" , "Jas" , "Bas"};
			for(String i : names)
			{
				bw.write(i + "\n");
			}
			bw.close();
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error bro");
		}

	}

}
