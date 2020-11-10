import java.awt.*;
import javax.swing.*;

public class GuiTest extends JFrame {
	public GuiTest() {
		//������ Ÿ��Ʋ
		setTitle("GUI TEST");
		//������ �����ư�� Ŭ���� �� �������� �ݰ� �������α׷��� �����ϵ��� �ϱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JPanel 4�� ����
		JPanel p0=new JPanel();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		//����Ʈ�� �˾Ƴ���
		Container c=getContentPane();
		//��ġ�����ڸ� BorderLayout���� ����
		c.setLayout(new BorderLayout(10,10));
		//�ǳڿ� �� JLabel������Ʈ�� �����ϰ� ����Ʈ���� ���ʿ� ��ġ
		p0.add(new JLabel(""));
		c.add(p0,BorderLayout.NORTH);
		//�ǳڿ� 4���� �� ������Ʈ�� �����ϰ� ����Ʈ���� ���ʿ� ��ġ
		//GridLayout�� �����Ͽ� ������Ʈ���� ���η� ���ĵǰ� �ϱ�
		p1.setLayout(new GridLayout(0,1));
		p1.add(new JLabel("�̸�"));
		p1.add(new JLabel("�й�"));
		p1.add(new JLabel("����"));
		p1.add(new JLabel("����ó"));
		c.add(p1,BorderLayout.WEST);
		//�ǳڿ� 4���� JTextField ������Ʈ�� �����ϰ� ����Ʈ���� �߰��� ��ġ
		//GridLayout�� �����Ͽ� ������Ʈ���� ���η� ���ĵǰ� �ϱ�
		GridLayout grid=new GridLayout(0,1);
		//�� �� ������ ���������� 5�ȼ��� ����
		grid.setVgap(5);
		p2.setLayout(grid);
		p2.add(new JTextField(""));
		p2.add(new JTextField(""));
		p2.add(new JTextField(""));
		p2.add(new JTextField(""));
		c.add(p2,BorderLayout.CENTER);
		//�ǳڿ� JButton ������Ʈ�� �����ϰ� ����Ʈ���� ���ʿ� ��ġ
		p3.add(new JButton("Ȯ��"));
		p3.add(new JButton("���"));
		c.add(p3,BorderLayout.SOUTH);
		
		//�������� ũ�� ����
		setSize(300,200);
		//�������� ȭ�鿡 ���
		setVisible(true);
	}
	public static void main(String[] args) {
		//������ ȣ��
		new GuiTest();

	}

}
