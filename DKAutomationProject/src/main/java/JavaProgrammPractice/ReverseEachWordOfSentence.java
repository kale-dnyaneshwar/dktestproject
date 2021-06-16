package JavaProgrammPractice;

public class ReverseEachWordOfSentence {

	public static void main(String[] args) 
	{
		String sentence="This is dnyanesh Kale from pune";
		System.out.println("Original Sentence: "+sentence);
		String[] words=sentence.split(" ");
		
		for (int i = 0; i < words.length; i++) 
		{
			String word=words[i];
			String reverseWord="";
			for (int j = word.length()-1; j>=0 ; j--) 
			{				
				reverseWord=reverseWord+word.charAt(j);
			}
			System.out.print(reverseWord+" ");	
		}

	}

}
