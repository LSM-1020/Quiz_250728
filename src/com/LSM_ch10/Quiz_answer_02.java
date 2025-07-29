package com.LSM_ch10;

import java.util.Scanner;

import com.sun.jdi.connect.IllegalConnectorArgumentsException;

public class Quiz_answer_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요");
		
		String str = scanner.nextLine(); //문자열을 키보드로입력
		
		if(str.length() == 0) {
			throw new IllegalArgumentException("문자열은 공락입력 불가");
		}else {
			System.out.println(str.length()); //문자열 길이 출력 
		}
		scanner.close();
		
		
	}
}
