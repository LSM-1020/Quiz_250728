package com.LSM_ch10;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	     System.out.println("문자입력");
	     String word = scanner.next(); 
	     
	     
	     try {
			System.out.println(word.length());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     
	}
}
