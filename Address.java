package detail;

public class Address {
	private String city;
	private String state;
	private String street;
	
	public Address() {
		
	}
	public Address(String street,String city,String state)
	{
		this.city=city;
		this.state=state;
		this.street=street;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", street=" + street + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
