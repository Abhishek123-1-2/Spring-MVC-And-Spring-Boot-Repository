package in.mindcraft;

public class Product {
private int pid;
private String make;
private double cost;
public Product() {
	
}
public Product(int pid, String make, double cost) {
	super();
	this.pid = pid;
	this.make = make;
	this.cost = cost;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getMake() {
	return make;
}
public String setMake(String make) {
	return this.make = make;
}
public double getCost() {
	return cost;
}
public double setCost(double cost) {
	return this.cost = cost;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", make=" + make + ", cost=" + cost + "]";
}


}
