import java.util.Scanner;
public class palindrome{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int l=a.length();
		int flag=0;
		for(int i=0;i<(a.length())/2;i++){
			if(a.charAt(i)==a.charAt(l-i-1)){
			flag=0;
			}else{
				flag=1;
				System.out.println("is not a palindrome");
				break;
			}
		}
		if(flag==0){
			System.out.println("is a palindrome");
		}
	}	
}