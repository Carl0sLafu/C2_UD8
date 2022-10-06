package C2_UD08_02;

public class Password {
	
	private int length;
	private String password;
	
	public Password() {
		
		this(8);
		
	}
	
	public Password(int length) {

		this.length = length;
		setPassword();
		
	}

	private void setPassword() {
		
		//Inicializo porque si no sale null al empezar
		password = "";
		
		for (int i = 0; i < length; i++) {
			
			//Genero un numero
			int num = (int)Math.floor(Math.random() * (29));
			
			//Con esto digo que hay un 33% de que ponga numero, si no pone caracter
			if (num <= 9) {
				
				password += num; 
				
			} else {
					
				password += (char)Math.floor(Math.random() * (126 - 33) + 33);
			
			}
			
		}
		
	}

	@Override
	public String toString() {
		return "Password [length=" + length + ", password=" + password + "]";
	}
	
	

}
