import java.util.Scanner;
class InsertionSort
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of integer:");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+ n +" Number: ");
		for(int i=0; i<n ;i++)
		{
			arr[i] = scan.nextInt();
		}
		sort(arr);
		System.out.println("Array After Sorting: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}
	public static void sort(int arr[])
	{
		int s =arr.length;
		for(int i=1;i<s;i++)
		{
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
	}
}