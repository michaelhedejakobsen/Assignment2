
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
 *5. WHILE count<5
 *6. 	READ next int from keyboard into num[count]
 *7.	INCREMENT count
 *8. WHILE i<5
 *9. 	PRINT num[i]
 *10.	INCREMENT i
 *11.SET count=0
 *12.WHILE count<5
 *13.	ADD num[count] to sum
 *14.	INCREMENT count
 *15. DISPLAY the sum
 *16. CALCULATE and DISPLAY the average of the numbers: sum / 5
 *17.END
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


