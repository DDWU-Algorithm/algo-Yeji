import java.util.*;

public class BasicCodingTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int cnt1 = 1, cnt2 = 0;
		int length = 10;
		
		for (int i=1; i<=x; i++) {
			if (i==length) {
				cnt1++;
				length=length*10;
			}
			cnt2= cnt2+cnt1;
		}
		System.out.println(cnt2);
		
		sc.close();
	}

}
