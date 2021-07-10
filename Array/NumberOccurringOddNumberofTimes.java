class OddOccurrence {

	static int getOddOccurrence(int arr[], int arr_size)
	{
		int i;
		for (i = 0; i < arr_size; i++) {
			int count = 0;
			for (int j = 0; j < arr_size; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count % 2 != 0)
				return arr[i];
		}
		return -1;
	}
	
	// driver code
	public static void main(String[] args)
	{
		int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
		int n = arr.length;
		System.out.println(getOddOccurrence(arr, n));
	}
}
