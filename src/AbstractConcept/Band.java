package AbstractConcept;

public abstract class Band {
	
	int songs = 400;
	final int compositions = 68;
	static int vocalistCompositions = 9;
	
	public abstract void vocalist();
	
	public void guitarist() {
		System.out.println("Band-- Guitarist");
		
	}
	
	public void drummer() {
		System.out.println("Band-- Drummer");
		
	}
	
	
	

}
		
