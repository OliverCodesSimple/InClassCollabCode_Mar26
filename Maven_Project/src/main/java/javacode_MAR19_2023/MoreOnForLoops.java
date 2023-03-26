package javacode_MAR19_2023;

public class MoreOnForLoops {

	public static void main(String[] args) {
		// nested for loop. for loop inside for loop
			
		
		for(int i=1 ; i<=5 ; i++) {//outer for loop represents row
		
			//correct condition 
			
			for(int j=1 ; j<=i ; j++) { //inner for loop represents columns
				System.out.print("* ");	//body of the inner loop
				}
				System.out.println();
				//this is the body of the outer for loop
			}
		System.out.println("----------pattern1----------");
		
		for(int i=1 ; i<=5 ; i++) {//outer for loop represents row
			
			//correct condition 
			
			for(int j=1 ; j<=5 ; j++) { //inner for loop represents columns
				System.out.print("* ");	//body of the inner loop
				}
				System.out.println();
				//this is the body of the outer for loop
			}
		
		System.out.println("----------pattern2----------");
		
		for(int i=1 ; i<=5 ; i++) {//outer for loop represents row
			
			//correct condition 
			
			for(int j=5 ; j>=i ; j--) { //inner for loop represents columns
				System.out.print("* ");	//body of the inner loop
				}
				System.out.println();
				//this is the body of the outer for loop
			}
		System.out.println("----------pattern3----------");
		for(int i=1 ; i<=5 ; i++) {
			
			for(int j=1 ; j<=i ; j++) { 
				System.out.print("* ");	
				System.out.println();
			}
			for(int i1=1 ; i1<=5 ; i1++) {
				
				for(int j=5 ; j>=i1 ; j--) {
					System.out.print("* ");
					}
					System.out.println();
			}System.out.println("----------pattern4----------");
	}}}


