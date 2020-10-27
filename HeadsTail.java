/* Title: HeadsTail 
 * Date: 10/22/2020
 * Author: Luis Flores Cardoza
 */
package lab12;
import java.util.Scanner;

public class HeadsTail {

	public static int[] decimalToBinary(int decimal) {
		int[] number2 = new int[9];
		for(int i = number2.length - 1; i >= 0; i--) {
			if(decimal % 2 == 0)
				number2[i] = 0;
			else 
				number2[i] = 1;
			decimal /= 2;
			
		}
		return number2;
	}
	public static void printHeadsAndTails(int[] number) {
		for(int i = 0; i < 9; i++) {
			if(number[i] ==0)
				System.out.print("H" + " ");
			else
				System.out.print("T" + " ");
			if((i + 1) % 3 == 0)
				System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Ask the user to enter a number between 0 and 511
		System.out.println("Enter a number between 0 and 511: ");
		int number = input.nextInt();
		int[] number2 = decimalToBinary(number);
		printHeadsAndTails(number2);
		
		

	}
}


