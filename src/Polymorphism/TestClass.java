package Polymorphism;

public class TestClass {
	public static void main(String[] args) {
		FirstClass firstClass = new FirstClass();
		System.out.println(firstClass.book(5));
		System.out.println(firstClass.book(7,5));
		System.out.println(firstClass.book(5,8,3));
		
		SecondClass secondClass = new SecondClass();
		System.out.println(secondClass.book(5,8,3));

		
	}

}
