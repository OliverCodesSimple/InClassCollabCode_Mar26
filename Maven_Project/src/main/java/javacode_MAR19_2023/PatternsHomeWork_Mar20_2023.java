package javacode_MAR19_2023;

public class PatternsHomeWork_Mar20_2023 {

	public static void main(String[] args) {
		
		  int rows = 5;
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < rows - i; j++) {
	                System.out.print("  ");
	            }
	            for (int k = 0; k <= i; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        
	        System.out.println("------Pattern1-----");
	        
	        int rows1 = 5;
	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < i; j++) {
	                System.out.print("  ");
	            }
	            for (int k = i; k < rows1; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        } 
	        
	        System.out.println("-----pattern2-----");
	        
	        int row2 = 5;
	        for (int i = 0; i < row2; i++) {
	            for (int j = 0; j < row2 - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k <= i; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        
	        int rows3 = 5;
	        for (int i = 0; i < rows3; i++) {
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = i; k < rows3; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        } 
	        System.out.println("-----pattern3-----");   
	    }
	
	}

