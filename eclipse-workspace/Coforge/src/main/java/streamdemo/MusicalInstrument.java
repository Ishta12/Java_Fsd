package streamdemo;

public class MusicalInstrument {

	private String name;
	private String type;
	private double price;
	
	public MusicalInstrument(String name, String type, double price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "MusicalInstrument [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	
	
	
	
}
