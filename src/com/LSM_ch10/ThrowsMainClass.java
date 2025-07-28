package com.LSM_ch10;

public class ThrowsMainClass {

	public static void main(String[] args) {
	     
        try {
			ThrowsExample.readFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       
 
}

}
