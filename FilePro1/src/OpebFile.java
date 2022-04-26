import java.util.Scanner;
import java.io.*;

public class OpebFile {

	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter file name ");
			String fname=sc.nextLine();
			FileInputStream fis=new FileInputStream(fname+".txt");
			int r=0;
			System.out.println("Content of file");
			System.out.println(".........................");
			while((r=fis.read())!=-1)
			{
				System.out.print((char)r);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
