package Ex;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = null;
		int i = 0;
		
		String[] ex = {"탁구", "야구", "축구", "농구", "씨름"};
		int[] num = {2, 9, 11, 6, 2};
		
		for(i = 0; i < ex.length; i++) {
			System.out.println("종목 이름을 입력 하세요");
			name = sc.next();
		}
		
	}

}
