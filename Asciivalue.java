/*
Program: Java program to check the input is vowel,constant,number or special character and print its ascii value
@author: Shreysh Sonone
@date: 18 august 2022 
*/

class asciivalue
{
	static void asciivalue() 
	{
		char ch = '}';
		int ascii = ch;
		System.out.println("The ASCII value of " + ch + " is: " + ascii); // printing ASCII value
		    
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) // checking for character
			
		
			{
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') // checking for vowels
						System.out.println(ch + " is vowel");
					
				else
						System.out.println(ch + " is consonant"); 
					
			}
             

         else if(ch >= '0' && ch <= '9') // checking for digit
		
				{

					System.out.println(ch + " is a digit.");

				}	
				else 
				{
					
				System.out.println(ch + " is a special character.");
				
				}
			
		
		}


  
	public static void main(String[] args) // main method
	{    
		
		asciivalue(); // calling asciivalue()
	
	}   
}
