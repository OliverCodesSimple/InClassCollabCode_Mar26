package com.javacode.March_18_2023;

public class Understanding_ForLoops {

	public static void main(String[] args) {
	
		
		//step1 : initialized  value is taken into consideration
		//step 2 : check for condition
		//step 3 : if the condition is true,  the control flow will go inside the body of the for loop
		//step 4 : if the condition is false, then it will exit
		//step 5 : then the control goes into iteration and it is compared within the condition
		//step 6 : then the logic again goes back in the same flow till the condition is false
		
		for(int i=1; 1<5 ; i++) {
			System.out.println("the value of i is : " + i + "");
		}
		
		
		for(int j=1 ; j<=20 ; j++) {
			System.out.println(j+ "");
			
		}
		
		
		
		
		for(int i=5 ;i; i++) {
			System.out.println(i+5);
			
		}
	}
	


}
