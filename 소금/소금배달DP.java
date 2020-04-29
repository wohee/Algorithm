package algo;

import java.util.Scanner;

public class 소금배달DP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		
		int[] memo = new int[M+1];
		for (int i = 0; i < memo.length; i++) {
			if(i%3 == 0) {
				memo[i] = i/3;
				
			} else { // 배달 불가
				memo[i] = Integer.MAX_VALUE-1;
			}
		}
		
		for (int i = 5; i < memo.length; i++) { // 5kg 봉지 고려
			if(memo[i] > memo[i-5] + 1) {
				memo[i] = memo[i-5] + 1;
			} 
		}

		
		
		System.out.println(memo[M] == Integer.MAX_VALUE-1? -1:memo[M]);
	}

}
