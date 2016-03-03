package zork;
import java.util.Random;


import java.util.Scanner;

public class Foyer {

	public static void main(String[] args) {
		
		String start ="";
		String frontRoom ="";
		String lib= "";
		String diningRoom = "" ;
		String kitchen = "";
		String parlor = "";
		String vault = "";
		String secret = "";
		
		while ( start != "exit")
		
		{
			start = callStart();
			{
			if (start == "frontRoom")
				frontRoom = callFront();
			
				{
				if (frontRoom.equals("lib"))
					lib = callLib();

							{
							if (lib.equals("diningRoom"))
								diningRoom = callDine();
							{
								if (diningRoom.equals("lib"))
									lib = callLib();	
							
							}
							
							}
							
							
				}
				 {
					 if (frontRoom.equals ("kitchen"))
					kitchen = callKitchen();
					 {
							if (kitchen.equals("frontRoom"))
								frontRoom = callFront();
							{
								if (kitchen.equals("parlor"))
									parlor = callParlor();	
								{
									if (parlor.equals("vault"))
										vault = callVault();
								}
							}
							
							}
							
					
					
			}
						
							
					
			
			}
			
		 if(start == "exit")
				System.out.println("Your a coward");
			
			
			
		 
			}
			
	}
			
			
			
	
			
			
		
	


	
	
	public static String callStart()
	{
       String start = "";
       
       String retValue= "";
       
       Scanner keyboard = new Scanner(System.in);
       
		System.out.println("Which room would you go to: frontRoom or exit");
		start = keyboard.next();
		
		if (start.equals("frontRoom"))
			retValue = "frontRoom";
		
		else if (start.equals("exit"))
			retValue = "exit";
		
		else 
			retValue = "";
		
		return retValue;
   }
	
	
	
	public static String callFront()
	{
       String room = "";
       String retValue= "";
       
       Scanner keyboard = new Scanner(System.in);
       
		System.out.println("Which room would you go to: lib or kitchen");
		room = keyboard.next();
		
		if (room.equals("lib"))
			retValue = "lib";
		
		else if (room.equals("kitchen"))
			retValue=  "kitchen";
		
		else 
			retValue = "";
		
		return retValue;
		
   }
	
	
	
	
	
	public static String callLib()
	{
		String retValue = "";
       String lib = "";
       
       Scanner keyboard = new Scanner(System.in);
       
		System.out.println("Which room would you go to: diningRoom or frontRoom");
		lib = keyboard.next();
		
	if (lib.equals("diningRoom"))
			retValue = "diningRoom";
	
	else if (lib.equals("frontRoom"))
		retValue = "frontRoom";
	
	else retValue = "";
	
return retValue;
	
	
}
	
	
	

	public static String callKitchen()
	{
       String next = "";
       
       String retValue= "";
       
       Scanner keyboard = new Scanner(System.in);
       
		System.out.println("Which room would you go to: frontRoom or parlor");
		next = keyboard.next();
		
		if (next.equals("frontRoom"))
			retValue = "frontRoom";
		
		else if (next.equals("parlor"))
			retValue = "parlor";
		
		else 
			retValue = "";
		
		return retValue;
   }
	
	
	
	
	
	
	public static String callDine()
	{
       String diningRoom = "";
       
       String retValue ="";
       
       Scanner keyboard = new Scanner(System.in);
       
		System.out.println("Go back to library: type lib");
		diningRoom = keyboard.next();
		
	if (diningRoom.equals("lib"))
			retValue = "lib";
	
	else retValue = "";
	
	return retValue;
	
	}
	
	
	
	public static String callParlor()
	{
       String now = "";
       
       String retValue ="";
       
       Scanner keyboard = new Scanner(System.in);
       
		System.out.println("Enter vault or kitchen");
		now = keyboard.next();
		
	if (now.equals("vault"))
			retValue = "vault";
	
	else if (now.equals("kkitchen"))
		retValue = "kitchen";
	
	else retValue = "";
	
	return retValue;
	}
	
	
	
	public static String callVault()
	{
       String now = "";
       
       String retValue ="";
       
       Random rnd = new Random();
       int randomInt = 1 + rnd.nextInt(4);
       
       System.out.println("Generated number: " + randomInt);
       
       if (randomInt == 1)
       {System.out.println("TREASURE");
	retValue = "secret";
       }
       else 
       {   
    	   System.out.println("Back into parlor");
    	   retValue = "parlor";
       }
	return retValue;
	}
	
	
}
	
	
	

