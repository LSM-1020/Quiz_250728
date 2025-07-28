package com.LSM_ch10;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	
		 Scanner scanner = new Scanner(System.in);

	     try {
			System.out.println("정수1");
			 int number1 = scanner.nextInt(); 
			 
			 System.out.println("정수2");
			 int number2 = scanner.nextInt();
			 
			 int result = number1 / number2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			  
	     
	     
	}

}