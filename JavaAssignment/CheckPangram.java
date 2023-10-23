import java.util.Scanner;

class CheckPangram 
{
	public static void main(String [] args){
	
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the sentence here:");
	  String input = sc.next();

	  boolean isPangram = checkIfPangram(input.toLowerCase());

	  if (isPangram)
	  {
		  System.out.println("The input is a pangram");
	  } else {
		System.out.println("The input is not a pangram");
	  }
	}

	public static boolean checkIfPangram(String sentence){
	  boolean []alphabetCheck = new boolean[26];

	  int totalChars = 0;

	  for (char c : sentence.toCharArray())
	  {
		  if (Character.isLetter(c))
		  {
			  int index = c-'a';
			  if (!alphabetCheck[index])
			  {
				  alphabetCheck[index]=true;
				  totalChars++;
			  }
		  }
	  }
	  return totalChars == 26;
	}	
}
