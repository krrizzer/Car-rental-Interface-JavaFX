package application;

public class Orders {
	private int orderNumber;
	private String orderPeriod;
	private String location;
	private String insurance;
	private String payment;
	private int requestedCarNumber;
	private String orderStatus;
	public Orders(int orderNumber, String orderPeriod, String location, String insurance, String payment,
			int requestedCarNumber, String orderStatus) {
		super();
		this.orderNumber = orderNumber;
		this.orderPeriod = orderPeriod;
		this.location = location;
		this.insurance = insurance;
		this.payment = payment;
		this.requestedCarNumber = requestedCarNumber;
		this.orderStatus = orderStatus;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrderPeriod() {
		return orderPeriod;
	}
	public void setOrderPeriod(String orderPeriod) {
		this.orderPeriod = orderPeriod;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public int getRequestedCarNumber() {
		return requestedCarNumber;
	}
	public void setRequestedCarNumber(int requestedCarNumber) {
		this.requestedCarNumber = requestedCarNumber;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	@Override
	public String toString() {
		return "Orders [orderNumber=" + orderNumber + ", orderPeriod=" + orderPeriod + ", location=" + location
				+ ", insurance=" + insurance + ", payment=" + payment + ", requestedCarNumber=" + requestedCarNumber
				+ ", orderStatus=" + orderStatus + "]";
	}
	public String save() {
		return "Orders"+ orderNumber + orderPeriod + location+ insurance +  payment + requestedCarNumber+ orderStatus;
	}
	
}
