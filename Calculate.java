
import java.util.Scanner;

/**
 * Purpose: Input 5 numbers and calculate these.
 *@author Michael Hede Jakobsen
 * Date: 24 September 2014
 *
 * Pseudo code / Algorithm:
 *1. START
 *2. INITIALIZE int count, int n0-4, int i,double sum
 *3. PROMPT user to input 5 numbers
 *4. Create a new scanner, to scan for user input.
 *5. Create LOOP to scan the numbers and READ into variables n0 - n4.
 *6. Create LOOP to DISPLAY the same numbers.
 *7. Create LOOP to READ the value of the variables and READ into a new variable: sum
 *8. DISPLAY the sum
 *9. CALCULATE and DISPLAY the average of the numbers: sum / 5
 *10.END
 */

public class Calculate {

	public static void main(String[] args) {
		int count = 0;
		int num[] = new int[5];
		int i = 0;
		double sum = 0;
		
		//Prompt user to input 5 numbers
		System.out.println("Input 5 real numbers separated with spaces, then hit enter");
		//Create a new scanner, to scan for user input.
		Scanner keyboard = new Scanner(System.in);
		
		//Create loop to scan the numbers and input into variables.
		while(count<5)
		{
			num[count] = keyboard.nextInt();
			count++;
		}
		
		//Close scanner
		keyboard.close();
		
		//Create loop to output the same numbers.
		System.out.print("The numbers you input were: ");
		while(i<5)
		{
			System.out.print(num[i] + " ");
			i++;
		}
		
		//Create loop to read the value of the variables and input into a new variable sum
		count = 0;
		while(count<5)
		{
			sum = num[count] + sum;
			count++;
		}
		
		//Output the sum
		System.out.println();
		System.out.println("Sum: " + sum);
		
		//Calculate and output the average of the numbers
		double average = (sum / 5); 
		System.out.println("Average: " + average);
		
		}

	}


