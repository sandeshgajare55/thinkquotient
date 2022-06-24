package com.Class_Basic_Stack;
import java.util.Iterator;
import java.util.Stack;

public class UserDefinedStack {

	public static void main(String[] args) {
Stack<Item1> st=new Stack();

Item1 i1=new Item1(1,"Mobile");
Item1 i2=new Item1(2,"HeadPhones");
Item1 i3=new Item1(3,"Charger");
Item1 i4=new Item1(4,"Speaker");

st.add(i1);
st.add(i2);
st.add(i3);
st.add(i4);


System.out.println(st);

st.pop();

System.out.println(st);


System.out.println(st.peek());

Iterator<Item1> id= st.iterator();

while(id.hasNext())
{
	Item1 i=id.next();
	
	if(i.item_anme.equals("HeadPhones"))
	{
		System.out.println(i.item_id+" "+i.item_anme);
	}
}










	}

}
