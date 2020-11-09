package addressbook;
import java.util.Comparator;
public class Person 
{
	
	String firstName;
	String lastName;
	String city;
	String state;
	String phone;
	int zip;

	public Person(String firstName, String lastName, String city, String state, String phone, int zip) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.phone = phone;
		this.zip = zip;
	}
	
	public static Comparator<Person> obj1 = new Comparator<Person>()
	{
		public int compare(Person p1, Person p2) 
		{
		   String PersonName1 = p1.getFirstName().toUpperCase();
		   String PersonName2 = p2.getFirstName().toUpperCase();
		   //ascending order
		   return PersonName1.compareTo(PersonName2);
		   //descending order
		   //return StudentName2.compareTo(StudentName1);
	    }
	};
	public static Comparator<Person> obj2 = new Comparator<Person>()
	{
		public int compare(Person p1, Person p2) 
		{
		   int zip1 = p1.getZip();
		   int zip2 = p2.getZip();
		   /*For ascending order*/
		   return zip1-zip2;
		   /*For descending order*/
		   //rollno2-rollno1;
	   }
	};
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getState() 
	{
		return state;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	public String getPhone() 
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public int getZip()
	{
		return zip;
	}
	public void setZip(int zip)
	{
		this.zip = zip;
	}

	@Override
	public String toString()
	{
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state=" + state
				+ ", phone=" + phone + ", zip=" + zip + "]";
	}

}
