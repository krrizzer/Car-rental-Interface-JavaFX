package application;

public class Renter extends User {
	private String email;
	private String name;
	private int age;
	private int licenseNumber;
	private int phoneNumber;
	private int paymentCardNumber;
	private int cvv;
	public Renter(String username,String pass,String email, String name, int age, int licenseNumber, int phoneNumber, int paymentCardNumber,
			int cvv) {
		super(username,pass);
		this.email = email;
		this.name = name;
		this.age = age;
		this.licenseNumber = licenseNumber;
		this.phoneNumber = phoneNumber;
		this.paymentCardNumber = paymentCardNumber;
		this.cvv = cvv;
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
	public int getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getPaymentCardNumber() {
		return paymentCardNumber;
	}
	public void setPaymentCardNumber(int paymentCardNumber) {
		this.paymentCardNumber = paymentCardNumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "Renter [email=" + email + ", name=" + name + ", age=" + age + ", licenseNumber=" + licenseNumber
				+ ", phoneNumber=" + phoneNumber + ", paymentCardNumber=" + paymentCardNumber + ", cvv=" + cvv + "]";
	}
	public String save() {
		return "Renter"+" "+super.getUsername()+" "+super.getPassword()+  " "+ email+ " "+ name+ " "+age+ " "+licenseNumber+ " "+phoneNumber+ " "+paymentCardNumber+ " "+cvv;
	}
	

}
