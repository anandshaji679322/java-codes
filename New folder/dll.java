import java.util.Scanner;
class doubly{
	class node{
		int item;
		node pre;
		node next;
		node(int item){
			this.item=item;
		}
		
	}node head,tail=null,temp;
	public void addnode(int item){
		node newnode=new node(item);
		if(head==null){
			head=newnode;
			tail=newnode;
			head.next=null;
			head.pre=null;
		}
		else{
			tail.next=newnode;
			newnode.pre=tail;
			newnode.next=null;
			tail=newnode;
		}
	}
	public void deletenode(int data){
		temp=head;
		while(temp.item!=data){
			temp=temp.next;
		}
		temp.pre.next=temp.next;
		temp.next.pre=temp.pre;
	}
	public void display(){
		temp=head;
		while(temp.next!=null){
			System.out.print(temp.item+" ");
			temp=temp.next;
		}
		System.out.print(temp.item+" ");
	}
	
}
public class dll{
	public static void main(String ar[]){
		doubly d=new doubly();
		d.addnode(1);
		d.addnode(2);
		d.addnode(23);
		d.addnode(9);
		d.display();
		d.deletenode(23);
		d.display();
	}
}