import java.util.*;

public class BasicCodingTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[9];
		int sum = 0;
		
		
		for (int i = 0; i< num.length; i++) {
			num[i] = sc.nextInt();//9난쟁이의 키 
			sum += num[i]; //모든 9난쟁이의 키 더하기
		}
		
		for (int i = 0; i<num.length-1;i++) {//난쟁이의 키를 순서대로 돌아가면서 빼준다
			for (int j = i+1; j<num.length; j++) {
				if (sum-num[i]-num[j]==100) {//빼준후 100이 나오면 num[i]와 num[j]를 0으로 바꾸어준다.
					num[i] = 0;
					num[j] = 0;
					Arrays.sort(num);
					for (int k = 2; k<9; k++)
						System.out.println(num[k]);//앞에 0 두개를 제외하고 3번째 배열부터 출력
					return;
				}
			}
		}
		sc.close();
	}

}
