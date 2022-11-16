import java.util.Scanner;
class QuickSort 
{ 
    int partition(int A[], int start, int end) 
    { 
        int pivot = A[end];  
        int i = (start-1);  
        for (int j=start; j<=end-1; j++) 
        { 
            if (A[j] <= pivot) 
            { 
                i++; 
                int temp = A[i]; 
                A[i] = A[j]; 
                A[j] = temp; 
            } 
        } 
        int temp = A[i+1]; 
        A[i+1] = A[end]; 
        A[end] = temp; 
		
        return i+1; 
    } 
 
    void sort(int A[], int start, int end) 
    { 
        if (start < end) 
        {             
            int pIndex = partition(A, start, end); 
            sort(A, start, pIndex-1); 
            sort(A, pIndex+1, end); 
        } 
    } 
   
    public static void main(String args[]) 
    { 
        Scanner scan = new Scanner( System.in );        
        int n, i;
        System.out.println("Enter number of integer elements");
        n = scan.nextInt();
        int arr[] = new int[ n ];        
        System.out.println("\nEnter "+ n +" integer elements");
        for (i = 0; i <n; i++)
            arr[i] = scan.nextInt();
		System.out.println("\nElements before sorting ");        
        for (i = 0; i <n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();            
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("Elements after sorting "); 
        for (i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
} 