import java.util.*;


class Main
{
	void printLeaders(int arr[], int size)
	{
		int max_from_right = arr[size-1];

		System.out.print(max_from_right + " ");
	
		for (int i = size-2; i >= 0; i--)
		{
			if (max_from_right < arr[i])
			{		
			max_from_right = arr[i];
			System.out.print(max_from_right + " ");
			}
		}
	}


	public static void main(String[] args)
	{
		Main lead = new Main();
		int arr[] = new int[10];
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter number of elements:");
     int n= sc.nextInt();
     System.out.print("Enter elements:");
     for(int i=0; i<n; i++)  
        {  
        arr[i]=sc.nextInt();  
        }  
	   lead.printLeaders(arr, n);
	}
}
