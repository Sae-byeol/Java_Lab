import java.awt.*;
import javax.swing.*;

public class BorderLayoutTest extends JFrame {
	public BorderLayoutTest() {
		//�������� Ÿ��Ʋ �ۼ�
		setTitle("BorderLayout Practice");
		//������ �����ư�� Ŭ���� �� �������� �ݰ� �������α׷��� �����ϵ��� �ϱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�������� ũ�� ����
		setSize(400,200);
		//����Ʈ�� �˾Ƴ���
		Container c=getContentPane();
		//����Ʈ���� ��ġ�����ڸ� BorderLayout���� ����
		c.setLayout(new BorderLayout(5,7));
		//����Ʈ �ҿ� ������Ʈ ��ġ�ϱ�
		c.add(new JButton("North"),BorderLayout.NORTH);
		c.add(new JButton("West"),BorderLayout.WEST);
		c.add(new JButton("Center"),BorderLayout.CENTER);
		c.add(new JButton("East"),BorderLayout.EAST);
		c.add(new JButton("South"),BorderLayout.SOUTH);
		
		//�������� ȭ�鿡 ���
		setVisible(true);
	}
	public static void main(String[] args) {
		//������ �����ϱ�
		new BorderLayoutTest();

	}

}
