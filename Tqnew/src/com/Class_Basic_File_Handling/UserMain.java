package com.Class_Basic_File_Handling;

import java.util.Scanner;

class User {
	private String username = "pooja";
	String location = "pune";

	void display_user() {
		System.out.println("username is..." + username);
		System.out.println("location is...." + location);
	}

	class Password {
		String pass = "pooh123";

		void check_user() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name");
			String name = sc.next();
			if (username.equals(name)) {
				System.out.println("Authentic user");
				display_user();
				System.out.println("password is..." + pass);

			} else
				System.out.println("Incorrect username and password");

		}
	}
}

public class UserMain {

	public static void main(String[] args) {
		// create object of outer class
		User u = new User();
//outerclass.innerclass obj=outerclassobject.new innerclass		
		User.Password p = u.new Password();
		p.check_user();

	}

}
