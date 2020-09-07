package kr.smhrd;

public class MyUtill {
	// 1~10 까지의 총합을 구하는 동작
	public int hap() {
		int sum = 0;
		for (int i = 0; i <= 10 ; i++) {
			sum += i;
		}
		return sum;
	}
}
