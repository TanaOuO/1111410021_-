package StarWar_1111410021;

public class AirCraft {
	private String Model;
	private double Length;
	private double AirSpeed;
	private String SpaceSpeed;
	private String StdandardEngine;
	private String[] Weapon ;
	private double Weapon_power;
	private int Passenger;
	
	AirCraft(){}
	
	AirCraft(String Model , double Length , double AirSpeed , String SpaceSpeed , String StdandardEngine   
			 , int Passenger ){
		this.setAirSpeed(AirSpeed);
		this.setLength(Length);
		this.setModel(Model);
		this.setPassenger(Passenger);
		this.setSpaceSpeed(SpaceSpeed);
		this.setStdandardEngine(StdandardEngine);
		this.setWeapon(Weapon);
		this.setWeapon_power(Weapon_power);
	}
	
	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public double getLength() {
		return Length;
	}

	public void setLength(double length) {
		Length = length;
	}

	public double getAirSpeed() {
		return AirSpeed;
	}

	public void setAirSpeed(double airSpeed) {
		AirSpeed = airSpeed;
	}

	public String getSpaceSpeed() {
		return SpaceSpeed;
	}

	public void setSpaceSpeed(String spaceSpeed) {
		SpaceSpeed = spaceSpeed;
	}

	public String getStdandardEngine() {
		return StdandardEngine;
	}

	public void setStdandardEngine(String stdandardEngine) {
		StdandardEngine = stdandardEngine;
	}

	public String[] getWeapon() {
		return Weapon;
	}

	public void setWeapon(String[] weapon) {
		Weapon = weapon;
	}

	public double getWeapon_power() {
		return Weapon_power;
	}

	public void setWeapon_power(double weapon_power) {
		Weapon_power = weapon_power;
	}

	public int getPassenger() {
		return Passenger;
	}

	public void setPassenger(int passenger) {
		Passenger = passenger;
	}
	
	
	
}
