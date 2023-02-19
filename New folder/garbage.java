public class garbage{
	public static void main(String ar[]){
		test g1=new test();
		test g2=new test();
		System.out.println(g1);
		System.out.println(g2);
		g1=null;
		System.gc();
		g2=null;
		
		Runtime.getRuntime().gc();

	}
	protected void finalize() throws Throwable{
		System.out.println("Garbage collected");
		System.out.println("object garbage"+this);
	}
}