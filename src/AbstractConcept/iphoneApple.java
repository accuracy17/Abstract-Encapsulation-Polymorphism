package AbstractConcept;

public class iphoneApple implements CellPhone {

	@Override
	public void on() {
		System.out.println("Iphone Apple-- On ");
		
	}

	@Override
	public void off() {
		System.out.println("Iphone Apple-- Off ");
		
	}

	@Override
	public void recharge() {
		System.out.println("Iphone Apple-- Recharge ");
		
	}
	
	public void privacy() {
		System.out.println("iphone-- Privacy matters ");
	}
	
	

}
