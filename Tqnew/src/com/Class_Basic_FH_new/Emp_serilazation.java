package com.Class_Basic_FH_new;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Emp implements java.io.Serializable {

	public int id;
	public String name;

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class Emp_serilazation {

	public static void main(String args[]) throws IOException, ClassNotFoundException {
		
		Emp e1 = new Emp(101,"Sandesh");
		Emp e2 = new Emp(102,"Sarvesh");
		Emp e3 = new Emp(103,"Sanket");
		Emp e4 = new Emp(104,"Shubham");
		Emp e5 = new Emp(105,"Saigon");
	
		FileOutputStream fout = new FileOutputStream("new.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(e1);
		out.writeObject(e2);
		out.writeObject(e3);
		out.writeObject(e4);
		out.writeObject(e5);
		
		out.close();
		fout.close();
		
		System.out.println("Object has been serialized");

		//De-serialization Part
		
		Emp ne1=null;
		Emp ne2=null;
		Emp ne3=null;
		Emp ne4=null;
		Emp ne5=null;
		
		FileInputStream fin =new FileInputStream("new.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		
		ne1=(Emp)in.readObject();
		ne2=(Emp)in.readObject();
		ne3=(Emp)in.readObject();
		ne4=(Emp)in.readObject();
		ne5=(Emp)in.readObject();
		
		in.close();
		fin.close();
		
		System.out.println("Deserialization Done..!!!");
		
		System.out.println();
		System.out.println(" E1 : ID "+e1.id);System.out.println("Name : "+e1.name);
		System.out.println(" E2 : ID "+e2.id);System.out.println("Name : "+e2.name);
		System.out.println(" E3 : ID "+e3.id);System.out.println("Name : "+e3.name);
		System.out.println(" E4 : ID "+e4.id);System.out.println("Name : "+e4.name);
		System.out.println(" E5 : ID "+e5.id);System.out.println("Name : "+e5.name);

	}
}
