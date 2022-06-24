package com.looping;

import java.util.*;
import java.math.*;

public class Amstrongno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to find out whether it is amstrong or not :");
		int num = sc.nextInt();
		int on, rm, n = 0;
		int fin = 0;
		int pow = 1;
		on = num;

//	    for(on=num;on!=0;n++)
//	    {
//	    	on=on/10;
//	    }
//for (on = num; on != 0; on = on / 10) 

		while (on != 0) {
			rm = on % 10;
			on = on / 10;
			fin = fin + rm * rm * rm;
		}

		if (fin == num) {
			System.out.println(num + " is an Armstrong number");
		} else {
			System.out.println(num + " is not an Armstrong number.");
		}

	}

}
