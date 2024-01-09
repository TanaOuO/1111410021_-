package StarWar_1111410021;

import java.util.Arrays;

public class XWing extends AirCraft {
	private String HyperSpaceEngine;
	private String[] Shield;
	private double[] ShieldPower;
	
	XWing()	{}
	
	XWing(String HyperSpaceEngine , String Model , double Length , double AirSpeed , String SpaceSpeed , String StdandardEngine 
		,int Passenger){
		this.setHyperSpaceEngine(HyperSpaceEngine);
		this.setAirSpeed(AirSpeed);
		this.setLength(Length);
		this.setModel(Model);
		this.setPassenger(Passenger);
		this.setSpaceSpeed(SpaceSpeed);
		this.setStdandardEngine(StdandardEngine);
	}

	public String getHyperSpaceEngine() {
		return HyperSpaceEngine;
	}

	public void setHyperSpaceEngine(String hyperSpaceEngine) {
		HyperSpaceEngine = hyperSpaceEngine;
	}

	public String[] getShield() {
		return Shield;
	}

	public void setShield(String[] shield) {
		Shield = shield;
	}

	public double[] getShieldPower() {
		return ShieldPower;
	}

	public void setShieldPower(double[] shieldPower) {
		ShieldPower = shieldPower;
	}

	@Override
	public String toString() {
		return "XWing [HyperSpaceEngine=" + HyperSpaceEngine + ", Shield=" + Arrays.toString(Shield) + ", ShieldPower="
				+ Arrays.toString(ShieldPower) + "]";
	}


}
