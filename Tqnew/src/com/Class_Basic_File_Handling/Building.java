package com.Class_Basic_File_Handling;
 class Building1 {
	String b_name="sapna society";
	int t_flats=20;
	int main_amount=2500;
private	static int deposit_amount=500000;

         void show()
         {
        	 System.out.println("building anme is"+b_name);
        	 System.out.println("total flats are..."+t_flats);
        	 System.out.println("Maintenance amount is..."+main_amount);
         }
         
      static   void dep_amount()
         {
    	 
        	 System.out.println("total amount with building is.."+deposit_amount);
         }


static   class Manager
  {
	
	  void show_manager()
	  {
		  System.out.println("total amount with building is.."+deposit_amount);
		  dep_amount();
	  }
  }
 }

public class Building 
{
	public static void main(String[] args) {
		Building1 b=new Building1();
		b.show();
		Building1.Manager m=new Building1.Manager();
		m.show_manager();
		

	}

}
