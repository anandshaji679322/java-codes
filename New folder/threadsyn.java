class display{
	public synchronized void print(String msg){
		System.out.println("["+msg);
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("]");
	}
}
class syn extends Thread{
	String msg;
	display d;
	syn(display d,String msg){
		this.msg=msg;
		this.d=d;
	}
	public void run(){
		d.print(msg);
	}
}
public class threadsyn{
	public static void main(String ar[]){
		display d=new display();
		syn s1=new syn(d,"anand");
		syn s2=new syn(d,"c");
		s1.start();
		s2.start();
	}
}	