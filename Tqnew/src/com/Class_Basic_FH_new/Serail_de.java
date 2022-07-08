package com.Class_Basic_FH_new;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Test implements java.io.Serializable {

	public int a;
	public String b;

	public Test(int a, String b) {
		this.a = a;
		this.b = b;
	}

}

public class Serail_de {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Test object = new Test(1, "Hello World..!!!");
		String filename = "file.ser";
		FileOutputStream file = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(object);
		out.close();
		file.close();
		System.out.println("Object has been serialized");
		
		Test object1 = null;
		FileInputStream filein = new FileInputStream(filename);
		ObjectInputStream in = new ObjectInputStream(filein);

		object1=(Test)in.readObject();

		in.close();
		filein.close();
		System.out.println("Object has been deserialized ");
		System.out.println("a = "+object1.a);System.out.println("b = "+object1.b);

}}
