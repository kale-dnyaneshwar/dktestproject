package JavaProgrammPractice;

public class FindDuplicateElementFromAnArray {

	public static void main(String[] args) 
	{

		int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i + 1; j < arr.length; j++) 
			{
				if (arr[i] == arr[j])
					System.out.print(arr[i] + " ");
			}
		}

	}
}
