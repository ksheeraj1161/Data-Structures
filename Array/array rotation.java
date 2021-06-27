/** rotate(ar[], d, n) - rotates arr[] of size n by d elements 

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    void Rotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            RotatebyOne(arr, n);
    }
 
    void RotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }
	public static void main (String[] args) {
		
		Scanner sc= new Scanner(System.in); 
        int T = sc.nextInt();
        for(int j=0;j<T;j++)
        {
            int N = sc.nextInt();
            int arr[]=new int[N];
            int D = sc.nextInt();
            Rotate(arr, D, N);
        }
	}
} */

import java.util.*;
import java.lang.*;
import java.io.*;

class rotate {
    public static void main (String[] args) {
 Scanner sc= new Scanner(System.in);
 int t= sc.nextInt();
 while(t-->0){
     int s= sc.nextInt();
     int arr[]= new int[s];
     for(int i=0;i<s;i++){
         arr[i]=sc.nextInt();
     }
     int k= sc.nextInt();
     while(k-->0){
     int temp=arr[0];
     for(int j=1; j<s;j++){
        arr[j-1]=arr[j]; 
 }
 arr[s-1]=temp;
     }
 for(int j=0; j<s;j++){
        System.out.print(arr[j]+" ");
 }
 System.out.println();

    }
}}
