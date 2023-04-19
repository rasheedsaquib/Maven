package project.projmaven;

public class Address {

	private int hnum;
	private String street;
	private int pincode;
	private String state;

	public int getHnum() {
		return hnum;
	}

	public void setHnum(int hnum) {
		this.hnum = hnum;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int hnum, String street, int pincode, String state) {
		super();
		this.hnum = hnum;
		this.street = street;
		this.pincode = pincode;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [hnum=" + hnum + ", street=" + street + ", pincode=" + pincode + ", state=" + state + "]";
	}

}
