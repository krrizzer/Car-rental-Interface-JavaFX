package application;

public class Cars  {
	private int CarNumber;
	private int CarModel;
	private double CarPrice;
	private String CarColor;
	private String CarLocation;
	private int SeatNumber;
	private String CarName;

	public Cars(int carNumber,int carModel, double carPrice, String carColor, String carLocation, int seatNumber, String carName) {
		CarNumber =carNumber;
		CarModel = carModel;
		CarPrice = carPrice;
		CarColor = carColor;
		CarLocation = carLocation;
		SeatNumber = seatNumber;
		CarName = carName;
		
	}
	public int getCarNumber() {
		return CarNumber;
	}
	public void setCarNumber(int carNumber) {
		this.CarNumber = carNumber;
	}
	public int getCarModel() {
		return CarModel;
	}
	public void setCarModel(int carModel) {
		CarModel = carModel;
	}
	public double getCarPrice() {
		return CarPrice;
	}
	public void setCarPrice(double carPrice) {
		CarPrice = carPrice;
	}
	public String getCarColor() {
		return CarColor;
	}
	public void setCarColor(String carColor) {
		CarColor = carColor;
	}
	public String getCarLocation() {
		return CarLocation;
	}
	public void setCarLocation(String carLocation) {
		CarLocation = carLocation;
	}
	public int getSeatNumber() {
		return SeatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		SeatNumber = seatNumber;
	}
	public String getCarName() {
		return CarName;
	}
	public void setCarName(String carName) {
		CarName = carName;
	}


	public String save() {
		return "Cars"+CarNumber+ CarModel + CarPrice + CarColor + CarLocation + SeatNumber +CarName;
	}
	@Override
	public String toString() {
		return "Cars [CarNumber=" + CarNumber + ", CarModel=" + CarModel + ", CarPrice=" + CarPrice + ", CarColor="
				+ CarColor + ", CarLocation=" + CarLocation + ", SeatNumber=" + SeatNumber + ", CarName=" + CarName
				+ "]";
	}
	

}
