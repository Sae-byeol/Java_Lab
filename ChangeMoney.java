import java.util.Scanner;
public class ChangeMoney {

	public static void main(String[] args) {
		//ȯ���� ���� ������ ��Ÿ���� �迭 �����ϱ�
		int [] unit= {50000,10000,1000,500,100,50,10,1};
		//Scanner ��ü ����
		Scanner scanner=new Scanner(System.in);
		//"�ݾ��� �Է��Ͻÿ�>>" ���
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		//�Է¹��� �ݾ��� ������ ����
		int money=scanner.nextInt();
		
		//for �ݺ����� ����Ͽ� �迭�� �� ���ҷ� �Է¹��� �ݾ��� �����ֱ�
		for (int i=0;i<unit.length;i++) {
			//�������� ���� ��ȯ ������ ���� ����
			int n=money/unit[i];
			//�������� �������� �ٽ� �迭�� ���� ���ҷ� ������ ����
			money=money%unit[i];
			//��ȯ������ ������ 0���� ���� ������� ����
			if (n!=0) {
				System.out.println(unit[i]+"�� ¥��: "+ n+'��');
			}
		}
		//��ĳ�� ����
		scanner.close();
	}

}
