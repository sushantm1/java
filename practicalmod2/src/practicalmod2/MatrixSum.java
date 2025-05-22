package practicalmod2;

public class MatrixSum {
	public static void main(String[] args) {
		System.out.println("Program to add two matrix");
		int mat1[][]= {{1,2,3},	{4,5,6}};
		int mat2[][]= {{2,2,2},	{2,2,2}};
		int m=mat1.length;
		int n=mat1[0].length;
		int sumMat[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				sumMat[i][j]=mat1[i][j]+mat2[i][j];
				System.out.println(sumMat[i][j]+"\t");
			}
		System.out.println("");
		}
		
	}
}
