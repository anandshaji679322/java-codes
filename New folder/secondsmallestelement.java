import java.util.Scanner;
public class secondsmallestelement{
	public static void main(String ar[]){
		int m=10;
		int a[]=new int[m];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arry");
		int n=sc.nextInt();
		System.out.println("Enter the number to insert");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second samllest element is :"+a[1]);
		
	}
}