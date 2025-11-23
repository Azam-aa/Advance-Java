package com.tap;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception {
	public static void main(String[] args) {
			
		
		try {
		
			FileReader fr = new FileReader("abc.txt");
			System.out.println("File is opened");
			
		} catch(FileNotFoundException f) {
			System.out.println("File is not found");
		}
		
		
	}
}
