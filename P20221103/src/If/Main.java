package If;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 :");
		int score = sc.nextInt();
		sc.close();
		
		if (score >= 90 ) {
			System.out.println("당신의 점수는 : A");
		} else if(score >= 80 ) {
			System.out.println("당신의 점수는 : B");
		} else if(score >= 70 ) {
			System.out.println("당신의 점수는 : C");
		} else if(score >= 60 ) {
			System.out.println("당신의 점수는 : D");
		} else {
			System.out.println("당신의 점수는 : F");
		}

	}

}
