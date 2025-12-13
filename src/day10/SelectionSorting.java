package day10;

public class SelectionSorting {

	public static void main(String[] args) {
		
		int[] arr = {3,4,2,1,0,5};
		
		for(int i = 0 ; i<arr.length ; i++)
		{
			int minIndex = i;
			for(int j = i ; j < arr.length ; j++)
			{
				if(arr[j] < arr[minIndex])
					minIndex = j;
			}
			//swapping
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		for(int i : arr)
			System.out.print(i + " ");

	}

}
