import java.util.Scanner;
public class prime{
	public static void main(String a[]){
		int n,flag=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int m=n/2;
		for(int i=2;i<=m;i++){
			if(n%i==0){
				System.out.println("is not a prime");
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println("is a prime number");
		}
	}
}