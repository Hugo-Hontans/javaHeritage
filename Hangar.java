public class Hangar{
	public static void main(String[] args) {
		Car Clio = new Car("Clio", 67897);
		Boat Titanic = new Boat("Titanic", 456783);

		System.out.println(Clio.doStuff());
		System.out.println(Titanic.doStuff());
	}
}