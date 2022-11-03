package Quiz;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		sc.close();

		switch (score / 10) {
		case 9, 10:
			System.out.println("당신의 점수는 : A");
			break;
		case 8:
			System.out.println("당신의 점수는 : B");
			break;
		case 7:
			System.out.println("당신의 점수는 : C");
			break;
		case 6:
			System.out.println("당신의 점수는 : D");
			break;
		default:
			System.out.println("당신의 점수는 : F");
			break;
		}

	}

}
