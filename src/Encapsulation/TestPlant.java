package Encapsulation;

public class TestPlant {

	public static void main(String[] args) {
		Plant plant = new Plant();
		plant.setHealth(2);
		plant.setNames("Cactus");
		plant.setStems(7);
		System.out.println(plant.getNames() + " can live " +plant.getHealth()+" years in newyork with "+plant.getStems()+" different colors");

	}

}
