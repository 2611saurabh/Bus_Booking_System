package detail;

public class Bus {
	
	private String busnumber;
	private String source;
	private String destination;
	private String operatorName;
	private int fare;
	
	public Bus()
	{
		
	}
	
	public Bus(String busnumber,String source,String destination,String operatorName,int fare)
	{
		this.busnumber=busnumber;
		this.destination=destination;
		this.source=source;
		this.operatorName=operatorName;
		this.fare=fare;
	}
	
	

	@Override
	public String toString() {
		return "Bus [busnumber=" + busnumber + ", source=" + source + ", destination=" + destination + ", operatorName="
				+ operatorName + ", fare=" + fare + "]";
	}

	public String getBusnumber() {
		return busnumber;
	}

	public void setBusnumber(String busnumber) {
		this.busnumber = busnumber;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}
	

}
