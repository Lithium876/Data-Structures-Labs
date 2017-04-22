
public class Customer {
	
	private String firstName;
	public String lastName;
	public String address;
	
	public Customer() {
		this.firstName = "";
		this.lastName = "";
		this.address = "";
	}
	
	public Customer(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display(){
		System.out.println("First Name: "+firstName+"\n"+"Last Name: "+lastName+"\n"+"Address: "+address+"\n");
	}
}