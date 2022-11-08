import java.util.Scanner;

public class BasicCodingTest17 {
	static int N, S, count=0;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();
        S= sc.nextInt();
        arr = new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i] =  sc.nextInt();
        }
 
        dfs(0,0);
 
        if(S==0){// count ���� 0�� ��� �����յ� ���ԵǹǷ� �� ���� �ϳ� ���ְ� ���
            count--;
            System.out.println(count);
        }else {
            System.out.println(count);
        }
 
 
    }
 
    private static void dfs(int v , int su){
        if(v==N){// dfs�� ���� ������Ű�ٰ� ��ġ�� ��Ÿ���� v�� ������ ��ġ�� ���� ���ϴ� ������ �ƴ��� üũ�Ͽ� count
            if(su == S){
                count++;
            }
            return;
        }
        // �κм���, ���� ��ġ�� ���Ҹ� �����ϰ�, �������� �ʰų�
        dfs(v+1, su+arr[v]); // ���� ��ġ�� ���Ҹ� ����
        dfs(v+1, su); // �������� ����.
    }
}