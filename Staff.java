//this is the staff class which is the subclass of the employee class. this class shows
//a staff member and includes methods to output and reset and staff information and compare
//two staff members looking at their payGrade. 
public class Staff extends Employee
{
   int payGrade;
   public Staff() //initializes the named object with their default values
	 {
		 super(" ", " ", 0); //calling the main class constructor using empty strings
		 payGrade = 0; //setting payGrade to null
	 }
	    public Staff(String string, String department, int ID, int payGrade)
	    {
	    	super(string, department, ID); //calling constructor of the main class
	    	this.payGrade = payGrade; //setting the value for payGrade
	    }
	    
	    //method to print all the information about the staff
	    public void writeOutput() 
	    {
			  super.writeOutput(); //calling the main class method to output the
			  					   //information of the employee
		
		//checking if the payGrade value is within a valid range(1 to 20)
		if (payGrade >= 1 && payGrade <=20) { //printing out the value with a tag if it is valid 
	    System.out.println("PayGrade: " + payGrade);
	    }
	    else 
	    {
	    	System.out.println("Pay Grade: 0"); //printing 0 if the  payGrade is not valid i.e, less than 1 or greater than 20,
	    										//i.e, less than 1 or greater than 20,
	    }
	    }
	    
	   //method to get payGrade
	    public int getPayGrade()
	    {
	    	return payGrade;
	    }
	    
	    //method to set payGrade
	    public void setPayGrade(int pay)
	    {
	    	payGrade = pay;
	    }
	    
	    //method that compares two staff members looking at their payGrade
	    public boolean equals(Staff otherStaff)
	    {
	    	if (payGrade == otherStaff.getPayGrade())
	    		return true;
	    	
	    	else return false;
	    		
	    }

}
