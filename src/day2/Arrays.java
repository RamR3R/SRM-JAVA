package day2;

public class Arrays {
	public static void main(String[] args) {
		
//		int[] batch4 = {500,501,502,503}; // decre assing elemt in arr
//		
//		
//		batch4[1] = 600;  // assess and modify array elements 
//		
//		int[] arr = new int[5];
//		
//		arr[1] = 100;
//		arr[0] = 200;
//		System.out.println(arr.length);		
//		int[] arr = {100,200,300,400,500,600,700};
//		for(int i =  0 ; i < arr.length  ; i++)  //iterating in array
//		{
//			System.out.println(arr[i]);
//		}
		
		
		int[] arr = { 1, 0 , 22, 33 ,27 , 16, 17};
		int largebrain = 0;
		int secondLargeBrain = 0;
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] > largebrain)
			{
				if(largebrain > secondLargeBrain)
					secondLargeBrain = largebrain;
				largebrain = arr[i];	
			}
			else
			{
				if(arr[i] > secondLargeBrain)
					secondLargeBrain = arr[i];
			}
			
		}
		System.out.println(secondLargeBrain);		
	}

}
