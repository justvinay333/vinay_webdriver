package sep3;

//import java.io.File;
import java.io.*;

public class ReturnDatafromExistingFile {

	public static void main(String[] args) throws Throwable{
		FileReader fr = new FileReader("D:/Minny.txt");
		BufferedReader br = new BufferedReader(fr);
		//Null Declaration
		String str = "  ";
		while ((str= br.readLine())!=null)
		{
			System.out.println(str);
			
		}
		
		br.close();
		

	}

}
