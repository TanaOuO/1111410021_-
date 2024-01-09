package StarWar_1111410021;

public class Main {

	public static void main(String[] args) {
		TieFighter Tie01 = new TieFighter("Sienar Fleet Systems" ,"TwinIonEngineLineStarfighter" ,6.3 ,1200
		,"4100G","SFS P-s4",0 );
		XWing XWing01 = new XWing("Class 1 Koensayr R300-H",
		"Incom Corporation T65B X-Wing Space Superiority Fighter",12.5,1050,"100MGL","80MGLT" 
		,2  );
		
		System.out.println(Tie01.toString());
		System.out.println(XWing01.toString());
		
		

	}

}
