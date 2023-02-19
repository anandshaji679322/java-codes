import java.util.Scanner;
public class factorial{
	public static void main(String ar[]){	
		int f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++){
			f=f*i;
		}
		System.out.println("Factorial of"+a+"="+f);
	}
}