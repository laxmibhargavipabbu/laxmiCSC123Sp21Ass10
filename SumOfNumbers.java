package Assignment10;

import java.util.Scanner;

public class SumOfNumbers 
{
	public static int sumOfNumbers(int num)
	{
		if (num != 0)
            return num + sumOfNumbers(num - 1);
        else
            return num;
	}
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int sum, input;
				
		try
		{
			System.out.printf("Please enter an integer greater than or equal to 0: \n");
			input = keyboard.nextInt();
			while(input<0)
			{
				System.out.printf("Invalid input! Please re-enter an integer greater than or equal to 0: \n");
				input = keyboard.nextInt();
			}
			sum = sumOfNumbers(input);
			System.out.printf("The sum of the integers 1 through %d is %d",input,sum);	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		keyboard.close();
	}
}
