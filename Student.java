//this class is the student class which is the subclass of person class. this clas
//includes method to output, reset, get and set student number and also contains method
//to compare two students looking at the student number.
public class Student extends Person
{
    int studentNumber;
    
    public Student ()
    {
    	super(" ");
    	studentNumber = 0;
    }
    public Student(String string, int ID)
    {
    	super(string); //calling constructor of person class
    	studentNumber = ID; //setting the value of studentNumber
    }
    
    //this method helps to output the name and student number of the student
    public void writeOutput()
    {
		  super.writeOutput();

    System.out.println("Student Number: " + studentNumber);
    }
    
    
    //this method helps to reset the name and student number
    public void reset(String newName, int newStudentNumber)
    {
    	name = newName;
    	studentNumber = newStudentNumber;
    }
    
    //this method helps to get the student number
    public int getStudentNumber()
    {
    	return studentNumber;
    }
    
    //this method helps to set the student number
    public void setStudentNumber(int newStudentNumber)
    {
    	studentNumber = newStudentNumber;
    }
    
    //this method compares two students looking at their 
    //student number
    public boolean equals(Student otherStudent)
    {
    	if (studentNumber == otherStudent.getStudentNumber())
    		return true;
    	
    	else return false;
    		
    }
}
