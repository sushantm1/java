package prgm55;

public class Matrix {
	public static void main(String[] args) {
		int firstmat[][]= {{1,2},
						   {3,4}};
		int secmat[][]= {{1,2},
						{3,4}};
		int[][] sum=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				sum[i][j]=firstmat[i][j]+secmat[i][j];
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++) {
				System.out.println(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
