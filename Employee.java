// This class is called the employee class which is the subclass of the person class that shows an  
//employee with name, department and employee number.
//this class defines method to set, get, reset, output and compare employee information
public class Employee extends Person
{
	//defining variables
	 int EmployeeNumber;
	 String department;
	  
	 //default constructor
	 public Employee()
	 {
		 super(""); //calling default constructor of the main class
		 EmployeeNumber = 0;
	 }
	    public Employee(String string, String department, int ID)
	    {
	    	super(string); //calling constructor of main class
	    	this.department=department;
	    	EmployeeNumber = ID; //setting the value of employeeNumber
	    }
	    
	    //this the method that will help to output employee information
	    public void writeOutput()
	    {
			  super.writeOutput();//calling the Output method of the main class
			    System.out.println("Department: " + department);
	    System.out.println("Employee ID: " + EmployeeNumber);
	    }
	    
	    //this method helps to reset employee information
	    public void reset(String newName, int newEmployeeNumber)
	    {
	    	name = newName;
	    	EmployeeNumber = newEmployeeNumber;
	    }
	    
	    //this method helps in getting the employee number
	    public int getEmployeeNumber()
	    {
	    	return EmployeeNumber;
	    }
	    
	    //this method helps in setting the employee number
	    public void setEmployeeNumber(int newEmployeeNumber)
	    {
	    	EmployeeNumber = newEmployeeNumber;
	    }
	    
	    //this method is checking if the two employee numbers are equal
	    public boolean equals(Employee otherEmployee)
	    {
	    	if (EmployeeNumber == otherEmployee.getEmployeeNumber())
	    		return true;
	    	
	    	else return false;
	    		
	    }

}
