package Assignment4;

class Employee{
	String name;
	int year;
	String address;
	
	Employee(String name , int year, String address) {
		this.name= name;
		this.year = year;
		this.address = address;
	}

	void printEmployee(){
		String str  = this.name + "    "+ this.year + "       " + this.address;
		System.out.println(str);
	}
}

public class Question2 {

    public static void main(String[] args) {

		System.out.println("Name   Year of Joining   Address");

		Employee emp1 = new Employee("Robert  " , 1994, "  64C- WallsStreat");
		emp1.printEmployee();

		Employee emp2 = new Employee("Sam     " , 2000, "  68D- WallsStreat");
		emp2.printEmployee();

		Employee emp3 = new Employee("John    " , 1999, "  26B- WallsStreat");
		emp3.printEmployee();
	}


    
}
