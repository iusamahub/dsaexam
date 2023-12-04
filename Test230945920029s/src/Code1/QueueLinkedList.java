package Code1;

public class QueueLinkedList extends EmpImpl {

   private Node head;
   private Node tail;
   
   //creation of Node of linkedlist
   class Node{
	   private EmpImpl data;
	   private Node next;
	   
	   public Node(int id,String name,String g) {
		   EmpImpl ob=new EmpImpl(id,name,g);
		   data=ob;
		   
		   next=null;
	   }
	   
	   
	   
   }
   
   
   //performing insertion operation on dequeue
   public  void enqeue(int id,String name,String g) {
	   
	   Node newNode=new Node(id,name,g);
	   
	   if(head==null) {
		   head=newNode;
		   tail=newNode;
	   }else{
		tail.next=newNode;
		tail=tail.next;
	   }
	   
   }
   
   //Removing the employee from the queue
   public void dequeu() {
	   if(head==null) {
		   System.out.println("Queue is Empty");
		   return;
	   }else {
		   System.out.println(head.data.toString());
		   head=head.next;
	   }
   }
   
   //printing the only female candidate from queue
   public void printFemale() {
	   if(head==null) {
		   System.out.println("Queue is already empty");
		   return;
	   }
	   Node temp=head;
	   
	   while(temp!=null) {
		   if(temp.data.getGender().equals("Female")) {
			   System.out.println(temp.data.toString());
		   }
		   temp=temp.next;
	   }
   }
   //helper funtion to print the queue in reverse Order
   public void helper(Node node) {
	   
	   if(node==null) {
		   return ;
	   }
	   
	   helper(node.next);
	   System.out.println(node.data.toString());
	   
	   
   }
   
   //reverse the 
   public void printQueueReverse() {
	   System.out.println("Queue in Reverse Order");
	   if(head==null) {
		   System.out.println("Queue is Empty Insert data");
	   }else {
		   helper(head);
	   }
	   
   }
   
   public void printMale() {
	   if(head==null) {
		   System.out.println("Queue is already empty");
		   return;
	   }else {
		   Node temp=head;
		   
		   while(temp!=null) {
			   if(temp.data.getGender().equals("Male")) {
				   System.out.println(temp.data.toString());
			   }
			   temp=temp.next;
		   }
	   }
	  
   }
   
   public void emptyFun(Node node) {
	   
	   if(node==null) {
		   return ;
	   }else {
		   dequeu();
		   emptyFun(node.next);  
	   }
	   
	   
   }
   
   public void emptyQueueRec() {
	   if(head==null) {
		   System.out.println("Queue is already empty");
		   return;
	   }else {
		   emptyFun(head);
	   }
	   
   }
   
   public void display() {
	   if(head==null) {
		   System.out.println("Queue is already empty");
		   return ;
	   }else {
		   Node temp=head;
		   while(temp!=null) {
			   System.out.println(temp.data.toString());
			   temp=temp.next;
			   
		   }
	   }
	   
   }
   
    
   
   public void removeById(int id) {
	   Node temp=head;
	   if(head==null) return;
	   int pos=1;
	   while(temp.data.getEmpid()!=id) {
		   pos++;
		   temp=temp.next;
	   }
	   
	   if(id==1) {
		   head=head.next;
	   }
	   int cnt=1;
	   Node temp1=head;
	   while(cnt<pos-1) {
		   temp1=temp1.next;
		   cnt++;
	   }
	   temp1.next=temp1.next.next;
   }
   
   
   
}
