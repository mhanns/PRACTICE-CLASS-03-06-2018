//Maurice Hanns CSC 242 03/06/2018

import  java.util.Scanner;

public class largeSml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 3 numbers to determine the largest and smallest.");
		
		System.out.println("\nPlease enter the first number");
		int numb1 = input.nextInt();
		
		System.out.println("Please enter the second number");
		int numb2 = input.nextInt();
		
		System.out.println("Please enter the third number");
		int numb3 = input.nextInt();
		
		if (numb1 > numb2 && numb1 > numb3 )
		{
			System.out.println("The first number is largest");
		}
		else if (numb2 > numb3)
		{
			System.out.println("The second number is largest");			
		}
		else
		{
			System.out.println("The third number is largest");
		}

		if (numb1 < numb2 && numb1 < numb3 )
		{
			System.out.println("The first number is smallest");
		}
		else if (numb2 < numb3)
		{
			System.out.println("The second number is smallest");			
		}
		else
		{
			System.out.println("The third number is smallest");
		}
		
		
	}

}
