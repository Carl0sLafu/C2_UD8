package C2_UD08_04;

public class SerieApp {

	public static void main(String[] args) {
		
		Serie defecto = new Serie();
		
		Serie twoParam = new Serie("The walking dead", "Pepito");
		
		Serie complete = new Serie("La casa de papel", 8, true, "Suspense", "Juan");

		System.out.println(defecto.toString());
		System.out.println(twoParam.toString());
		System.out.println(complete.toString());
		
	}

}
