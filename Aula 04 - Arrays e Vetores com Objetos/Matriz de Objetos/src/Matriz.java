import java.util.Random;

public class Matriz 
{
	public static void main(String[] args) 
	{
		int[][] matriz = new int [2][2];
		matriz[0] = new int [2];
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[1] = new int[2];
		matriz[0][0] = 3;
		matriz[0][1] = 4;
		
		
		Random random = new Random();
		
		int[][] matrix = new int[2][2];
		for(int linha = 0; linha < matrix.length; linha++)
		{
			for(int coluna = 0; coluna < matrix.length; coluna++)
			{
				matrix[linha][coluna] = random.nextInt(101);
				System.out.println(matrix[linha][coluna]);
			}
		}
		
	}
}
