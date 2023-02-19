import java.util.*;
class oddthread extends Thread{
	int num;
	oddthread(int num){
		this.num=num;
	}
	public void run(){
		System.out.println("odd number:"+num);
	}

}
class eventhread extends Thread{
	int num;
	eventhread(int num){
		this.num=num;
	}
	public void run(){
		System.out.println("even number:"+num);
	}

}
class numbers extends Thread{
	public void run(){
	for(int i=1;i<100;i++){
		if(i%2==0){
			new eventhread(i).start();
		}else{
			new oddthread(i).start();
		}	
	}
	}
}
public class mthreading{
	public static void main(String ar[]){
		numbers n=new numbers();
		n.start();
	}
}