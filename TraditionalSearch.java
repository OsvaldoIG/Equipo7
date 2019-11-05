import java.util.ArrayList;

class Animal_ {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	public Animal_(String speciesName, boolean hopper, boolean swimmer){
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	public boolean canHop() {return canHop;}
	public boolean canSwim() {return canSwim;}
	public String toString() {return species;}
}

interface CheckTrait{
	boolean test(Animal_ a);
}

class CheckIfHopper implements CheckTrait {
	public boolean test(Animal_ a){
		return a.canHop();
	}
}

class CheckIfSwimmer implements CheckTrait {
	public boolean test(Animal_ a){
		return a.canSwim();
	}
}

public class TraditionalSearch{
	public static void main(String[] args) {
		ArrayList<Animal_>animals = new ArrayList<Animal_>();
		animals.add(new Animal_("fish", false, true));
		animals.add(new Animal_("kangaroo",true,false));
		animals.add(new Animal_("rabbit", true, false));
		animals.add(new Animal_("turtle", false, true));

		//print(animals, new CheckIfHopper()); //<- *****
		System.out.print("Can Hop: ");
		print(animals, a -> a.canHop());
		System.out.print("Can Swim: ");
		print(animals, a -> a.canSwim());
	}
	private static void print(ArrayList<Animal_> animals, CheckTrait checker){
		for (Animal_ animal : animals){
			if (checker.test(animal)) //the general check
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}
