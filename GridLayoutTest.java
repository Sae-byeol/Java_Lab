import java.awt.*;
import javax.swing.*;

public class GridLayoutTest extends JFrame{
	public GridLayoutTest() {
		//�������� Ÿ��Ʋ �ۼ�
		setTitle("Ten Color Buttons Frame");
		//������ �����ư�� Ŭ���� �� �������� �ݰ� �������α׷��� �����ϵ��� �ϱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//����Ʈ �� �˾Ƴ���
		Container c=getContentPane();
		//��ġ�����ڸ� GridLayout���� ����
		c.setLayout(new GridLayout(1,10));
		//���� �迭 ����
		Color[] col= { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, 
				Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};
		//�ݺ����� ���鼭 �ش� ������ ��ư ����
		for (int i=0;i<10;i++) {
			JButton b=new JButton(i+"");
			c.add(b);
			b.setBackground(col[i]);
		}
		//�������� ũ�� ����
		setSize(600,300);
		//�������� ȭ�鿡 ���
		setVisible(true);
		
	}
	public static void main(String[] args) {
		//������ ȣ��
		new GridLayoutTest();

	}

}
