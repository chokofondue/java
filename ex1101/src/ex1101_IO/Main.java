package ex1101_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String path = "C:\\test\\test.txt";
		FileInputStream  fils = null;
		try {
			fils = new FileInputStream(new File(path));
			
			int input = 0;
			
			while((input = fils.read()) != -1) {
				System.out.print((char)input);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fils.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
}
