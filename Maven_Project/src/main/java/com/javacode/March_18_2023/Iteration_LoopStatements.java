package com.javacode.March_18_2023;

public class Iteration_LoopStatements {
	// while
	// for loop
	// nested for loop
	// advanced for loop

	public static void main(String[] args) {
		// while loop syntax

		// step1 : you have to initialize a value of a variable
		// step 2 : you have to pass the condition in the while
		// step 3 : if your condition is true, the control will go inside the body of
		// the while loop
		// step 4 : if your condition is false, the control will not go inside the body
		// of the while loop
		// step 5 : t control your logic you may chose to increment or decrement a
		// certain value

		boolean b1 = true;

		while (b1 != false) {
			System.out.println("the grass is green");
			break;
		}

		int i = 1;
		while (i <= 10) {
			System.out.println(i + " ");
			i++;
			break;
		}

		int j = 20;
		while (i > 0) {
			System.out.println(j + "");
			j--;
			break;
		}

		int k = 1;
		while (k <= 20) {
			System.out.println(k * 2 + "");
			k++;
		}
		  int l = 100;
	      while (l >= 5) {
	         System.out.println(l + "");
	         l -= 5;
	      }
	}}

