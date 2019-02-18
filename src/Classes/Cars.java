package Classes;

public class Cars {
private String carName;
private String carModel;
private int carMilage;


public String getCarName() {
	return carName;
}
public void setCarName(String carName) {
	this.carName = carName;
}
public String getCarModel() {
	return carModel;
}
public void setCarModel(String carModel) {
	this.carModel = carModel;
}
public int getCarMilage() {
	return carMilage;
}
public void setCarMilage(int carMilage) {
	this.carMilage = carMilage;
}

public Cars() {
	super();
}
public Cars(String carName, String carModel, int carMilage) {
	super();
	this.carName = carName;
	this.carModel = carModel;
	this.carMilage = carMilage;
}
public String carSays(String action) {
	return action;
}


}
