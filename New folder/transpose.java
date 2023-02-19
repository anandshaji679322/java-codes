import java.util.Scanner;
public class transpose{
	public static void main(String ar[]){
		int k=0;
		System.out.println("Enter the no of rows and collum");
		int r,c;
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Enter the matrix");
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				a[i][j]=sc.nextInt();
			}
		}
		int b[][]=new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				b[j][i]=a[i][j];	
			}
		}
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}
	}
}