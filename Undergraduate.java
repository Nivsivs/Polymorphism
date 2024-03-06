//this class is the undergraduate class which is the subclass of the student class
//this class shows students who are undergraduates. 
//this class includes methods to reset, get, set and output student level.
//this class also has method to compare two undergraduate are equal looking at their
//undergraduate level.
public class Undergraduate extends Student
{
  int level; //defining variable level
  
  public Undergraduate()//default constructor
  {
	  super(" ", 0); //calling constructor of main class with null values
	  level = 0; //setting level to null
  }
  
  public Undergraduate(String string, int studentNumber, int level)
  {
	  super(string, studentNumber);//calling constructor of the main class
	  this.level = level;//setting the value of level
  }
  
  //this is the output method to output details of undergraduate
  public void writeOutput()
  {
	  super.writeOutput();//calling method from main class
	  System.out.println("Level: " + level);
  }
  
  //resetting the details using this method
  public void reset(String newName, int newStudentNumber, int newlevel)
  {
	  name = newName;
	  studentNumber = newStudentNumber;
	  level = newlevel;
  }
  
  //this method helps in getting level
  public int getlevel() 
  {
	  return level;
  }
  
  //this method helps in setting level
  public void setLevel(int newLevel)
  {
	  level = newLevel;
  }
  
  //this method checks if the two undergraduates are equal
  public boolean equals(Undergraduate otherUndergraduate)
  {
	  if (level == otherUndergraduate.getlevel()) //checking if the levels are same
		  
		  return true;
	  
	  else return false;
  }
}
