import java.util.Scanner;

public class LargerNumber {

	public static void main(String[] args) {
		
		int numberX = 0, numberY = 0;

		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("This program will compare 2 numbers and return the smaller of the 2.");
		
		System.out.println("Type in a number for x.");
		
		numberX = scan1.nextInt();
		
		System.out.println("Type in a number for y.");
		
		numberY = scan1.nextInt();
		
		System.out.print("The smaller number is ");
		
		System.out.println(compareNumbers(numberX, numberY)); //numberX & numberY are what's feeding the method
	}

	public static int compareNumbers (int x, int y) {
		
		if (x < y) {
			
			return x; //return is what feeds back to the code that called the method
		}
		
		return y;
	}
}
