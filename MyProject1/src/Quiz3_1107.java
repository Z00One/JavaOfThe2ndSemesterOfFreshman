import java.util.Scanner;

// 1 ~ 20 단 중에 입력되는 값의 배수인 단만 출력하는 구구단 출력 프로그램

class Gugu{
	
	// 생성자
	Gugu(){
	}
	
	// 구구단 출력
	void printGugudan(int inputnum) {
		
		// 열
		// for (int row = 1; row <= 20 && row % inputnum == 0; row ++) { -> 조건문이 false가 나오는 순간 끝
		for (int row = 1; row <= 20; row ++) {
			// 행
			if (row % inputnum == 0) {
				for (int col = 1; col < 10; col ++) {
					System.out.print(row + " X " + col + " = " + (row * col) + "\t");
				}
				System.out.println();
			}
			// 단 바꾸기
			}
		}
	}

class inputInt {
	// 멤버 변수 선언
	int M;
	int N;
	String menuOfPrinting;
	
	// 멤버 변수에 값 담아주기
	inputInt(int valueA, int valueB){
		this.M = valueA;
		this.N = valueB;
		if (M < N) {
			menuOfPrinting = "first";
		}else if (M > N) {
			menuOfPrinting = "second";
		}else if (M == N) {
			menuOfPrinting = "third";
		}
	}
	
	// 담긴 변수들의 크기 차이에 따라 출력
	void print() {
		switch(menuOfPrinting) {
		case "first" :
			System.out.println("M : " + M + " ~ " + "N : " + N + "사이 정수 값은");
			for (int i = M; i <= N; i++) {
				System.out.print(i == N ? i + "\n" : i + ", ");
			}
			break;
		case "second" :
			System.out.println("M : " + M + " ~ " + "N : " + N + "사이 정수 값은");
			for (int i = N; i <= M; i++) {
				System.out.print(i == M ? i + "\n" : i + ", ");
			}
			break;
		case "third" :
			System.out.println("N, M 정수 값 : " + M);
			break;
			}
		System.out.println("----thank you----");
	}
	
}

public class Quiz3_1107 {

	public static void main(String[] args) {
		Gugu gugu = new Gugu();
		gugu.printGugudan(3);
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("M갑을 입력하세요");
		int M = scn.nextInt();
		System.out.println("M갑을 입력하세요");
		int N = scn.nextInt();
		
		inputInt iI = new inputInt(M, N);
		iI.print();
	}

}
