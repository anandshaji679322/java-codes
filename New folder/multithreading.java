import java.util.Random;
class randomthread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
		Random r=new Random();
		int num=r.nextInt(100);
		if(num%2==0){
			new eventhread(num).start();
			//new eventhread(num);
		}
		else{
			new oddthread(num).start();
			//new oddthread(num);
		}
}
	}
}
class eventhread extends Thread{
	int num;
	eventhread(int num){
		this.num=num;
		//System.out.println("square "+num+":"+num*num);
	}
	public void run(){
		System.out.println("square "+num+":"+num*num);
	}
}
class oddthread extends Thread{
	int num;
	oddthread(int num){
		this.num=num;
		//System.out.println("cube"+num+":"+num*num*num);
	}
	public void run(){
		System.out.println("cube"+num+":"+num*num*num);	
	}
}
public class multithreading{
	public static void main(String ar[]){
		randomthread r=new randomthread();
		r.start();
	}
}
