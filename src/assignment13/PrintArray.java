package assignment13;

import java.util.Scanner;

public class PrintArray {
	
	public static void toprint(Integer[] arr)
	{
		
		
			if(arr[0] >arr[1] && arr[0] >arr[2])
			{
				System.out.println("biggest of three number is "+arr[0]);
				}
			else if(arr[1] >arr[0] && arr[1] >arr[2])
			{
				System.out.println("biggest of three number is "+arr[1]);	
			}
			else
			{
				System.out.println("biggest of three number is "+arr[2]);	
			}
				
			
		}
	
	
	
	public static void main(String[] args)
{
		Integer[] intarray= {5,8,4};
		Float[] floatarray= {1.3f,1.6f,1.62f};
		
		//String[] stringarray= {"hima","aayu"};
		//Double[] doublearray= {1.1,1.2,1.3,1.4};
		PrintArray.toprint(intarray);
		
		//PrintArray.toprint(stringarray);
		//PrintArray.toprint(doublearray);
		
		

	}

}
