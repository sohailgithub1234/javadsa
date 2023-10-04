import java.util.Scanner;
class BinarySrch
{
	public static void main(String args[])
	{
		int i,n,first,middle,last,srch,array[],temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		n = in.nextInt();
		array = new int[n];
		System.out.println("Enter " + n + " Number :");
		for(i=0;i<n;i++)
			array[i] = in.nextInt();
		//sorting of array
		for (i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (array[i] > array[j]) 
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
		System.out.println("Enter the value to find:");
		srch = in.nextInt();
		//BinarySrch
		first = 0;
		last = n-1;
		middle = (first+last)/2;

		 while( first <= last )
		{
			if ( array[middle] < srch )
			first = middle + 1;    
			else if ( array[middle] == srch ) 
			{
				System.out.println(srch + " found at location " + (middle + 1) + ".");
				break;
		}
		else
         last = middle - 1;
		middle = (first + last)/2;
   }
   if ( first > last )
      System.out.println(srch + " isn't present in the list.\n"); 
	}
}

