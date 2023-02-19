import java.util.Scanner;
import java.util.StringTokenizer;
public class tokeni{
	
	public static void main(String ar[]){
		int sum=0;
		Scanner sc=new Scanner(System.in);
		String a;
		System.out.println("Enter the string:");
		a=sc.nextLine();
		StringTokenizer st=new StringTokenizer(a,"");
		while(st.hasMoreTokens()){
			String temp=st.nextToken();
			int b=Integer.parseInt(temp);
			System.out.print(b);
			 sum=sum+b;
		}
		System.out.print(sum);
		
	}
}