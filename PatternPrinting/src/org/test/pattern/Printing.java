package org.test.pattern;

import java.util.Scanner;

public class Printing {

	public void Logic(){
		int number=1;
		Scanner num = new Scanner(System.in);
		System.out.println("Please enter the row number");
		int rowNumber = num.nextInt();
		for (int i=1; i<=rowNumber;i++){
			System.out.print("\n");
			for (int j=1;j<=i;j++){
				System.out.format("%-4d", number++);
			}
			num.close();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printing print = new Printing();
		print.Logic();

	}

}
