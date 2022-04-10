package assignment13;

import java.util.Scanner;

public class PrintArray {
	
	
	    
		public static <T extends Comparable<T>> void max(T... elements) {
		    T max = elements[0];
		    for (T element : elements)
		    {
		        if (element.compareTo(max) > 0) 
		        {
		            max = element;
		        }
		        
		    }System.out.println("the maximum is "+max);
		   
		}
		
	
	
	
	
	
	public static void main(String[] args)
{
		Integer[] intarray= {5,8,4};
		Float[] floatarray= {1.3f,1.6f,1.62f};
		String[] stringarray= {"hima","aayushi","himanshu"};
		
		
		PrintArray.max(intarray);
		
		PrintArray.max(stringarray);
		PrintArray.max(floatarray);
		
		

	}

}
