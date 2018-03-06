//Maurice Hanns CSC 242 03/06/2018

	//String Country;
	//int Population;
	//double Area;

import  java.util.Scanner;

public class AnotherCountry {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	//Scanner input = new Scanner(System.in);
		
	//System.out.println("\nPlease enter the first number");
	
	countryAgn country1 = new countryAgn("United States", 324459463, 9525067);
	countryAgn country2 = new countryAgn("China", 1409517397, 9572900);	
	
	ComparePopulation(country1.Population, country2.Population);
	
	}//main

	public static void ComparePopulation(int A, int B){
	if (A > B){
		System.out.println("The US is Bigger");		
	}
	else{
		System.out.println("China is Bigger");		
	}
		
		
	
	return;
	}//ComparePopulation method
	
	
}//Country class
