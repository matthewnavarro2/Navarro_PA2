package Navarro_p1;

import java.util.Scanner;

public class Encrypter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int passCode;
		int num;
		String choice;
		int passCode1;		
		int passCode2;
		int passCode3;
		int passCode4;
		
		
		System.out.println("Please enter a 4 digit passcode.");
		passCode = scnr.nextInt();
		
		System.out.println("Would you like to Encrypt or Decrypt? Enter: e or d.");
		choice = scnr.next();
		if(choice.equals("e"))
		{
			System.out.println("Encrypting....");
			
			passCode1 = passCode / 1000;
			passCode2 = passCode / 100 % 10;
			passCode3 = passCode / 10 % 10;
			passCode4 = passCode % 10;
			
			passCode1 = (passCode1+7)%10;
			passCode2 = (passCode2+7)%10;
			passCode3 = (passCode3+7)%10;
			passCode4 = (passCode4+7)%10;
			
			
			
			System.out.println(passCode3 + "" + passCode4 + "" + passCode1 + "" + passCode2);
		}
		else if(choice.equals("d"))
		{
			System.out.println("Decrypting....");
			
			passCode1 = passCode / 1000;
			passCode2 = passCode / 100 % 10;
			passCode3 = passCode / 10 % 10;
			passCode4 = passCode % 10;
			
			passCode1 = ((passCode1 + 3) % 10);
			passCode2 = ((passCode2 + 3) % 10);
			passCode3 = ((passCode3 + 3) % 10);
			passCode4 = ((passCode4 + 3) % 10);
			
			System.out.println(passCode3 + "" + passCode4 + "" + passCode1 + "" + passCode2);
		}
		
		
	}

}
