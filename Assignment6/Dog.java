import java.util.Objects;

public class Dog implements Animal, Cloneable {
	// Instance variables
	private String name;
	private int age;
	protected String species;
	protected String color;

	// Constructor
	public Dog(String name, int age, String species, String color) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.color = color;
	}

	@Override
	public void move() {
		System.out.println(name + " is running around!");
	}

	@Override
	public void makeSound() {
		System.out.println(name + " is barking!");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	// @Override
	// clone()

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Dog other = (Dog) obj;
		return age == other.age && name.equals(other.name)
				&& species.equals(other.species)
				&& color.equals(other.color);
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", species="
				+ species + ", color=" + color + "]";
	}

}
