package GameOfDead;

public class Aleatorio {
	
	public int[][] board = new int [100][100];
	
	public int [][] Aleatorio (int [][] board,int height,int width)
	{
		board = new int [height][width]; 
		for (int i = 0 ; i <height ; i++)
		{
			for (int j = 0 ; j <width ; j++)
			{
				board [i][j] = Math.random()<0.05 ? 0:1;
			}
		}
		return board;
	}
}
