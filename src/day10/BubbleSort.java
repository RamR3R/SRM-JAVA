package day10;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {1,3,2,0,5,4};
		
		for(int i = 0 ; i <arr.length ; i++)
		{
			for(int j = 0; j < arr.length - 1 ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i : arr)
		{
			System.out.print(i + " , ");
		}

	}

}
