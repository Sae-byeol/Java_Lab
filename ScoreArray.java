import java.util.Scanner;
public class ScoreArray {

	public static void main(String[] args) {
		//스캐너 객체 생성
		Scanner scanner=new Scanner(System.in);
		
		//과목 배열 생성 및 초기화
		String course[]= {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		//점수 배열 생성 및 초기화
		int score[]= {95,88,76,62,55};
		
		//사용자가 "그만"을 입력하기 전까지 종료하면 안되므로 무한루프를 돌리기
		for (; ;) {
			//사용자로부터 입력을 받기 위한 출력문
			System.out.print("과목 이름>>");
			//입력받은 값을 변수에 저장
			String name=scanner.next();
			
			//사용자가 "그만"을 입력한 경우 무한루프를 끝내기
			if (name.equals("그만"))
				break;

			//반복문을 사용해서 사용자가 입력한 과목명이 배열 안에 존재하는지 확인
			for (int i=0;i<course.length;i++) {
				//배열 안에 사용자가 입력한 과목명이 존재하는 경우 해당 과목의 점수 출력
				if (course[i].equals(name)) {
					System.out.println(name+"의 점수는 "+score[i]);
					break;
				}
				//배열 안에 사용자가 입력한 과목명이 존재하지 않는 경우 없는 과목임을 출력
				if (i==course.length-1) {
					System.out.println("없는 과목입니다.");
				}
			}
			
		}
		//스캐너 종료
		scanner.close();
		
	}

}
