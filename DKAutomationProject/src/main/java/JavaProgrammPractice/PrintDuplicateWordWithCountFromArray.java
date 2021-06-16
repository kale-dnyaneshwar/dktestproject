package JavaProgrammPractice;

public class PrintDuplicateWordWithCountFromArray {

	public static void main(String[] args) 
	{
		String[] duplicateWords={"Ram","Shyam","Om","Prem","Ram","Shyam"};
		int counter=1;
		for (int i = 0; i < duplicateWords.length; i++) 
		{
			for (int j = i+1; j < duplicateWords.length; j++) 
			{
				if (duplicateWords[i]==duplicateWords[j]) 
				{
					counter++;
					System.out.println("Duplicate word is: "+duplicateWords[i]+" count is: "+counter);
				}
				
			}
			counter=1;		
			
		}

	}

}
