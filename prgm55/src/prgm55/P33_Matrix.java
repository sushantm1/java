package prgm55;

import java.util.Scanner;
public class P33_Matrix {
	void multiply(int mat1[][],int mat2[][]) {
		int m=mat1.length;
		int n=mat1[0].length;
		int newmat[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				newmat[i][j]=mat1[i][j]*mat2[i][j];
			System.out.print(newmat[i][j]+"\t");
			}
			System.out.println("");
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
		int mat2[][]=new int[m][n];
		
		System.out.println("enter elements for First matrix ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter elements for second matrix ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
		P33_Matrix mt=new P33_Matrix();
		mt.multiply(mat1, mat2);
		sc.close();
	}
}
