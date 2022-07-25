package Day4;


public class Arrays {
	public static void passByValue(int x)
	{
		x+=1;
	}
	
	public static void passByReference(int[] x)
	{
		x[0]+=1;
	}
	
	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < 10; i++)
		{
			array[i] = i;
		}
		int sumOfArray = 0;
		for (int i = 0; i < 10; i++)
		{
			sumOfArray+=array[i];
		}
		System.out.println(sumOfArray);
		
		int oddSumOfArray = 0;
		for (int i = 0; i < 10; i++)
		{
			if(array[i]%2==1)
				{
					oddSumOfArray+=array[i];
				}
		}
		System.out.println(oddSumOfArray);
		
		String[] strings = {"This", "is", "a", "string", "array"};
		for (String str : strings)
		{
			System.out.println(str);
		}
		
		int[][] twoDArray = new int[3][3];
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				twoDArray[i][j] = (array[j+1]*(i+1));
			}
		}
		String bigArray = "\n";
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				bigArray += twoDArray[i][j];
				bigArray += " ";
			}
			bigArray += "\n";
		}
		System.out.println(bigArray);
		
		int[] passer = new int[1];
		passer[0] = 1;
		passByValue((passer[0]));
		System.out.println(passer[0]);
		passByReference(passer);
		System.out.println(passer[0]);

		
		
		
		
	}

}
