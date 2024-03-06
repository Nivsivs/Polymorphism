//This is the faculty class which is the subclass of the employee class.
//this class has methods to output, get, set, reset the faculty member's information
//and compare two faculty members looking at their title
public class Faculty extends Employee
{
	//declaring a string variable
	String Title;
	
	//default constructor
	public Faculty()
	{
		super(" ", " ", 0);//calling the default constructor
		Title = " "; 
	}
	  
	  public Faculty(String string, String department, int employeeNumber, String title)
	  {
		  super(string,department, employeeNumber); //calling the defined constructor of the subclass employee
		  											//that has name, department and employeeNumber as the variables
		  this.Title = title;
	  }
	  
	  //this method is helping to output the faculty member's information
	  public void writeOutput()
	  {
		  super.writeOutput(); //calling the Output method of the subclass employee to 
		  					   //output the employee information
		  System.out.println("Title: " + Title); //output
	  }
	  
	  //this method is resetting the faculty member's information
	  public void reset(String newName, int newEmployeeNumber, String newtitle)
	  {
		  
		  name = newName; //setting Name
		  EmployeeNumber = newEmployeeNumber; //setting EmployeeNumber
		  Title = newtitle; //setting title
	  }
	  
	  //this is a method to get the title of faculty members.
	  public String getTitle() 
	  {
		  return Title;
	  }
	  
	  //this is a method that is setting the faculty member's title.
	  public void setTitle(String newTitle)
	  {
		  Title = newTitle;
	  }
	  
	  //this method is comparing if two faculty members are equal looking 
	  //at their title
	  public boolean equals(Faculty otherFaculty)
	  {
		  if (Title == otherFaculty.getTitle())
			  
			  return true;
		  
		  else return false;
	  }

}
