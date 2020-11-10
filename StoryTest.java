import java.awt.*;
import javax.swing.*;
public class StoryTest extends JFrame{
	public StoryTest() {
		//프레임 타이틀
		setTitle("SM Story");
		//프레임 종료버튼이 클릭될 때 프레임을 닫고 응용프로그램이 종료하도록 하기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//컨텐트팬 알아내기
		Container c=getContentPane();
		//배치관리자 제거
		c.setLayout(null);
		//JLabel 컴포넌트 하나를 생성
		//컴포넌트의 절대위치와 절대 크기 생성
		JLabel l1=new JLabel("SM Story");
		l1.setLocation(10,10);
		l1.setSize(70,20);
		//생성한 컴포넌트를 컨텐트팬에 추가
		c.add(l1);
		
		//JLabel 컴포넌트 하나를 생성
		//컴포넌트의 절대위치와 절대 크기 생성
		JLabel l2=new JLabel("가을은");
		l2.setLocation(80,50);
		l2.setSize(50,20);
		//생성한 컴포넌트를 컨텐트팬에 추가
		c.add(l2);
		
		//JTextField 컴포넌트 하나를 생성
		//컴포넌트의 절대위치와 절대 크기 생성
		JTextField t=new JTextField("");
		t.setLocation(150,90);
		t.setSize(50,20);
		//생성한 컴포넌트를 컨텐트팬에 추가
		c.add(t);

		//JLabel 컴포넌트 하나를 생성
		//컴포넌트의 절대위치와 절대 크기 생성
		JLabel l3=new JLabel("이다");
		l3.setLocation(230,130);
		l3.setSize(50,20);
		//생성한 컴포넌트를 컨텐트팬에 추가
		c.add(l3);

		//프레임의 크기 설정
		setSize(300,200);
		//프레임을 화면에 출력
		setVisible(true);
	}
	public static void main(String[] args) {
		//생성자 호출asd
		new StoryTest();
	}

}
