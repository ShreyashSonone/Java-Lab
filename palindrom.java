/*
Program: Java program to check the number is palindrom or not
@author: Shreysh Sonone
@date: 18 august 2022 
*/

class palindrom
{
	static void checkpalindrom(int n) // taking input from user
	{
		int r,sum=0,temp;    
		
		temp=n;  
		
		while(n>0)
		{    
			r=n%10;  //getting remainder  
			sum=(sum*10)+r;    
			n=n/10;    
		} 
		
		if(temp==sum) 			
		System.out.println("palindrome number ");  
	
		else   			
		System.out.println("not palindrome");        
		
            
		
	}

  
	public static void main(String[] args) 
	{    
		int p =Integer.parseInt(args[0]);  // calling checkpalindrom()
		checkpalindrom(p);
	
	}   
}
