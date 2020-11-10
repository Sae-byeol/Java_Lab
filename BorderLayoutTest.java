import java.awt.*;
import javax.swing.*;

public class BorderLayoutTest extends JFrame {
	public BorderLayoutTest() {
		//프레임의 타이틀 작성
		setTitle("BorderLayout Practice");
		//프레임 종료버튼이 클릭될 때 프레임을 닫고 응용프로그램이 종료하도록 하기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임의 크기 설정
		setSize(400,200);
		//컨텐트팬 알아내기
		Container c=getContentPane();
		//컨텐트팬의 배치관리자를 BorderLayout으로 설정
		c.setLayout(new BorderLayout(5,7));
		//컨텐트 팬에 컴포넌트 배치하기
		c.add(new JButton("North"),BorderLayout.NORTH);
		c.add(new JButton("West"),BorderLayout.WEST);
		c.add(new JButton("Center"),BorderLayout.CENTER);
		c.add(new JButton("East"),BorderLayout.EAST);
		c.add(new JButton("South"),BorderLayout.SOUTH);
		
		//프레임을 화면에 출력
		setVisible(true);
	}
	public static void main(String[] args) {
		//생성자 실행하기
		new BorderLayoutTest();

	}

}
