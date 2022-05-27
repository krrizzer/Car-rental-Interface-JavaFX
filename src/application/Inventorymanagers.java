package application;

public class Inventorymanagers  {
	private String email;
	private String name;
	private int age;
	private int phone;
	private int numberofinvtoriesmanaged;
	private double salary;
	private static String pass="invintory1234";
	private static String username="Inventory manager";
	public Inventorymanagers(String email,String name,int age, int phone,int numberofinvtoriesmanaged,double salary) {
		
		this.email=email;
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.numberofinvtoriesmanaged=numberofinvtoriesmanaged;
		this.salary=salary;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getNumberofinvtoriesmanaged() {
		return numberofinvtoriesmanaged;
	}
	public void setNumberofinvtoriesmanaged(int numberofinvtoriesmanaged) {
		this.numberofinvtoriesmanaged = numberofinvtoriesmanaged;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Inventorymanagers [email=" + email + ", name=" + name + ", age=" + age + ", phone=" + phone
				+ ", numberofinvtoriesmanaged=" + numberofinvtoriesmanaged + ", salary=" + salary + "]";
	}
	public String save() {
		return "Inventorymanagers"+ " "+email + " "+ name +" "+  age +" "+ phone +" "+ numberofinvtoriesmanaged +" "+ salary;
	}
	

}
