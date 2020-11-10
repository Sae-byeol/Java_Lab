import java.awt.*;
import javax.swing.*;

public class JLabelRandomTest extends JFrame {
	public JLabelRandomTest() {
		//프레임 타이틀
		setTitle("Random Labels");
		//프레임 종료버튼이 클릭될 때 프레임을 닫고 응용프로그램이 종료하도록 하기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임 크기 설정
		setSize(300,300);
		//컨텐트팬 알아내기
		Container c=getContentPane();
		//배치관리자 제거
		c.setLayout(null);
		//반복문을 사용해서 JLable컴포넌트 20개 생성
		for (int i=0;i<20;i++) {
			//컴포넌트의 위치를 랜덤하게 설정
			int x=(int)(Math.random()*200)+50;
			int y=(int)(Math.random()*200)+50;
			//컴포넌트 위에 인덱스 출력
			JLabel label=new JLabel(i+"");
			//랜덤한 위치와 특정 크기의 컴포넌트 생성
			label.setLocation(x,y);
			label.setSize(10,10);
			label.setOpaque(true);
			//컴포넌트의 배경색을 파란색으로 설정
			label.setBackground(Color.BLUE);
			//컨텐트팬에 컴포넌트 배치하기
			c.add(label);
		}
		//프레임을 화면에 출력
		setVisible(true);
	}
	public static void main(String[] args) {
		//생성자 호출
		new JLabelRandomTest();

	}

}
