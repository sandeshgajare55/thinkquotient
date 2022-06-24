package com.Class_Basic_Hash;
import java.util.ArrayList;
public class T_twenty {

	public static void main(String[] args) {
		
		ArrayList <Players_demo> pd = new ArrayList<>();
		
		pd.add(new Players_demo(11,"MS Dhoni","India","CSK"));
		pd.add(new Players_demo(12,"MS Dhoni","India","MI"));
		pd.add(new Players_demo(13,"Josh Hazelwood","Austrialia","RCB"));
		pd.add(new Players_demo(14,"Aaron Finch","Austrialia","KKR"));

		System.out.println(pd);
		
		for(Players_demo i:pd)
		{
			if(i.p_country.equals("Austrialia"))
			{
				System.out.println(i);
			}
		}
	}

}
