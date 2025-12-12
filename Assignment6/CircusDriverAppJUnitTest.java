import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CircusDriverAppJUnitTest {
    private Circus circus;

    @BeforeEach
    void setUp() {
        circus = new Circus();
    }

    @Test
    void testAddDog() {
        Dog dog = new Dog("Shila", 3, "Golden Retriever", "Brown");
        circus.addAnimal(dog);
        List<Animal> animals = circus.getAnimals();
        assertEquals(1, animals.size());
        assertTrue(animals.get(0) instanceof Dog);
        assertEquals("Shila", animals.get(0).getName());
    }

    @Test
    void testAddBird() {
    	Bird bird = new Bird("Fluffy", 2, "Pigeon", "Black");
    	circus.addAnimal(bird);
        List<Animal> animals = circus.getAnimals();
        assertEquals(1, animals.size());
        assertTrue(animals.get(0) instanceof Bird);
        assertEquals("Fluffy", animals.get(0).getName());
    }

    @Test//DO STUFF
    void testDisplayAnimals() {
    	circus.addAnimal(new Dog("Joey", 3, "Golden Retriever", "Golden"));
    	circus.addAnimal(new Bird("Fluffy", 2, "Pigeon", "Black"));
    	
    	circus.displayAllAnimals();
    	
    }

    @Test
    void testSortAnimalsByAge() {
    	Dog dog = new Dog("Joey", 10, "Golden Retriever", "Golden");
    	Bird bird = new Bird("Fluffy", 2, "Pigeon", "Black");
    	circus.addAnimal(dog);
    	circus.addAnimal(bird);
    	
    	circus.sortAnimalsByAge();
    	List<Animal> animals = circus.getAnimals();
    	assertEquals(2, animals.get(0).getAge());
    	assertEquals(10, animals.get(1).getAge());
    }

    @Test
    void testSortAnimalsByName() {
    	Dog dog = new Dog("Joey", 10, "Golden Retriever", "Golden");
    	Bird bird = new Bird("Fluffy", 2, "Pigeon", "Black");
    	circus.addAnimal(dog);
    	circus.addAnimal(bird);
    	
    	circus.sortAnimalsByName();
    	List<Animal> animals = circus.getAnimals();
    	assertEquals("Fluffy", animals.get(0).getName());
    	assertEquals("Joey", animals.get(1).getName());
    	
    }

    @Test
    void testSearchAnimalByName() {
    	Dog dog = new Dog("Joey", 10, "Golden Retriever", "Golden");
    	circus.addAnimal(dog);
    	
    	Animal found = circus.searchAnimalByName("Joey");
    	assertNotNull(found);
    	assertEquals(dog, found);
    	Animal notFound = circus.searchAnimalByName("Unknown");
    	assertNull(notFound);
    }

}



