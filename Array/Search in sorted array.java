import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;

        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        else
        return binarySearch(arr, low, (mid - 1), key);
    }

    public static void main(String[] args)
    {
        int arr[] = { 5, 6, 7, 8, 9, 10 };
        int n, key;
        n = arr.length - 1;
        key = 10;

        System.out.println("Index: " + binarySearch(arr, 0, n, key));
    }
}
