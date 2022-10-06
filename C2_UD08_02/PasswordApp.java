package C2_UD08_02;

public class PasswordApp {

	public static void main(String[] args) {
		
		Password defecto = new Password();
		
		System.out.println(defecto.toString());
		
		Password length10 = new Password(10);
		
		System.out.println(length10.toString());

	}

}
