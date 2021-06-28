import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{

    static int findElement(int arr[], int n, 
                           int key)
    {
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
     
        return -1;
    }
     

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Enter number of elements:");
        int n= sc.nextInt();

        System.out.print("Enter elements:");
        for(int i=0; i<n; i++)  
        {  
        arr[i]=sc.nextInt();  
        }  
        
        System.out.print("Enter element to search for:");
        int key= sc.nextInt();
        
        int position = findElement(arr, n, key);
     
        if (position == - 1)
            System.out.println("Element not found");
        else
            System.out.println("Element Found at Position: " 
                                + (position + 1));
    }
}
