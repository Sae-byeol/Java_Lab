import java.util.Scanner;
public class ScoreArray {

	public static void main(String[] args) {
		//��ĳ�� ��ü ����
		Scanner scanner=new Scanner(System.in);
		
		//���� �迭 ���� �� �ʱ�ȭ
		String course[]= {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		//���� �迭 ���� �� �ʱ�ȭ
		int score[]= {95,88,76,62,55};
		
		//����ڰ� "�׸�"�� �Է��ϱ� ������ �����ϸ� �ȵǹǷ� ���ѷ����� ������
		for (; ;) {
			//����ڷκ��� �Է��� �ޱ� ���� ��¹�
			System.out.print("���� �̸�>>");
			//�Է¹��� ���� ������ ����
			String name=scanner.next();
			
			//����ڰ� "�׸�"�� �Է��� ��� ���ѷ����� ������
			if (name.equals("�׸�"))
				break;

			//�ݺ����� ����ؼ� ����ڰ� �Է��� ������� �迭 �ȿ� �����ϴ��� Ȯ��
			for (int i=0;i<course.length;i++) {
				//�迭 �ȿ� ����ڰ� �Է��� ������� �����ϴ� ��� �ش� ������ ���� ���
				if (course[i].equals(name)) {
					System.out.println(name+"�� ������ "+score[i]);
					break;
				}
				//�迭 �ȿ� ����ڰ� �Է��� ������� �������� �ʴ� ��� ���� �������� ���
				if (i==course.length-1) {
					System.out.println("���� �����Դϴ�.");
				}
			}
			
		}
		//��ĳ�� ����
		scanner.close();
		
	}

}
