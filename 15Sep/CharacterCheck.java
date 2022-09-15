/*
Program: Java program to check the input is vowel,constant,number or special character and print its ascii value
@author: Shreysh Sonone
@date: 15 Sep 2022 
*/
import java.util.Scanner; // importing scanner class

class CharacterCheck  //creating class	
{
	static void checkChar(char ch) //creating method checkChar()
	{
		
		int ascii = ch; // converting char into int to get ascii value
		
		    
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) // checking for character
			
		
			{
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') // checking for vowels
						System.out.println(ch + " is vowel");  // print if vowel
					
				else
						System.out.println(ch + " is consonant");  // print if consonant
					
			}
             

         else if(ch >= '0' && ch <= '9') // checking for number
		
				{

					System.out.println(ch + " is a number."); // print if number

				}	
				else 
				{
					
					System.out.println(ch + " is a special character."); // print if special character
				
				}
			
		
		}


  
	public static void main(String[] args) // main method
	{  
	
		Scanner sc = new Scanner(System.in);   // input method
		System.out.print("Input a character -------->  ");  //asking user to enter character to check
		char c=sc.next().charAt(0);   // reading input
		checkChar(c); // calling asciivalue()
	
	}   
}


  