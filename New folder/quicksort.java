public class quicksort{
	String names[];
	int l;
	public static void main(String ar[]){
		quicksort q=new quicksort();
		String namelist[]={"Raja","Gouthu","Rani","Gouthami","Honey","Heyaansh","Hello"};
		q.sort(namelist);
		for(String i:namelist){
			System.out.print(i);
		}

	}
	public void sort(String a[]){
		if(a==null||a.length==0){
			return;
		}
		this.names=a;
		this.l=a.length;
		quicksort(0,l-1);
	}
	public void quicksort(int x,int y){
		int i=x;
		int j=y;
		String pivot=this.names[x+(y-x)/2];
		while(i<=j){
			while(this.names[i].compareToIgnoreCase(pivot)<0){
				i++;
			}
			while(this.names[j].compareToIgnoreCase(pivot)>0){
				j--;
			}
			if(i<=j){
				String temp=this.names[i];
				this.names[i]=this.names[j];
				this.names[j]=temp;
				i++;
				j--;
			}
			if(x<j){
				quicksort(x,j);
			}if(y>i){
				quicksort(i,y);
			}
		}
	}
	
}