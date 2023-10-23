import java.util.Scanner;

class RomanToInteger 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roman number:");
		String romanNumber = sc.next().toUpperCase();

		int result = romanToInt(romanNumber);
		System.out.println("Integer represent:"+result);

		
	}

	public static int romanToInt(String roman){
		int result = 0;
		int prevValue = 0;

		for (int i=roman.length()-1;i>=0 ;i-- )
		{
			char currentChar = roman.charAt(i);
			int currentValue = getRomanValue(currentChar);

			if (currentValue < prevValue)
			{
				result -= currentValue;
			} else {
				result += currentValue;
			}
			prevValue = currentValue;

		}
		return result;
	}

		public static int getRomanValue(char romanChar){
			switch (romanChar)
			{
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
			default:
				return 0;
			
			}
		}
}
