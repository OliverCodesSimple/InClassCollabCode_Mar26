package java.learning.march_11_2023;

public class SmallestBetween4DecimanlNumbers {

	public static void main(String[] args) {
		double d1 = 1.1;
		double d2 = 1.3;
		double d3 = 1.5;
		double d4 = 2.0;
		
		if(d1<d2 && d1<d3 && d1<d4) {
			System.out.println("d1 is the smallest :" + d1);
		}else if (d2<d1 && d2<d3 && d2<d4) {
			System.out.println("d2 is the smallest :" + d2);
		}
				
		else if (d3<d1 && d3<d2 && d3<d4) {
			System.out.println("d2 is the smallest :" + d3);
		}
		else {
			System.out.println("d4 is the smallest :" + d4);
		}
				

	}

}
