import java.awt.*;
import javax.swing.*;
public class StoryTest extends JFrame{
	public StoryTest() {
		//������ Ÿ��Ʋ
		setTitle("SM Story");
		//������ �����ư�� Ŭ���� �� �������� �ݰ� �������α׷��� �����ϵ��� �ϱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//����Ʈ�� �˾Ƴ���
		Container c=getContentPane();
		//��ġ������ ����
		c.setLayout(null);
		//JLabel ������Ʈ �ϳ��� ����
		//������Ʈ�� ������ġ�� ���� ũ�� ����
		JLabel l1=new JLabel("SM Story");
		l1.setLocation(10,10);
		l1.setSize(70,20);
		//������ ������Ʈ�� ����Ʈ�ҿ� �߰�
		c.add(l1);
		
		//JLabel ������Ʈ �ϳ��� ����
		//������Ʈ�� ������ġ�� ���� ũ�� ����
		JLabel l2=new JLabel("������");
		l2.setLocation(80,50);
		l2.setSize(50,20);
		//������ ������Ʈ�� ����Ʈ�ҿ� �߰�
		c.add(l2);
		
		//JTextField ������Ʈ �ϳ��� ����
		//������Ʈ�� ������ġ�� ���� ũ�� ����
		JTextField t=new JTextField("");
		t.setLocation(150,90);
		t.setSize(50,20);
		//������ ������Ʈ�� ����Ʈ�ҿ� �߰�
		c.add(t);

		//JLabel ������Ʈ �ϳ��� ����
		//������Ʈ�� ������ġ�� ���� ũ�� ����
		JLabel l3=new JLabel("�̴�");
		l3.setLocation(230,130);
		l3.setSize(50,20);
		//������ ������Ʈ�� ����Ʈ�ҿ� �߰�
		c.add(l3);

		//�������� ũ�� ����
		setSize(300,200);
		//�������� ȭ�鿡 ���
		setVisible(true);
	}
	public static void main(String[] args) {
		//������ ȣ��asd
		new StoryTest();
	}

}
