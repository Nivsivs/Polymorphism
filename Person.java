//this is the person class that acts as a main class for particular types of persons, like students,
//employee, undergraduate, faculty and staff.
//it also shows a person with a name field and other methods to set, get, reset and output the name 
//as well compare the names. 
public class Person
{
	String name;
	
	//setting the name field to a null string with the help of
	//of a default constructor
	public Person()
	{
		name = " ";
	}
   
	//setting the name field to the given string with the help of
	//of a default constructor
	public Person(String string) 
	{
		this.name = string;
	}
	
	//this method is helping to output the name of the person
	public void writeOutput()
	{
		System.out.println("Name: " + name);
	}
	
	//this method is helping to set the name of the person to 
	//a new name
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	//this method is helping to get the name of the person
	public String getName()
	{
		return name;
	}
	
	//this method is checking if this person has the same name as
	//the other person
	public boolean hasSameName(Person otherPerson)
	{
		if (name == otherPerson.getName())
			return true;
		
		else 
			return false;
	}
}

