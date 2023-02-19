abstract class sides{
	public abstract void noofsides();
}
class triangle extends sides{
	public void noofsides(){
		System.out.println("triangle:3");	
	}
}
class rectangle extends sides{
	public void noofsides(){
		System.out.println("rectanglt:4");
	}
}
class square extends sides{
	public void noofsides(){
		System.out.println("square:4");
	}
}
public class polymorphism{
	public static void main(String ar[]){
	triangle t=new triangle();
	rectangle r=new rectangle();
	square s=new square();
	t.noofsides();
	r.noofsides();
	s.noofsides();}
}