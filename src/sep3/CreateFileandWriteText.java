package sep3;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CreateFileandWriteText {

	public static void main(String[] args) throws Throwable {
		//create a  new file
		File f = new File("D:/Minny.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Minny: Hellooooo");
		bw.newLine();
		bw.write("Me: Bollooooo");
		bw.newLine();
		bw.write("Minny:M dng");
		bw.newLine();
    	bw.write("Me: Ntg");
    	bw.flush();
    	bw.close();
		
		
		
		

	}

}
