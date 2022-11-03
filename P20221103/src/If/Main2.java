package If;

public class Main2 {

	public static void main(String[] args) {
		int score = 92;

		if (score >= 90) {
			System.out.print("A");
			if (score >= 95) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		} else {
			System.out.print("B");
			if (score >= 85) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		}
	}

}
