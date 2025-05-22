package prgm55;

import java.util.Scanner;

public class P34_Matrix_transpose {
	
	public void transpose(int mat[][]) {
		int m=mat.length;
		int n=mat[0].length;
		int newmat[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				newmat[i][j]=mat[j][i];
				System.out.print(newmat[i][j]+"\t");
			}System.out.println("");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the size of the matrix");
		System.out.println("enter rows : ");
		int m=sc.nextInt();
		System.out.println("enter columns : ");
		int n=sc.nextInt();
		int mat1[][]=new int[m][n];
		System.out.println("enter elements for the matrix ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		
		P34_Matrix_transpose mt=new P34_Matrix_transpose();
		mt.transpose(mat1);
		sc.close();
	}
}
