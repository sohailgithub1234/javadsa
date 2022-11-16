import java.util.Scanner;
class SelectionSort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,n,arr[];
		System.out.print("Enter the Size of Array: ");
		n=sc.nextInt();
		arr = new int[n];
		System.out.println("Enter the " + n + " element in Array :");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Selection_Sort(arr, n);
		System.out.println("Array After Sort: ");
		for (i=0;i<n ;i++ ) 
		{
			System.out.println(arr[i]);	
		}
	}
	public static void Selection_Sort(int arr1[],int n)
	{
		int min_ind,i,j,temp=0;
		for(i=0;i<n-1;i++)
		{
			min_ind=i;
			for(j=i+1;j<n;j++)
			{
				if(arr1[j]<arr1[min_ind])
					min_ind=j;
			}
			if(min_ind!=i)
				{
				temp = arr1[min_ind];
                arr1[min_ind] = arr1[i];
                arr1[i] = temp;
            }
		}
	}
}