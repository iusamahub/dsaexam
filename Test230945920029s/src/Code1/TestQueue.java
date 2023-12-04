package Code1;

import java.util.Scanner;

public class TestQueue {

	public static void main(String[] args) {
		
		QueueLinkedList ob=new QueueLinkedList();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter your choice \n1.Insert Employee.\n2.Remove Employee.\n3.Print complete Employee.\n4.Print all Female Employee.\n5.Print all Male Employee.\n6.Empty Queue using recursion.\n7.Print Queue in reverse Order.\n8.Remove by id.\n9.Exit");
		     choice=sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter a empid");
					int id=sc.nextInt();
					
					System.out.println("Enter a name");
					String name=sc.next();
					
					System.out.println("Enter a gender in this format Female/Male");
					String gender=sc.next();
					ob.enqeue(id, name, gender);
					break;
				case 2:
					ob.dequeu();
					break;
				case 3:
					ob.display();
					break;
				case 4:
					ob.printFemale();
					break;
				case 5:
					ob.printMale();
					
					break;
				case 6:
					System.out.println("Empty Queue using Recursion");
					ob.emptyQueueRec();
					break;
				case 7:
					ob.printQueueReverse();
					break;
				case 8:
					System.out.println("Enter a id");
					int idd=sc.nextInt();
					ob.removeById(idd);
					break;
				case 9:
					System.out.println("Thank You.....");
					System.exit(0);
					break;
				default :
					System.out.println("Enter  a correct choice");
					break;
			
				
			}
			
			
			
			
		}while(choice!=9);
		
		
		
		
		
		
		
		
		

	}

}
