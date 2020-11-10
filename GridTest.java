import java.awt.*;
import javax.swing.*;
public class GridTest extends JFrame {
	public GridTest() {
		//������ Ÿ��Ʋ
		setTitle("Grid TEST");
		//������ �����ư�� Ŭ���� �� �������� �ݰ� �������α׷��� �����ϵ��� �ϱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ ũ�� ����
		setSize(300,200);
		//����Ʈ�� �˾Ƴ���
		Container c=getContentPane();
		
		//�г� 3�� ����
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		//�гο� JLabel ������Ʈ ������ �� ����Ʈ���� ���ʿ� �ǳ��� ��ġ
		p1.add(new JLabel("�л� ���� �Է�"));
		c.add(p1,BorderLayout.NORTH);
		//�г��� ��ġ �����ڷ� GridLayout ����
		p2.setLayout(new GridLayout(5,4));
		//JLabel������Ʈ�� �г� ���� ����
		p2.add(new JLabel("�̸�"));
		p2.add(new JLabel("�й�"));
		p2.add(new JLabel("�а�"));
		p2.add(new JLabel("����ó"));
		//�� JTextField 16���� �ݺ����� ����Ͽ� �г� ���� ����
		for (int i=0;i<16;i++) {
			p2.add(new JTextField(""));
		}
		//�г��� ����Ʈ���� �߰��� ��ġ
		c.add(p2,BorderLayout.CENTER);
		//�гο� JButton������Ʈ �ΰ��� ������ �� ����Ʈ���� ���ʿ� ��ġ
		p3.add(new JButton("�߰�"));
		p3.add(new JButton("���"));
		c.add(p3,BorderLayout.SOUTH);
		//�������� ȭ�鿡 ���
		setVisible(true);
		
	}
	public static void main(String[] args) {
		//������ ȣ��
		new GridTest();

	}

}
