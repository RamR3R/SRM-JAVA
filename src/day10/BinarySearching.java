package day10;

public class BinarySearching {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int target = 3;
		
		int low = 0;
		int high = arr.length - 1;
		int index = -1;
		while(low <= high)
		{
			int mid = (low + high)/2;
			if(arr[mid] == target)
			{
				index = mid;
				break;
			}
			else if(target < arr[mid])
				high = mid - 1;
			else
				low = mid + 1;
			System.out.println("hii");
		}
		System.out.println(index == -1 ?"No" : "Yes");
	}

}
