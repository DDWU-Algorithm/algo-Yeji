import java.util.*;

public class BasicCodingTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[9];
		int sum = 0;
		
		
		for (int i = 0; i< num.length; i++) {
			num[i] = sc.nextInt();//9�������� Ű 
			sum += num[i]; //��� 9�������� Ű ���ϱ�
		}
		
		for (int i = 0; i<num.length-1;i++) {//�������� Ű�� ������� ���ư��鼭 ���ش�
			for (int j = i+1; j<num.length; j++) {
				if (sum-num[i]-num[j]==100) {//������ 100�� ������ num[i]�� num[j]�� 0���� �ٲپ��ش�.
					num[i] = 0;
					num[j] = 0;
					Arrays.sort(num);
					for (int k = 2; k<9; k++)
						System.out.println(num[k]);//�տ� 0 �ΰ��� �����ϰ� 3��° �迭���� ���
					return;
				}
			}
		}
		sc.close();
	}

}
