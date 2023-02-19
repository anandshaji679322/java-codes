import java.util.Scanner;
class employee{
	Scanner sc=new Scanner(System.in);
	String name;
	int age;
	String address;
	int salary;
	public void getdetails(){
		System.out.println("Enter the name");
		name=sc.next();
		System.out.println("Enter your age");
		age=sc.nextInt();
		System.out.println("Adress:");
		address=sc.next();
		System.out.println("Enter your salary");
		salary=sc.nextInt();
	} 
	public void displaydetails(){
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("address:"+address);
		System.out.println("salary:"+salary);
	}
}
class officer extends employee{
	Scanner sc=new Scanner(System.in);
	String spec;
	public void getspec(){
		System.out.println("Enter specilization");
		sc.next();
	}
	public void displayspec(){
		System.out.println("spec:"+spec);
	}
}
class manager extends employee{
	Scanner sc=new Scanner(System.in);
	String dip;
	public void setdip(){
	System.out.println("Enter dipartment");
	dip=sc.next();}
	public void displaydip(){
		System.out.println("department:"+dip);
	}
	
}
public class inheritance{
	public static void main(String ar[]){
		employee e=new employee();
		officer o=new officer();
		manager m=new manager();
		e.getdetails();
		System.out.println("employee");
		e.displaydetails();
		System.out.println("officer");
		o.getdetails();
		o.getspec();
		o.displaydetails();
		o.displayspec();
		System.out.println("manager");
		m.getdetails();
		m.setdip();
		System.out.println("employee");
		e.displaydetails();
		System.out.println("officer");
		o.displaydetails();
		o.displayspec();
				System.out.println("manager");
		m.displaydetails();
		m.displaydip();

		
		
		
	}
}