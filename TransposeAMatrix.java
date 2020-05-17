import java.util.Scanner; 

public class TransposeAMatrix
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); 
		int  rowN, colN,  i , j; 
		
		System.out.println("Enter the number of rows and columns of matrix");
		rowN = in.nextInt();
		colN = in.nextInt(); 

		int matrix[][] = new  int[colN][rowN]; 
		System.out.println("Enter the elements of matrix"); 
		for( i  = 0; i < rowN; i++)
		{	
			for( j = 0; j < colN; j++)
			{
				matrix[i][j] = in.nextInt();
			} 
		}

		int transpose[][] = new int[rowN][colN];
		for( i  = 0; i < rowN; i++)
		{	
			for( j = 0; j < colN; j++)
			{
				transpose[j][i] = matrix[i][j];
			} 
		}

		System.out.println("Transpose of the matrix: "); 
		for( i  = 0; i < rowN; i++)
		{	
			for( j = 0; j < colN; j++)
			{
				System.out.println(transpose[i][j] + "\t");
			} 
 
		}		

	}
}