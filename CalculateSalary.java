package b;
import java.util.Scanner;
public class CalculateSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int basic = s.nextInt();
		String grade = s.next();
		char g = grade.charAt(0);
		double hra = 0.2*basic;
		double da = 0.5*basic;
		double pf = 0.11*basic;
		int allow = 0;
		if(g == 'A') {
			allow = 1700;
		}
		else if(g == 'B') {
			allow = 1500;
		}else {
			allow = 1300;
		}
double totalsalary = basic+hra+da+allow-pf;
int ans = (int)(totalsalary);
if(totalsalary-ans > 0.5) {
	System.out.println(ans+1);
}
else {
	System.out.println(ans);
}
	}

}
