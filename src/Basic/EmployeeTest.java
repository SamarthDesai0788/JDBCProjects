package Basic;

import java.util.*;
public class EmployeeTest {

	public static void main(String[] args) {
	Employedao e=new Employedao(12,"samarth",60000);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Options");
	System.out.println("1.Insert\n 2.Delete\n 3.Update\n 4.Display/n");
	int option=sc.nextInt();
	switch(option) {
	case 1:
		System.out.println("Enter id");
		e.setEmpid(sc.nextInt());
		System.out.println("Enter name");
		e.setEname(sc.next());
		System.out.println("Enter Salary");
		e.setSalary(sc.nextInt());
//		db.insert(e.getEmpid(),e.getEname(),e.getSalary());
		break;
	
	}
	}

}

