package assignment13;

public class PrintArray {
	
	public static <E> void toprint(E[] intarr)
	{
		for(E element : intarr)
		{
			System.out.println(element);
		}System.out.println(".....");
	}
	
	
	public static void main(String[] args)
{
		Integer[] intarray= {1,2,3,4,5,6};
		String[] stringarray= {"hima","aayu"};
		Double[] doublearray= {1.1,1.2,1.3,1.4};
		PrintArray.toprint(intarray);
		PrintArray.toprint(stringarray);
		PrintArray.toprint(doublearray);
		
		

	}

}
