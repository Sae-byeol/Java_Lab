import java.awt.*;
import javax.swing.*;
public class GridTest extends JFrame {
	public GridTest() {
		//프레임 타이틀
		setTitle("Grid TEST");
		//프레임 종료버튼이 클릭될 때 프레임을 닫고 응용프로그램이 종료하도록 하기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임 크기 설정
		setSize(300,200);
		//컨텐트팬 알아내기
		Container c=getContentPane();
		
		//패널 3개 생성
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		//패널에 JLabel 컴포넌트 생성한 후 컨텐트팬의 북쪽에 판넬을 배치
		p1.add(new JLabel("학생 정보 입력"));
		c.add(p1,BorderLayout.NORTH);
		//패널의 배치 관리자로 GridLayout 설정
		p2.setLayout(new GridLayout(5,4));
		//JLabel컴포넌트를 패널 위에 생성
		p2.add(new JLabel("이름"));
		p2.add(new JLabel("학번"));
		p2.add(new JLabel("학과"));
		p2.add(new JLabel("연락처"));
		//빈 JTextField 16개를 반복문을 사용하여 패널 위에 생성
		for (int i=0;i<16;i++) {
			p2.add(new JTextField(""));
		}
		//패널을 컨텐트팬의 중간에 배치
		c.add(p2,BorderLayout.CENTER);
		//패널에 JButton컴포넌트 두개를 생성한 후 컨텐트팬의 남쪽에 배치
		p3.add(new JButton("추가"));
		p3.add(new JButton("취소"));
		c.add(p3,BorderLayout.SOUTH);
		//프레임을 화면에 출력
		setVisible(true);
		
	}
	public static void main(String[] args) {
		//생성자 호출
		new GridTest();

	}

}
