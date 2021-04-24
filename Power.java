package b;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int sol=1;
        for(int i= 1;i<=n;i++) {
        	sol*=x;
        }
        System.out.println("The power is"+" "+sol);
	}

}
