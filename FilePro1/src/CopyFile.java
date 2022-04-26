import java.io.*;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter source file name");
			String sfile=sc.nextLine();
			System.out.println("Enter destination file name");
			String dfile=sc.nextLine();
			FileInputStream fis=new FileInputStream(sfile+".txt");
			FileOutputStream fos=new FileOutputStream(dfile+".txt");
			int r=0;
			while((r=fis.read())!=-1)
			{
				fos.write(r);
			}
			System.out.println("File copied");
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
