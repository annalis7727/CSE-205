public class Person {
	
	String firstName = " ";
	String lastName = " ";
	int birthYear = 0;
	
	public Person (String fname, String lname, int byear)
	{
		firstName = fname; 
		lastName = lname; 
		birthYear = byear;
	}

	public String getfirstName()
	{
		return firstName; 
	}
	
	public String getlastName() 
	{
		return lastName; 
	}
	
	public int getAge(int currentYear)
	{
		return currentYear - birthYear; 
	}
	
}

