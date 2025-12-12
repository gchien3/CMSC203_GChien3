import java.util.Objects;

public class Horse implements Animal {

	// instance variables
	private String name;
	private int age;
	private String species;
	private String color;

	// constructor
	public Horse(String name, int age, String species, String color) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.color = color;
	}

	@Override
	public void move() {
		System.out.println(name + " is galloping around!");
	}

	@Override
	public void makeSound() {
		System.out.println(name + " is neighing!");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Horse other = (Horse) obj;
		return age == other.age && name.equals(other.name)
				&& species.equals(other.species)
				&& color.equals(other.color);
	}

	@Override
	public String toString() {
		return "Horse [name=" + name + ", age=" + age + ", species="
				+ species + ", color=" + color + "]";
	}

}
