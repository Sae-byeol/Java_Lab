import java.util.Scanner;
public class GBBWithComputer {

	public static void main(String[] args) {
		//��ĳ�� ��ü ����
		Scanner scanner=new Scanner(System.in);
		//���ڿ� �迭 ���� �� �ʱ�ȭ
		String str[]= {"����","����","��"};
		//���� ������ �˸��� ��¹�
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		//����ڰ� "�׸�"�� �Է��ϱ� ������ ����Ǹ� �ȵǹǷ� ���ѷ����� �����
		for (; ;) {
			//����ڿ��� �Է��� �ޱ� ���� ��¹�
			System.out.print("���� ���� ��!>>");
			String user=scanner.nextLine();
			
			//��ǻ�Ͱ� ���� ���� �����ϰ� �����ϱ�
			int n=(int)(Math.random()*3);
			
			//����ڰ� "�׸�"�� �Է����� ��� ���ѷ��� ����
			if (user.contentEquals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			//����ڰ� "�׸�"�� �Է����� ���� ��� ���� ����
			else {
				
				//��ǻ�Ͱ� ���� �Ϳ� ���� ��� ������ ��� ���� �� ��� ���
				
				//��ǻ�Ͱ� ������ �� ��쿡 ���� �� �ִ� ��� ����� ��
				if (str[n].contentEquals("����")) {
					if (user.equals("����")) {
						System.out.println("����� = ����, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
					}
					if (user.equals("����")) {
						System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
					}
						
					if (user.equals("��")) {
						System.out.println("����� = ��, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
					}
						
				}
				//��ǻ�Ͱ� ������ �� ��쿡 ���� �� �ִ� ��� ����� ��
				if (str[n].contentEquals("����")) {
					if (user.equals("��"))
						System.out.println("����� = ��, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
					if (user.equals("����"))
						System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
					if (user.equals("����"))
						System.out.println("����� = ����, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
				}
				//��ǻ�Ͱ� ���� �� ��쿡 ���� �� �ִ� ��� ����� ��
				if (str[n].contentEquals("��")) {
					if (user.equals("����"))
						System.out.println("����� = ����, ��ǻ�� = ��, ��ǻ�Ͱ� �̰���ϴ�.");
					if (user.equals("��"))
						System.out.println("����� = ��, ��ǻ�� = ��, �����ϴ�.");
					if (user.equals("����"))
						System.out.println("����� = ����, ��ǻ�� = ��, ����ڰ� �̰���ϴ�.");
				}
			}
			
		}
		//��ĳ�� ����
		scanner.close();
	}

}
