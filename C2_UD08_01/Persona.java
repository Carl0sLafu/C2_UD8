package C2_UD08_01;

public class Persona {
	
	private String name;
	private int age;
	private String dni;
	private char sex;
	private double weigth;
	private double height;
	
	public Persona() {
		
		this(null, 0, ' ');
		
	}
	
	public Persona(String name, int age, char sex) {
		
		this.name = name;
		setAge(age);
		setDni("");
		setSex(sex);
		setWeigth(0);
		setHeight(0);
		
	}

	public Persona(String name, int age, String dni, char sex, double weigth, double height) {

		//Aqui compruevo un poco y dejo mis valores por defecto
		this.name = name;
		setAge(age);
		setDni(dni);
		setSex(sex);
		setWeigth(weigth);
		setHeight(height);
		
	}

	public void setAge(int age) {
		
		if (age >= 0 && age <= 100) {
		
			this.age = age;
		
		} else {
			
			this.age = 0;
			
		}
		
	}

	// No voy a comprovarlo del todo que el dni este bien puesto
	public void setDni(String dni) {
		
		if (!dni.isEmpty()) {
			
			if (dni.length() == 9) {
				
				this.dni = dni;
			
			}
			
		}
		
	}

	public void setWeigth(double weigth) {
		
		if (weigth >= 3 && weigth <= 300) {
			
			this.weigth = weigth;
		
		} else {
			
			this.weigth = 60;
			
		}
		
	}

	public void setHeight(double height) {
		
		if (height >= 0.2 && height <= 3) {
			
			this.height = height;
		
		} else {
			
			this.height = 1;
			
		}
		
	}

	private void setSex(char sex) {
	
		if (sex == 'H' || sex == 'D') {
			
			this.sex = sex;
			
		} else {
		
			this.sex = 'H';
		
		}
		
	}

	//Lo he dejado tal cual se ha construido
	@Override
	public String toString() {
		return "Persona [name=" + name + ", age=" + age + ", dni=" + dni + ", sex=" + sex + ", weigth=" + weigth
				+ "kg, height=" + height + "m]";
	}
	
	

}
