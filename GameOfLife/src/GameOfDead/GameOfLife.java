package GameOfDead;

import processing.core.PApplet;

public class GameOfLife extends PApplet
{
	public static int square_size=8,width =100,height = 100;
	public static int [][] board;
	
	public static void main(String []args) 
	{
		PApplet.main("GameOfDead.GameOfLife");
	}
	
	public void settings ()
	{
		size(width * square_size,height * square_size);	
	}
	
	public void draw()
	{
		background(50);
		
		Aleatorio Al = new Aleatorio();
		
		int counter = 0;
		for ( int i =0 ; i<height;i++)                                                                                                                                                                                                                                                                                                            
		{
			for ( int j = 0; j<width;j++)
			{
				if (Al.Aleatorio(Al.board, i, j)[i][j] == 1)
				{ 
					fill(250,0,250); 
				}
				else
				{
					fill(0);
					rect(j * square_size,i * square_size,
							square_size,square_size);
				}
				
				/**
				 * Esto es para la matriz tomandola como si fuera una esfera donde todos tienen vecinos
				 */
				counter = Al.board[(i-1+height)%height][(j-1+width)%width]+Al.board[(i-1+height)%height][j]+
						Al.board[(i-1+height)%height][(j+1+width)%width]+Al.board [i][(j-1+width)%width]+
						Al.board[i][(j+1+width)%width]+Al.board[(i+1+height)%height][(j-1+width)%width]+
						Al.board[(i+1+height)%height][j]+Al.board[(i+1+height)%height][(j+1+width)%width];
				if (Al.board[i][j] == 1 & counter < 2 || counter >3) 
				{
					Al.board [i][j] = 0;
				}
				if (Al.board[i][j] == 0 & counter ==3 || counter == 2) 
				{
					Al.board[i][j] = 1;
				}
				
			}
		}
	}
}
