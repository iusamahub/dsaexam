package beans;

public class EmpQueueLL {
	
	Node front,rear;
	class Node{
		Employee data;
		Node next;
		public Node(Employee data) {
			this.data=data;
			next=null;
		}
	}
	public EmpQueueLL() {
		super();
		front=null;
		rear=null;
	}
	public boolean isEmpty() {
		return front==null && rear==null;
	}
	//a->Insert Employee
	public void enqueue(Employee emp) {
		Node newnode=new Node(emp);
		if(isEmpty()) {
			front=newnode;
		}else {
			rear.next=newnode;
		}
		rear=newnode;
	}
	//b->Remove Employee
	public Employee dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!!");
		}
		else {
			Node temp=front;
			front=front.next;
			temp.next=null;
			return temp.data;
		}
		return null;
	}
	//c->Print Complete Queue Using Linked List
	@Override
	public String toString() {
		Node temp=front;
		while(temp!=null) {
			System.out.println(temp.data+"->");
			temp=temp.next;
		}
		return null;
		
	}
	//d->Print All Female Employees
	public void FemaleEmp() {
		if(isEmpty()) {
			return ;
		}else {
		Node temp=front;
		while(temp!=null) {
			if(temp.data.getGender().equals("Female")) {
				System.out.println(temp.data);
				temp=temp.next;
			}else {
				temp=temp.next;
			}
		}
		}
	}
	
	//e->Print All Male Employees
	public void MaleEmp() {
		if(isEmpty()) {
			return ;
		}else {
			Node temp=front;
			while(temp!=null) {
				if(temp.data.getGender().equals("Male")) {
					System.out.println(temp.data); 
					temp=temp.next;
				}else {
					temp=temp.next;
				}
				
			}
		}
	
	}
	//f->Empty Queue Using Recursion
	public void recdequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!!");
			return;
		}else {
		Node temp=front;
		while(temp!=null) {
		//Node temp=front;
		front=front.next;
		temp.next=null;
		System.out.println("Employee Removed!!\n");
		recdequeue();
		}
		System.out.println("List is Empty!!");
		}
	}
	//e->Print Queue in Reverse Order
	public void revQueue() {
		Node oldfront=front;
		front=null;
		while(oldfront!=null) {
			Node temp=oldfront;
			oldfront=oldfront.next;
			temp.next=front;
			front=temp;
		}
	}
}
