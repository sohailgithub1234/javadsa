import java.util.Scanner;
class MergeSort 
{
  public static void merge(int[] a, int low, int mid,int high) 
	{
		int p=low, q=mid+1, r=0;
		int N = high - low+1;   
	 	int b[] = new int[N];
	 while (p<=mid && q <= high)
	 {
	  if (a[p]<a[q])
	   {
	    b[r]=a[p];
	     p=p+1;
	     r=r+1;
	   }
	   else
	   {
	    b[r]=a[q];
	     q=q+1;
	     r=r+1;
	   }
	 }
	while (p<=mid)
	{
	    b[r]=a[p];
	     p=p+1;
	     r=r+1;
	 }
	while (q <= high)
	   {
	    b[r]=a[q];
	     q=q+1;
	     r=r+1;
	   }		
        for (int k = 0; k < N; k++) 
            a[low + k] = b[k];         
    }
    public static void sort(int[] a, int low, int high) 
    {   int N = high - low+1; 
		if (N<=1) 
            return; 
		else
		{
        int mid = (low + high)/2;  
        sort(a, low, mid); 
        sort(a, mid+1, high);     
        merge(a,low,mid,high); 
		}
	}
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );        
        int n, i;
        System.out.println("Enter number of integer elements");
        n = scan.nextInt();
        int arr[] = new int[ n ];        
        System.out.println("\nEnter "+ n +" integer elements");
        for (i = 0; i <n; i++)
        	arr[i] = scan.nextInt();
		System.out.println("\n Elements before sorting ");        
        for (i = 0; i <n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();            
        sort(arr, 0, n-1);
        System.out.println("\n Elements after sorting ");        
        for (i = 0; i <n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();            
    }    
}