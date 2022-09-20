import java.util.*;

public class BasicCodingTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
 
		int d = gcd(a, b);	// �ִ�����
 
		System.out.println(d);
		System.out.println(a * b / d);
 
	}
 
	// �ִ����� �ݺ��� ���
	public static int gcd(int a, int b) {
 
		while (b != 0) {
			int r = a % b; // �������� �����ش�.
 
			// GCD(a, b) = GCD(b, r)�̹Ƿ� ��ȯ�Ѵ�.
			a = b;
			b = r;
		}
		return a;
	}

}
