import java.util.Scanner;
class trye{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter two numbers");
		try{
			num1=sc.nextInt();
			num2=sc.nextInt();
			int result=num1/num2;
			System.out.println(result);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("end of operation");
		}
	}
}