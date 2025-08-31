package com.lang.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Student student = new Student("A", "1", "100");

		try (FileOutputStream fo = new FileOutputStream("student.ser");
				ObjectOutputStream os = new ObjectOutputStream(fo);) {
			
			os.writeObject(student);
			
		}
	}
}
