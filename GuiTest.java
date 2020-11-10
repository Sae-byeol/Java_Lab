import java.awt.*;
import javax.swing.*;

public class GuiTest extends JFrame {
	public GuiTest() {
		//프레임 타이틀
		setTitle("GUI TEST");
		//프레임 종료버튼이 클릭될 때 프레임을 닫고 응용프로그램이 종료하도록 하기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JPanel 4개 생성
		JPanel p0=new JPanel();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		//컨텐트팬 알아내기
		Container c=getContentPane();
		//배치관리자를 BorderLayout으로 설정
		c.setLayout(new BorderLayout(10,10));
		//판넬에 빈 JLabel컴포넌트를 생성하고 컨텐트팬의 북쪽에 배치
		p0.add(new JLabel(""));
		c.add(p0,BorderLayout.NORTH);
		//판넬에 4개의 라벨 컴포넌트를 생성하고 컨텐트팬의 서쪽에 배치
		//GridLayout을 생성하여 컴포넌트들이 세로로 정렬되게 하기
		p1.setLayout(new GridLayout(0,1));
		p1.add(new JLabel("이름"));
		p1.add(new JLabel("학번"));
		p1.add(new JLabel("전공"));
		p1.add(new JLabel("연락처"));
		c.add(p1,BorderLayout.WEST);
		//판넬에 4개의 JTextField 컴포넌트를 생성하고 컨텐트팬의 중간에 배치
		//GridLayout을 생성하여 컴포넌트들이 세로로 정렬되게 하기
		GridLayout grid=new GridLayout(0,1);
		//두 행 사이의 수직간격을 5픽셀로 설정
		grid.setVgap(5);
		p2.setLayout(grid);
		p2.add(new JTextField(""));
		p2.add(new JTextField(""));
		p2.add(new JTextField(""));
		p2.add(new JTextField(""));
		c.add(p2,BorderLayout.CENTER);
		//판넬에 JButton 컴포넌트를 생성하고 컨텐트팬의 남쪽에 배치
		p3.add(new JButton("확인"));
		p3.add(new JButton("취소"));
		c.add(p3,BorderLayout.SOUTH);
		
		//프레임의 크기 설정
		setSize(300,200);
		//프레임을 화면에 출력
		setVisible(true);
	}
	public static void main(String[] args) {
		//생성자 호출
		new GuiTest();

	}

}
