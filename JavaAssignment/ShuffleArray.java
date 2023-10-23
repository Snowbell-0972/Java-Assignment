import java.util.Scanner;
class ShuffleArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int a1[]=new int[sc.nextInt()];

		System.out.println("Enter the values in array");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}

		System.out.println("Here are the Suffle array");
		
		shuffleArray(a1);
	
		for(int i=0;i<a1.length;i++){
		        System.out.print(a1[i]+" ");
			}
	}

	public static void shuffleArray(int array[]){
		int n = array.length;
		for (int i=n-1;i>0 ;i--)
		{
			int index = getRandomIndex(i);

			int temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
	}

	public static int getRandomIndex(int range){
	  return (int) (Math.random() * (range + 1));
	}
}
