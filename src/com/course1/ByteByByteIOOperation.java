package com.course1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteByByteIOOperation {

	public static void main(String[] args) {
		File f1 = new File("Users/nandi/OneDrive/Desktop/test1.txt/test1.txt");
		System.out.println(f1.getAbsoluteFile());

		FileInputStream fis;
		FileOutputStream fos;
		try {
			fis = new FileInputStream(f1);
			fos = new FileOutputStream(new File("Users/nandi/OneDrive/Desktop/test1.txt/testoutput.txt"));

			int t;
			while ((t = fis.read()) != -1) {
				fos.write(t);
			}
			

			fos.close();
			fis.close(); // After Parent have to close

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException exp) {
			exp.printStackTrace();
		}

	}

}
