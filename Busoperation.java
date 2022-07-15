package detail;

import java.util.ArrayList;
import java.util.List;

public class Busoperation {
	
	static List<Bus> buslList=new ArrayList<>();
	public void Busoperation(String busnumber,String source,String destination,String operatorName,int fare)
	{
		Bus bus=new Bus(busnumber,source,destination,operatorName,fare);
		buslList.add(bus);
	}
	
	public List<Bus> searchBus(String source,String destination)
	{
		List<Bus> resultBus=new ArrayList<>();
		for(Bus bus:buslList)
		{
			if(source.equals(bus.getSource()) &&destination.equals(bus.getDestination()))
			{
				resultBus.add(bus);
			}
		}
		return resultBus;
	}
}
