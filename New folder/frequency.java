import java.util.Scanner;
public class frequency{
	public static void main(String ar[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String a= sc.nextLine();;
	System.out.println("Enter the letter to find frequency");
	char c=sc.nextLine().charAt(0);
	int count=0,i;
	for(i=0;i<(a.length());i++){
		if(a.charAt(i)==c){
			count=count+1;
		}
	}
	System.out.println(count);
	
} 
}