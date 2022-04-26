import java.io.*;
import java.util.Scanner;

public class NewFile {

	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a file name");
			String fname=sc.nextLine();
			FileOutputStream fos=new FileOutputStream(fname+".txt",true);
			String str="Mainframe Computer";
			byte [] b=("\n"+str).getBytes();
			fos.write(b);
			fos.close();
			System.out.println("File saved");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
