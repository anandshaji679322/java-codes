public class main{
	String a[];
	int l;
	public static void main(String ar[]){
		String list[]={"Raja","Goutham","Rani","Gouthami","Honey","Hello","Heyaansh"};
		main m=new main();
		m.sort(list);
		for(String i:list){
			System.out.println(i);
		}
	}
	public void sort(String array[]){
		if(array==null||array.length==0){
			return;
		}
		this.a=array;
		this.l=array.length;
		quicksort(0,l-1);
	}
	public void quicksort(int start,int end){
		int i=start;
		int j=end;
		String pivot=this.a[(start+(start-end))/2];
		while(i<=j){
			while(this.a[i].compareToIgnoreCase(pivot)<0){
				i++;
			}while(this.a[j].compareToIgnoreCase(pivot)>0){
				j--;
			}
			if(i<=j){
				String temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}if(start<j){
				quicksort(start,j);
			
			}if(end>i){
				quicksort(i,end);
		}	}
		

	}	
	
}