package b;
import java.util.*;
public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int sf = s.nextInt();
		int ef = s.nextInt();
		int gap = s.nextInt();
		System.out.println("fv"+" "+"cv");
		for(int i = sf;i<=ef;i=i+gap) {
			int cv = (i-32)*5/9;
			System.out.println(i+" "+cv);
		}

	}

}
