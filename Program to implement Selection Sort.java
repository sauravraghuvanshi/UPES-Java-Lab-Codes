public class Selection_sort
{
	void sort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min_index=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min_index])
				min_index=j;
			}

			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
	}

	void printArray(int arr[])
	{
	 	int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"");
			System.out.println();
		}
	}

	public static void main(String args[])
	{
		Selection_sort ob = new Selection_sort();
		int arr[]={5,1,12,7,3};
		ob.sort(arr);
		System.out.println("Sorted Array");
		ob.printArray(arr);
	}
}
