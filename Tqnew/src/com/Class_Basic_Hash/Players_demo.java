package com.Class_Basic_Hash;

public class Players_demo {

	int p_id;
	String p_name,p_country,p_team;
	
	Players_demo(int id,String name,String country,String team)
	{
		p_id=id;
		p_name=name;
		p_country=country;
		p_team=team;
	}
	
	public String toString()
	{
		return p_id+" "+p_name+" "+p_country+" "+p_team;
	}
}
