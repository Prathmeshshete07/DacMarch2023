package main;

public class Person implements Cloneable {

	String name;
	Address address;
	
	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdress() {
		return address;
	}
	public void setAdress(Address adress) {
		this.address = adress;
	}

	@Override
	protected Object clone() {
		try {
			Person other = (Person) super.clone();
			other.address = (Address) this.address.clone();
			return other;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			
		}
		return address;
		
		 
		
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		Person person1 = new Person("Prince", (new Address("Shivaji Marg","Panvel","Maharashtra")));
		Person person2 = (Person) person1.clone();
		System.out.println(person1 == person2);
		person2.name = "Bunty";
		person2.address.setStreet("RaniLaxmi Marg");
		person2.address.setCity("Khargar");
		System.out.println(person1);
		System.out.println(person2);
		
	}
	
	
}
