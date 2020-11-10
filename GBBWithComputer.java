import java.util.Scanner;
public class GBBWithComputer {

	public static void main(String[] args) {
		//스캐너 객체 생성
		Scanner scanner=new Scanner(System.in);
		//문자열 배열 생성 및 초기화
		String str[]= {"가위","바위","보"};
		//게임 시작을 알리는 출력문
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		//사용자가 "그만"을 입력하기 전까지 종료되면 안되므로 무한루프를 만든다
		for (; ;) {
			//사용자에게 입력을 받기 위한 출력문
			System.out.print("가위 바위 보!>>");
			String user=scanner.nextLine();
			
			//컴퓨터가 내는 것을 랜덤하게 선택하기
			int n=(int)(Math.random()*3);
			
			//사용자가 "그만"을 입력했을 경우 무한루프 종료
			if (user.contentEquals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			//사용자가 "그만"을 입력하지 않은 경우 게임 진행
			else {
				
				//컴퓨터가 내는 것에 따라 모든 승패의 경우 설정 및 결과 출력
				
				//컴퓨터가 바위를 낸 경우에 생길 수 있는 모든 경우의 수
				if (str[n].contentEquals("바위")) {
					if (user.equals("가위")) {
						System.out.println("사용자 = 가위, 컴퓨터 = 바위, 컴퓨터가 이겼습니다.");
					}
					if (user.equals("바위")) {
						System.out.println("사용자 = 바위, 컴퓨터 = 바위, 비겼습니다.");
					}
						
					if (user.equals("보")) {
						System.out.println("사용자 = 보, 컴퓨터 = 바위, 사용자가 이겼습니다.");
					}
						
				}
				//컴퓨터가 가위를 낸 경우에 생길 수 있는 모든 경우의 수
				if (str[n].contentEquals("가위")) {
					if (user.equals("보"))
						System.out.println("사용자 = 보, 컴퓨터 = 가위, 컴퓨터가 이겼습니다.");
					if (user.equals("가위"))
						System.out.println("사용자 = 가위, 컴퓨터 = 가위, 비겼습니다.");
					if (user.equals("바위"))
						System.out.println("사용자 = 바위, 컴퓨터 = 가위, 사용자가 이겼습니다.");
				}
				//컴퓨터가 보를 낸 경우에 생길 수 있는 모든 경우의 수
				if (str[n].contentEquals("보")) {
					if (user.equals("바위"))
						System.out.println("사용자 = 바위, 컴퓨터 = 보, 컴퓨터가 이겼습니다.");
					if (user.equals("보"))
						System.out.println("사용자 = 보, 컴퓨터 = 보, 비겼습니다.");
					if (user.equals("가위"))
						System.out.println("사용자 = 가위, 컴퓨터 = 보, 사용자가 이겼습니다.");
				}
			}
			
		}
		//스캐너 종료
		scanner.close();
	}

}
