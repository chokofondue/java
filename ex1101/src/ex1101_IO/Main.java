package ex1101_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String path = "C:\\test\\test.txt";
		String path_01 = "C:\\test\\test_01.txt";
		
		FileInputStream  file = null;
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			//file = new FileInputStream(new File(path));
			fr = new FileReader(new File(path));
			
			int input = 0;
			
			while((input = fr.read()) != -1) {
				System.out.print((char)input);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			fw = new FileWriter(new File(path_01));
			fw.write("Hello World!!");
			
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
