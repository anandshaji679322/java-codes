import java.util.Scanner;
public class matrix{
	public static void main(String ar[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows and collum:");
	int c1=sc.nextInt();
	int r1=sc.nextInt();
	System.out.println("Enter the number of rows and collum of second matrix:");
	int c2=sc.nextInt();
	int r2=sc.nextInt();
	if(c1==r2){
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		int c[][]=new int[r1][c2];
		System.out.println("Enter the first matrix");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the second matrix");
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				for(int k=0;k<c1;k++){
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0;i<c1;i++){
			for(int j=0;j<r2;j++){
				System.out.print(c[i][j]+" ");
			}
		}
	}}
	
}