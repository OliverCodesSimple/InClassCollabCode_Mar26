package com.javacode_Mar26_2023;

public class MethodsInJava {

	//Methods are also known as functions
	//Methods are known as independent units of execution
	//Access modifier static/non-static returnType nameOfTheMethod() {
	
	public static void main(String[] args) {
		System.out.println("This is the main method");
		hello();
		sample(10,20,30);
	}

	
	public static int sample(int i, int j, int k) {
		i = 10;
		j = 20 ;
		k = 30;
		
		int sum = i + j + k;//60
		return sum; //what are we returning????
	}
	public static String test(String S1, String S2) {
		String S3 = S1 +S2;
		return S3;
	}
	public static void hello() {
		System.out.println("this is the hello method");
	}
}
