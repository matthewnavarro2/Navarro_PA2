package Navarro_p2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		double bmiKg;
		double bmiLb;
		double kg;
		double lb;
		double meters, inches;
		
		String choice;
		
		
		System.out.println("Would you like your BMI using Kilograms or Pounds?\nEnter k or p");
		choice = scnr.next();
		if(choice.equals("k"))
		{
			System.out.println("How much do you weigh?");
			kg = scnr.nextDouble();
			System.out.println("How tall are you are you in Meters?");
			meters = scnr.nextDouble();
			bmiKg = (kg)/(meters*meters);
			System.out.println("Your BMI is: " + bmiKg);
			
			if(bmiKg <= 18.5)
			{
				System.out.println("You are underweight");
			}
			else if(bmiKg <= 24.9)
			{
				System.out.println("You are Normal weight");
			}
			else if(bmiKg <= 29.9)
			{
				System.out.println("You are overweight");
			}
			else if(bmiKg >= 30)
			{
				System.out.println("You are obese ):");
			}
		}
		else if(choice.equals("p"))
		{
			System.out.println("How much do you weigh?");
			lb = scnr.nextDouble();
			System.out.println("How tall are you in inches?");
			inches = scnr.nextDouble();
			bmiLb = (lb*703)/(inches*inches);
			System.out.println("Your BMI is: " + bmiLb);
			
			if(bmiLb <= 18.5)
			{
				System.out.println("You are underweight");
			}
			else if(bmiLb <=24.9)
			{
				System.out.println("You are Normal weight");
			}
			else if(bmiLb <= 29.9)
			{
				System.out.println("You are overweight");
			}
			else if(bmiLb >= 30)
			{
				System.out.println("You are obese ):");
			}
		}
		
		
		

	}

}
