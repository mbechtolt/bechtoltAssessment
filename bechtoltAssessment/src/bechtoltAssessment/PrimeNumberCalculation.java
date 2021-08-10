package bechtoltAssessment;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberCalculation 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		//variable to store maxValue user input
		int userInt = 0;
		
		//add input validation for user input
		do
		{
			System.out.println("Please enter a positive integer greater than 1 to display all prime numbers from 0 to your entered value: ");
			while (!scanner.hasNextInt())
			{
				System.out.println("Please enter a valid integer.");
				scanner.next();
			}

			userInt = Integer.parseInt(scanner.next());

		} while (userInt <= 1);
		
		System.out.printf("The prime numbers between 0 and %d are: \n", userInt);
		
		//create array of boolean values
		Boolean[] isPrime = new Boolean[userInt + 1];
		//set boolean values to true
		Arrays.fill(isPrime, true);
		
		//set boolean values to false if index is not a prime
		for (int i=2; i <= Math.sqrt(userInt); i++)
		{
			if (isPrime[i])
			{
				for (int j = (int) Math.pow(i, 2); j <= userInt; j += i)
				{
					isPrime[j] = false;
				}
			}
		}
		
		//output prime values in console
		for (int i = 2; i <= userInt; i++)
		{
			if (isPrime[i])
				System.out.printf(i + " ");
		}
		
		scanner.close();  
	}
}
