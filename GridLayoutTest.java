import java.awt.*;
import javax.swing.*;

public class GridLayoutTest extends JFrame{
	public GridLayoutTest() {
		//프레임의 타이틀 작성
		setTitle("Ten Color Buttons Frame");
		//프레임 종료버튼이 클릭될 때 프레임을 닫고 응용프로그램이 종료하도록 하기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//컨텐트 팬 알아내기
		Container c=getContentPane();
		//배치관리자를 GridLayout으로 설정
		c.setLayout(new GridLayout(1,10));
		//색상 배열 생성
		Color[] col= { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, 
				Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};
		//반복문을 돌면서 해당 색상의 버튼 생성
		for (int i=0;i<10;i++) {
			JButton b=new JButton(i+"");
			c.add(b);
			b.setBackground(col[i]);
		}
		//프레임의 크기 설정
		setSize(600,300);
		//프레임을 화면에 출력
		setVisible(true);
		
	}
	public static void main(String[] args) {
		//생성자 호출
		new GridLayoutTest();

	}

}
