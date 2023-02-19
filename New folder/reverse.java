import java.util.Scanner;
public class reverse{
	public static void main(String ar[]){
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int l =a.length();
		for(int i=l-1;i>=0;i--){
			System.out.print(a.charAt(i));

		}

	}
}