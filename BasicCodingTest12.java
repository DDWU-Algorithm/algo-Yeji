import java.util.*;

public class BasicCodingTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] dp = new int[11];
		dp[1] = 1;
		dp[2]= 2;
		dp[3] = 4;
		
		for (int i=4; i<11; i++)
			dp[i] = dp[i-3]+dp[i-2]+dp[i-1];
		
		for (int k=0; k<n; k++) {
			int x = sc.nextInt();
			System.out.println(dp[x]);
		}
		
		sc.close();
	}

}
