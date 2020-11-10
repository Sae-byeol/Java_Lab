import java.awt.*;
import javax.swing.*;

public class JLabelRandomTest extends JFrame {
	public JLabelRandomTest() {
		//������ Ÿ��Ʋ
		setTitle("Random Labels");
		//������ �����ư�� Ŭ���� �� �������� �ݰ� �������α׷��� �����ϵ��� �ϱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ ũ�� ����
		setSize(300,300);
		//����Ʈ�� �˾Ƴ���
		Container c=getContentPane();
		//��ġ������ ����
		c.setLayout(null);
		//�ݺ����� ����ؼ� JLable������Ʈ 20�� ����
		for (int i=0;i<20;i++) {
			//������Ʈ�� ��ġ�� �����ϰ� ����
			int x=(int)(Math.random()*200)+50;
			int y=(int)(Math.random()*200)+50;
			//������Ʈ ���� �ε��� ���
			JLabel label=new JLabel(i+"");
			//������ ��ġ�� Ư�� ũ���� ������Ʈ ����
			label.setLocation(x,y);
			label.setSize(10,10);
			label.setOpaque(true);
			//������Ʈ�� ������ �Ķ������� ����
			label.setBackground(Color.BLUE);
			//����Ʈ�ҿ� ������Ʈ ��ġ�ϱ�
			c.add(label);
		}
		//�������� ȭ�鿡 ���
		setVisible(true);
	}
	public static void main(String[] args) {
		//������ ȣ��
		new JLabelRandomTest();

	}

}
