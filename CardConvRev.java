import java.util.Scanner;

public class CardConvRev {
	//n�� c������ ��ȯ�ϴ� �Լ�
	//��ȯ�� ���� �־�� �迭�� ũ�⸦ ��ȯ
	private static int cardConvRev(int x, int r, char[]d) {
		int digits=0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			d[digits++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		
		return digits;
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n;
		int c;
		char []cno=new char[32];
		int d;
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		//���� �ƴ� ���� �Է¹ޱ�
		do {
			System.out.print("��ȯ�ϴ� ���� �ƴ� ����");
			n=scanner.nextInt();
		}while(n<0);//�����̸� �ٽ� �Է¹ޱ�
		
		do {
			System.out.print("� ������ ��ȯ�ұ��?(2~36)");
			c=scanner.nextInt();
		}while(c<2||c>36);
		
		//n�� c������ ��ȯ�ϱ�
		d=cardConvRev(n,c,cno);
		
		System.out.print(c+" �����δ� ");
		//������ ��Ÿ���� ���ڸ����� ��Ÿ���� ����
		for (int i=d-1;i>=0;i--) {
			System.out.print(cno[i]);
		}
		System.out.println("�Դϴ�.");
		
	}

}
