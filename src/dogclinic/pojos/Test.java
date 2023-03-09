package dogclinic.pojos;

public class Test {

	public static void main(String[] args) {
		/*Integer a = 5;
		Integer b = 5;
		String test = "Rodrigo";
		String test2 = "Katerina";
		System.out.println(test == test2); //false
		System.out.println(test.equals(test2)); //false -> for compare TWO OBJECTS
		test2 = test;
		System.out.println(test == test2); //true
		System.out.println(test.equals(test2)); //true*/
		
		//if we press: SHIFT+CTRL+C -> it's going to put comments
		//the same commands if we want to remove comments
		
		/*Dog toby = new Dog();
		Dog thor = new Dog();
		toby.setId(1);
		toby.setName("Toby");
		thor.setId(1);
		thor.setName("Thor");
		System.out.println(toby == thor); //false
		System.out.println(toby.equals(thor)); //true*/
		
		Dog bellota = new Dog(1, "Bellota", null, "Bichón Maltés");
		Owner belen = new Owner(1, "Belén", 666666666, "belen@email.com");
		bellota.setOwner(belen);
		belen.addDog(bellota);
		
		System.out.println("Welcome to the dog clinic" + "belen");
	}
}
