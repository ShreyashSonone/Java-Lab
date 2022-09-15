/*
Program: Java program to print tagline of the brand entered(take any 5 brands)
@author: Shreysh Sonone
@date: 15 Sep 2022 
*/

import java.util.Scanner; // importing scanner class
class PrintTagline //creating class
{
	static void printTagline(String choice) // creating method printTagline()
	{
		    
		switch(choice)  // printing desired output
		{  
			case "nike"-> System.out.println(" Nike : Just do it.");   //if nike
		
			case "apple"-> System.out.println("Apple : Think Different.");    //if apple
			
			case "redbull"-> System.out.println(" RedBull: Red Bull Gives You Wings");  //if redbull
			
			case "asus"-> System.out.println(" Asus : For Those Who Dare");  //if asus
			
			case "oneplus"-> System.out.println(" OnePlus : Never Settle"); //if oneplus

			default -> System.out.println("Wrong Input"); //if user enter any other company or mistakely wrong input
            
		}
	}

  
	public static void main(String[] args) // Main method
	{    
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a Company for tagline: ");  //asking user to enter company name
		String str= sc.nextLine().toLowerCase();;   //reads string 
		printTagline(str); // calling printTagline() method
		
	}   
}

