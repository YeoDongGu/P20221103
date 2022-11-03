package For;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		long sum = 0;

		for (int i = 1; i <= inp; i++) {
			sum += i;
		}

		System.out.println("sum = " + sum);
	}

}
