package java.learning.march_11_2023;

public class GreatestBetweenNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		if (a > b && a > c) {
			System.out.println("a is the greatest :" + a);
		} else if (b > a && b > c) {
			System.out.println("b is the greatest :" + b);
		} else if (c > a && c > b) {
			System.out.println("b is the greatest :" + c);
		}

	}
}
