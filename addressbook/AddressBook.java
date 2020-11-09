package addressbook;
import java.util.ArrayList;
import java.util.*;
public class AddressBook implements InAddressBook 
{	
	ArrayList<Person> PersonArrayList;
	public AddressBook() 
	{
		PersonArrayList = new ArrayList<Person>();
	}
	public void addPerson()
    {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter firstname of the person: ");
		String firstname=s1.nextLine();
		System.out.println("Enter lastname of the person: ");
		String lastname=s1.nextLine();
		System.out.println("Enter the city name of the person:");
		String city=s1.nextLine();
		System.out.println("Enter the state of the person");
		String state=s1.nextLine();
		System.out.println("Enter phone number of the person");
		String phone=s1.nextLine();
		System.out.println("Ente the zip code of the person");
		int zip=s1.nextInt();
				
		Person person = new Person( firstname,lastname, city,state, phone, zip);
		PersonArrayList.add(person);
		//	s1.close();
		//System.out.println(PersonArrayList);
	}

	@Override
	public void editPerson() 
	{
		int num=1;
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter firstname of a person to edit details:");
		String name=s2.nextLine();
		for(Person person : PersonArrayList)
		{
			//System.out.println(person.toString());
			if(name.equals(person.firstName)) 
			{
				 while(num==1) 
				 {		
						System.out.println("Enter an option to edit:"
									+"1.phone number\n"
									+"2.address\n"
									+"3.quit\n");
						int value=s2.nextInt();
						Scanner s3=new Scanner(System.in);
						switch(value) 
						{
							case 1:
												System.out.println("Enter new phonenumber: ");
												String phonenumber=s3.nextLine();
												person.setPhone(phonenumber);
												System.out.println(person.toString());
												break;
							case 2:
												
												System.out.println("Enter new city: ");
												String city=s3.nextLine();
												person.setCity(city);
												System.out.println("Enter new state:");
												String state=s3.nextLine();
												person.setState(state);
												System.out.println("Enter new zip code:");
												int  zip=s3.nextInt();
												person.setZip(zip);
												break;
							case 3:  
												num=0;
												break;
							default:
												System.out.println("wrong option entered");
												break;
						}
			
				}
			}
			else 
			{
				System.out.println(" sorry Name not found");
			}
		}			 	
	}
	@Override
	public void deletePerson() 
	{
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter firstname of a person to delete details:");
	    String name=s3.nextLine();
		for(Person person : PersonArrayList)
			{
			    
			    if(name.equals(person.firstName)) 
			    {
			        PersonArrayList.remove(person); 
			        for(Person person1 : PersonArrayList)
				     {
						System.out.println(person1.toString());
					 }
			    }
			    else
			    {
			        System.out.println("sorry Name not found");
			    }
			 }
	}
    @Override
	public void sortByName() 
	{
    	System.out.println("Person Name Sorting:");
 	    Collections.sort(PersonArrayList, Person.obj1 );
 	   for(Person person : PersonArrayList)
	     {
			System.out.println(person.toString());
		 }
	}

	@Override
	public void sortByZip() 
	{
		System.out.println("Showing the details sorted by zip:");	
		System.out.println("zip Sorting:");
 	    Collections.sort(PersonArrayList, Person.obj2 );
 	   for(Person person : PersonArrayList)
	     {
			System.out.println(person.toString());
		 }
	}

	@Override
	public void searchPerson()
	{
		Scanner s4=new Scanner(System.in);
		 System.out.println("Enter firstname of a person to search details:");
		 String name=s4.nextLine();
		for(Person person : PersonArrayList)
    	{
	         //System.out.println(person.toString());			         
			
	         if(name.equals(person.firstName)) 
		     {
	        	  System.out.println(person.toString());
	        	  
			 }
			 else
			 {
			      System.out.println("sorry Name not found");
			 }
		}
			
	}
    @Override
    public void display() 
    {
	     for(Person person : PersonArrayList)
	     {
			System.out.println(person.toString());
		 }
	}		
}

