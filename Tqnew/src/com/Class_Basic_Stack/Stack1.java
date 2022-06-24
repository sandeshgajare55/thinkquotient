package com.Class_Basic_Stack;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack();
		st.add(10);
		st.add(34);
		st.add(67);
		st.add(23);
		
		st.pop();
		st.pop();
		
		System.out.println(st.peek());
		
		System.out.println(st);

	}

}
