package C2_UD08_01;

public class PersonaApp {

	public static void main(String[] args) {
		
		Persona vacia = new Persona();
		
		System.out.println(vacia.toString());
		
		Persona threeParam = new Persona("Maria", 34, 'D');
		
		System.out.println(threeParam.toString());
		
		Persona complete = new Persona("Carlos", 20, "74285119D", 'H', 70, 1.80);
		
		System.out.println(complete.toString());
		
	}

}
