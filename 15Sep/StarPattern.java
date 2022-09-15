
/*
Program: Java program to print a pattern 		
   *		
  * *		
 * * *		
* * * *		
( pattern when the input is 4)
@author: Shreysh Sonone
@date: 15 Sep 2022 
*/

import java.util.Scanner; // importing scanner class
class StarPattern //creating class
{
	static void starPattern(int noOfRows) // creating method starPattern()
	{
		
		for(int i=1;i<=noOfRows;i++) //for loop for rows in pattern
		{
			System.out.println(); //blank output to get in the row
			
			for(int spaces=noOfRows;spaces>i;spaces--) //for loop for spaces in pattern spaces will reduce as rows will increase so  spaces--
			{
				System.out.print(" "); //creating space in between
			}
			
			for(int j=1;j<=i;j++)  //for loop for column in pattern
			{
				System.out.print("* "); //printing star in column
			}
			
			
		}
		
		
	}
	
		
   public static void main(String... args) //calling main method
   {
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter number to print the rows of star - "); // asking user to give input 
		int numOfRows= sc.nextInt();  //reading input
		starPattern(numOfRows); //calling method starPattern()
      
   }


}