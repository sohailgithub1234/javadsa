import java.util.Scanner;
class CountingSort 
{ 
   public static void sort (int a[], int n)
   {
	   int max = a[1];
	   for (int i = 2; i<=n; i++)
	   { if ( max < a[i])
			   max = a[i];
	   }
	   int c[] = new int[max+1];
	   for (int i = 0; i<=max; i++)
	   	   c[i]=0;
	   for (int i = 1; i<=n; i++)
	   	   c[a[i]]=c[a[i]]+1;
	   for (int i = 1; i<=max; i++)
	   	   c[i]=c[i]+c[i-1];
	   int b[] = new int[n+1];
	   for (int i = n; i>=1; i--)
	   {  b[c[a[i]]]=a[i];
		   c[a[i]]= c[a[i]]-1;
	   }
	   System.out.println("Elements after sorting "); 
        for (int i=1; i<=n; i++) 
            System.out.print(b[i]+" "); 
        System.out.println(); 
	   
   }
 

   
    public static void main(int args[]) 
    { 
        Scanner scan = new Scanner( System.in );        
        int n, i;
        System.out.println("Enter number of integer elements");
        n = scan.nextInt();
        int arr[] = new int[ n+1 ];        
        System.out.println("\nEnter "+ n +" integer elements");
        for (i = 1; i <=n; i++)
            arr[i] = scan.nextInt();
		System.out.println("\nElements before sorting ");        
        for (i = 1; i <=n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();            
        sort(arr, n); 
  
    } 
} 