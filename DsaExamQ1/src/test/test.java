package test;
import java.util.Scanner;
import beans.EmpQueueLL;
import beans.Employee;
public class test {
	public static void main(String[] args) {
		EmpQueueLL ob=new EmpQueueLL();
		Employee e1=new Employee(1,"Varun","Male");
		Employee e2=new Employee(2,"Kriti","Female");
		Employee e3=new Employee(3,"arun","Male");
		ob.enqueue(e1);
		ob.enqueue(e2);
		ob.enqueue(e3);
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
		System.out.println("Menu:\n1.Insert Employee\n2.Remove Employee\n"
				+ "3.Print complete Queue using toString()\n4.Print All Female Employees\n"
				+ "5.Print All Male Employees\n6.Empty Queue Using Recursion\n7.Print Queue in Reverse Order\n8.Exit");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter Employee Details: \n");
			System.out.println("Empid\n");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Fullname");
			String fullname=sc.nextLine();
			System.out.println("Gender(Male/Female");
		    String gender=sc.nextLine();
		    Employee emp=new Employee(id,fullname,gender);
		    ob.enqueue(emp);
			break;
		case 2:
			Employee empp=ob.dequeue();
			if(empp!=null) {
				System.out.println(empp);
				System.out.println("Removed!!");
			}else {
				System.out.println("Queue is Empty!!");
			}
			break;
		case 3:
			ob.toString();
			break;
		case 4:
			ob.FemaleEmp();
			break;
		case 5:
			ob.MaleEmp();
			break;
		case 6:
			ob.recdequeue();
			break;
		case 7:
			ob.revQueue();
			ob.toString();
			break;
		case 8:
			System.out.println("Thank You For Visiting!!");
			break;
		default:
			System.out.println("Invalid Choice!!");
		}			
		}while(ch!=8);
	}

}
