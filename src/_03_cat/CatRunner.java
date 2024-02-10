package _03_cat;

public class CatRunner {
	public static void main(String[] args) {
		Cat meowscles = new Cat("meowscles");
		meowscles.meow();
		meowscles.printName();
		for (int i = 9; i > 0; i--) {
			meowscles.kill();
		}
	}
}
