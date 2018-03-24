package AbstractConcept;

public class TestBand {

	public static void main(String[] args) {
		
		TheBeatles tb = new TheBeatles();
		
		tb.guitarist();
		tb.drummer();
		tb.vocalist();
		tb.leadGuitarist();
		
		Band b = new TheBeatles();
		b.vocalist();
		b.guitarist();
		b.drummer();
		

	}

}
