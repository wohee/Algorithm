package algo;

/**
 * Greedy
 */

import java.util.Scanner;

public class 소금배달1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		
//		int cnt = M/5 + M%5 / 3; 가설이 틀림
		int cnt = 0;
		
		while(M % 5 != 0) { // 5로 나누어 떨어지지 않는다면
			M -= 3;
			cnt++;
		}
		
		if(M < 0) { // 음수 
			System.out.println(-1);
			
		} else {
			cnt += M/5;
			System.out.println(cnt);
		}
		
		// Greedy
		// 3kg 5kg 7kg 11kg
		

	} // end of main
} // end of class
