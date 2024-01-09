package StarWar_1111410021;

public class TieFighter extends AirCraft {
	private String Manufacturer;
	
	TieFighter(){}
	
	TieFighter(String Manufacturer , String Model , double Length , double AirSpeed , String SpaceSpeed , String StdandardEngine 
	,int Passenger){
		this.setManufacturer(Manufacturer);
		this.setAirSpeed(AirSpeed);
		this.setLength(Length);
		this.setModel(Model);
		this.setPassenger(Passenger);
		this.setSpaceSpeed(SpaceSpeed);
		this.setStdandardEngine(StdandardEngine);
	
		
		
	}

	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "TieFighter [Manufacturer=" + Manufacturer + "]";
	}
	
	
}
