import java.io.*;
import java.util.Scanner;

class quick_sort
{
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static int partition(int[] arr, int low, int high)
	{
		int pivot = arr[high];
		int i = (low - 1);
		for(int j = low; j <= high - 1; j++)
		{
			if (arr[j] < pivot)
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}
	static void quickSort(int[] arr, int low, int high)
	{
		if (low < high)
		{
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}
	
	static void printArray(int[] arr, int size)
	{
		for(int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
			
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		int n;
		System.out.println("Enter number of elements in array");
		n=S.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
		{
			a[i]=S.nextInt();
		}
		quickSort(a, 0, n - 1);
		System.out.println("Sorted array: ");
		printArray(a, n);
	}
}
