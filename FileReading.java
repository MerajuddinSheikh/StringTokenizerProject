package filereading;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReading {
	public static void main(String[] args)throws Exception{
		String lines=" ";
		int count=0;
		String filepath="d:\\meraj2.txt";
		FileReader fr= new FileReader(filepath);
		BufferedReader br = new BufferedReader(fr);
		String line=br.readLine();
		
		
		while(line !=null){
			lines = line + ",";
		
			System.out.println(lines);
			line=br.readLine();
			
		}
		
		br.close();
		fr.close();
	}
}
