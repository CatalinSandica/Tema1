package Classes;

public class Animals {
	
	private String breed;
	private String name;
	private double height;
	private double weight;
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	public void animalSays(String breed, String name, Double height, Double weight) {
		System.out.println("The " + breed + " with the name: " + name + " has the height: " + height + " and the weight: "+ weight);
	}
	
	public Animals() {
		super();
	}
}
