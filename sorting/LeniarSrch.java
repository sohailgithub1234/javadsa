import java.util.Scanner;
class LeniarSrch
{
	public static void main(String args[])
	{
		int i,n,srch,array[];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		n = in.nextInt();
		array = new int[n];
		
		System.out.println("Enter " + n + " integers:");
		
		for (i=0; i<n;i++)
			array[i] = in.nextInt();
		System.out.println("Enter value to find:");
		srch = in.nextInt();	
		for(i=0;i<n;i++)
		{
			if(array[i] == srch)
			{
				System.out.println(srch + " is present at location " + (i+1) + ".");
				break;
			}
		}
		if(i == n) 
			System.out.println(srch + " isn't present in array.");
	}
}
