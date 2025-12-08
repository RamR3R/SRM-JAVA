package day3;

public class Twodimensional {

	public static void main(String[] args) {
		int[][] A = {
						{10,20},
						{5,7}
						};
		int[][] B = {
						{2},
						{3}
						};
		
		
		int[][] answer = new int[A.length][B[0].length];
		
		for(int i = 0 ; i<A.length ; i++)
		{
			for(int j = 0 ; j < B[0].length ; j++)
			{
				// in this place answer[i][j]
				for(int x = 0 ; x < B.length ; x++)
				{
					answer[i][j] += A[i][x] * B[x][j];
				}
			}
		}
		
		for(int i = 0 ; i<answer.length ; i++)
		{
			for(int j = 0 ; j< answer[0].length ; j++)
				System.out.print(answer[i][j] + " ");
			
			System.out.println();
		}
		
		System.out.println();
		
		
		
		
		
	}

}
