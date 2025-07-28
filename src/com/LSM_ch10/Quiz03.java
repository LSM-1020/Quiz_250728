package com.LSM_ch10;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

	     System.out.println("정수입력");
	     
	     try {
			int number = scanner.nextInt(); 
			 
			 if(number % 2 == 0) {
				 System.out.println("짝수");
			 }else {
				 System.out.println("홀수");
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 System.out.println("정수가 아닙니다");
		}
	     	
			}
}