import java.util.Scanner;
class insertion_sort {
	void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}
	public static void main(String args[])
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
		insertion_sort ob = new insertion_sort();
		ob.sort(a);
		printArray(a);
	}
}