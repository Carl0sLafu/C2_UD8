package C2_UD08_03;

public class ElectrodomesticoApp {

	public static void main(String[] args) {
		
		Electrodomestico defecto = new Electrodomestico();
		
		Electrodomestico twoParam = new Electrodomestico(500, 10);
		
		Electrodomestico complete = new Electrodomestico(340, "GrIs", 'd', 12);
		
		System.out.println(defecto.toString());
	
		System.out.println(twoParam.toString());
		
		System.out.println(complete.toString());
		
		
	}

}
