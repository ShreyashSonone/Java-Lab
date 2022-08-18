/*
Program: Java program to print tagline of the brand entered(take any 5 brands)
@author: Shreysh Sonone
@date: 18 august 2022 
*/

class printTagline
{
	static void printTagline(int choice) // taking input from user
	{
		    
		switch(choice)  // printing desired output
		{  
			case 1-> System.out.println(" Nike : Just do it.");   
		
			case 2-> System.out.println("Apple : Think Different.");    
			
			case 3-> System.out.println(" RedBull: Red Bull Gives You Wings");  
			
			case 4-> System.out.println(" Asus : For Those Who Dare");  
			
			case 5-> System.out.println(" OnePlus : Never Settle"); 

			default -> System.out.println("Wrong Input"); 
            
		}
	}

  
	public static void main(String[] args) 
	{    
		int ch =Integer.parseInt(args[0]);  // calling printtagline()
		printTagline(ch);
	
	}   
}

