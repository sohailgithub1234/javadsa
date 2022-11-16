import java.util.Scanner;
class BubbleSort
	{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			int i,j,arr[],n;
			System.out.print("Enter the number of element: ");
			n=sc.nextInt();
			arr = new int[n];
			System.out.println("Enter "+ n +" element:");
			for(i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			Bubble_Sort(arr,n);
			System.out.println("Array after Sorting!");
			for(i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
		}
		public static void Bubble_Sort(int arr1[], int n)
		{
			int temp=0;
			for(int i=0;i<(n-1);i++)
			{
				for(int j=0;j<(n-i-1);j++)
				{
					if(arr1[j]>arr1[j+1])
					{
						temp = arr1[j];
                		arr1[j] = arr1[j+1];
                		arr1[j+1] = temp;
					}
				}
			}
		}
	}
