package b;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sumeven=0;
		int sumodd=0;
		while(n > 0) {
			int num = n%10;
			if(num%2 == 0) {
				sumeven = sumeven+num;
			}else {
				sumodd = sumodd+num;
			}
			n = n/10;
		}
		System.out.println(sumeven+" "+sumodd);
	}

}
