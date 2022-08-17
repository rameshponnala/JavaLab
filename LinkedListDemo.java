class LinkedList
{
		class Node
		{
			int data;
			Node next;
			public Node(int data)
			{
				this.data = data;
				next = null;
			}
		}
		
		Node head=null;
		Node tail=null;

		public void addAtHead(int data){
			Node newNode=new Node(data);
			if (head==null)
			{
					head=newNode;
					tail=newNode;
					head.next=null;
					tail.next=null;
			}
			else{
					newNode.next=head;
					head=newNode;
			}
		}
		public void add(int data){
			Node newNode=new Node(data);
			if (head.next==null)
			{
				head.next=newNode;
				tail=newNode;
			}
			else{
				tail.next=newNode;
				tail=newNode;
			}
		}

		public void addAtIndex(int index, int data){
			int pos=1;
			if (index==0)
			{
				addAtHead(data);
				return;
			}
			
			Node newNode=new Node(data);
			Node prev=head;
			Node current=head.next;
			while(pos<index)
			{
				pos++;
				prev=current;
				current=current.next;
			}
			if (pos==index)
			{
				prev.next=newNode;
				newNode.next=current;
			}
	}
	public void delete(int data){
		Node prev=head;
		Node current=head.next;
		if (prev.data==data)
		{
			head=current;
			prev.next=null;
			return;
		}
		while(current!=null && current.data!=data)
		{
			prev=current;
			current=current.next;
		}
		
		if (current.data==data)
		{
			prev.next=current.next;
			current.next=null;
		}
	
	}
		
		public void displayList(){
			Node temp=head;
			while(temp!=null){
				System.out.print(temp.data+ " -> ");
				temp=temp.next;
			}
		}
}
public class LinkedListDemo
{
	public static void main(String [] args){
			LinkedList list=new LinkedList();
			list.addAtHead(10);
			list.add(15);
			list.add(20);
			list.add(25);
			list.add(30);
			list.addAtIndex(1,5);
			list.displayList();
			list.delete(20);
			list.delete(10);
			list.delete(30);
			list.delete(5);
			System.out.println("\n After deleting the list is...\n");
			list.displayList();
	}
}