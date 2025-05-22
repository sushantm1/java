package prgm55;
// how to ad matrix in java c
class Functions{
	public void sum(int firstmat[][],int secmat[][]) {
		int m=firstmat.length;
		int n=secmat[0].length;
		int sum[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				sum[i][j]=firstmat[i][j]+secmat[i][j];
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}
//	public void 
}

public class P32_Matrix {
	public static void main(String[] args) {
		int firstmat[][]= {{1,2},
						   {3,4}};
		int secmat[][]= {{1,2},
						{3,4}};
		int sum[][]=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				sum[i][j]=firstmat[i][j]+secmat[i][j];
			}
		}
		int rows=firstmat.length;
//		System.out.println(rows);
//		System.out.println(firstmat[0].length);
	Functions fn=new Functions();
	fn.sum(firstmat, secmat);
		
		
	}
}
