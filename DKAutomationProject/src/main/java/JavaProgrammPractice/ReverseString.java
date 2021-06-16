package JavaProgrammPractice;

public class ReverseString {

	public static void main(String[] args) 
	{
		String name = "Dnyaneshwar";
		String reverseString = "";
		for (int i = name.length() - 1; i >= 0; i--) 
		{
			reverseString = reverseString + name.charAt(i);
		}
		System.out.println("Reverese String: " + reverseString);

	}

}
