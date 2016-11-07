import zoo.Lion;
import zoo.Tiger;
import zoo.Bear;
import zoo.Animal;
import zoo.Food;
import zoo.Nothing;

public class Main {
	public static void main(String...args) {
		//Animal animal = new Animal();
		//Cat cat = new Cat();
		//Dog dog = new Dog();
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		Bear bear = new Bear();
		
		//animal = cat;
		
		//dog = (Dog)animal;
		
		//System.out.println(animal);
		//System.out.println(dog);
		Animal[] zoo = {tiger, lion, bear};
		//bear.makeNoise();
		Nothing bear2 = new Bear();
		Bear bear3 = (Bear) bear2;
		bear3.makeNoise();
		
		for (int i = 0; i < zoo.length; i++) {
			zoo[i].makeNoise();
		}
		bear.eatFood(Food.MEAT);
		System.err.println(Animal.PSEUDO_CONST);
		
	}
	
	
}