package J12_상속.동물;


public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		Human human = new Human();
		Tiger tiger = new Tiger();
		
		animal.move();
		human.move();
		tiger.move();
		
		
		human.readBooks();
		tiger.hunting();

	}

}
