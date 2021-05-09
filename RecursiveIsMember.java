package Assignment10;

import java.util.ArrayList;
import java.util.Random;

public class RecursiveIsMember 
{
	public static boolean isMember(int index, ArrayList<Integer> myList, int value )
	{
		if(index==0)
		{
			return false;
		}
		else if(myList.get(index-1) == value)
		{
			return true;
		}
		else
		{
			return isMember(index-1, myList, value);
		}


	}
	public static void main(String[] args)
	{
		Random randy = new Random(5);
		int num;
		int index;
		boolean found = false;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i=1; i <=15 ;i++)
		{
			num = randy.nextInt(16)*2;
			if(num%2==0)
			{
				arrayList.add(num);
			}
			else
			{
				i--;
			}
		}
		System.out.printf("The ArrayList numbers are: [");
		for(int i=0; i< arrayList.size();i++)
		{
			if(i< arrayList.size() - 1)
			{
				System.out.printf("%d, ", arrayList.get(i));
			}
			else
			{
				System.out.printf("%d]\n",arrayList.get(i));
			}
		}
		
		for(int i=0; i<=30;i++)
		{
			index =15;
			found = isMember(index, arrayList, i);
			if(found)
			{
				System.out.printf("%d is found in the array\n",i);
			}
			else
			{
				System.out.printf("%d is not found in the array\n",i);
			}	
		}
	}
}
