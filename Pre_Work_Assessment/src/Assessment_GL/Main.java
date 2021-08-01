package Assessment_GL;

import java.util.Scanner;



public class Main {

 

Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {
    	   System.out.println("Enter a number : ");
    	   int input=sc.nextInt();
    	   int remainder;
    	   int sum=0;
    	   int tmp=input;
    	   while (input>0)
    	   {
    		   
    		   remainder = input%10;
    		   
    		   sum = (sum*10)+remainder;
    		   input = input/10;
    		   
    		   
    	   }
    	   if (tmp==sum)
    	   {
    		   System.out.println("Entered number "+tmp+ " is Palindrome");
    	   }
    	   else
    	   {
    		   System.out.println("Entered number "+tmp+" is not Palindrome");
    	   }
    	   	
      }

 

            //function to printPattern

       public void printPattern() {
    	   
    	   System.out.println("Enter a value");
    	   int input = sc.nextInt();
    	 for (int i =1 ; i<=input;i++) {
    	   for (int j=i; j<=input;j++)
    	   {
    		   
    		   System.out.print("* ");
    	   }
    	
    	   System.out.println();
    	 }
      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
        	
        	System.out.println("Enter a number");
        	int input =sc.nextInt();
        	
        	if (input==1) {
        		System.out.println(input +" is Prime Number");
        	}
        	else
        	{
        		int c=0;
        		for (int i=2; i<input; i++)
        		{
        			if (input%i==0)
        			{
        				c=1;
        				break;
        			}
        			
        		}
        		if (c!=1)
        		{
        			System.out.println(input +" is Prime Number");
        		}
        		else
        		{
        			System.out.println(input +" is not Prime Number");
        		}
        	}

        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1;
           
           System.out.println("Enter a number");

           int input =sc.nextInt();
           
          int c=0;
          
          while (c<input+1)
          {
        	  System.out.print(first);
        	  int third = first+second;
        	  
        	  first=second;
        	  second=third;
        	  c=c+1;
        	  if(c!=input+1) {
        	  System.out.print(",");
        	  }
          }
           System.out.println();
          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}