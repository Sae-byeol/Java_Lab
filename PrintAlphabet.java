import java.util.Scanner;

public class PrintAlphabet {

	public static void main(String[] args) {
		//Scanner ��ü ����
		Scanner scanner=new Scanner(System.in);
		//"�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>" ���
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		//�Է¹��� ���ڿ� �б�
		String s=scanner.next();
		//���ڿ��� ù���� ���� �б�
		char c=s.charAt(0);
		//��ø�ݺ����� ����Ͽ� ���� 'a'���� �Է¹��� ���ڱ��� ����ϱ�
		
		for (int i=0;i<=c;i++) {
			for (char j='a';j<=c-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		//��ĳ�� ����
		scanner.close();
	}

}
