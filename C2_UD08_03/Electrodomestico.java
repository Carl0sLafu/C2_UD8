package C2_UD08_03;

public class Electrodomestico {
	
	private double price;
	private String color;
	private char electricConsum;
	private double weigth;
	
	public Electrodomestico() {
		
		setPrice();
		setColor();
		setElectricConsum();
		setWeigth();
		
	}
	
	public Electrodomestico(double price, double weigth) {
		
		this.price = price;
		setColor();
		setElectricConsum();
		this.weigth = weigth;
		
	}
	
	public Electrodomestico(double price, String color, char electricConsum, double weigth) {
		
		this.price = price;
		setColor(color);
		this.electricConsum = electricConsum;
		this.weigth = weigth;
		
	}

	public void setPrice() {
		
		this.price = 100;
		
	}

	public void setColor() {
		
		this.color = "blanco";
		
	}
	
	public void setColor(String color) {
		
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo")
				|| color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
		
			this.color = color.toLowerCase();
		
		} else {
			
			setColor();
			
		}
		
	}

	public void setElectricConsum() {
		
		this.electricConsum = 'F';
		
	}
	
	public void setElectricConsum(char electricConsum) {
		
		if (((int)electricConsum >= 65 && (int)electricConsum <= 70)
				|| ((int)electricConsum >= 97 && (int)electricConsum <= 102)) {
			
			this.electricConsum = electricConsum;
			
		} else {
			
			setElectricConsum();
			
		}
		
	}

	public void setWeigth() {
		
		this.weigth = 5;
		
	}

	@Override
	public String toString() {
		return "Electrodomestico [price=" + price + "€, color=" + color + ", electricConsum=" + electricConsum
				+ ", weigth=" + weigth + "kg]";
	}

}
