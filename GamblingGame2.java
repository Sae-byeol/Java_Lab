package Game2;
import java.util.Scanner;
//두 사용자에 대한 클래스
class Person{
	//필드(이름,난수들)
	public String name;
	private int num1,num2,num3;
	
	//이름을 매개변수로 받아 초기화하는 생성자
	public Person(String name){
		this.name=name;
	}
	
	//세개의 난수를 생성하고 같은지 아닌지 판별하는 메소드 작성
	public boolean random() {
		//난수 생성
		num1=(int)(Math.random()*3+1);
		num2=(int)(Math.random()*3+1);
		num3=(int)(Math.random()*3+1);
		//생성된 난수 출력
		System.out.print("\t"+"\t"+num1+"\t"+num2+"\t"+num3+"\t");
		//세 난수가 서로 같으면 true 리턴, 다르면 false 리턴
		if (num1==num2&& num2==num3) {
			return true;
		}
		else
			return false;
	}
}

public class GamblingGame2 {

	public static void main(String[] args) {
		//스캐너 객체 생성
		Scanner scanner=new Scanner(System.in);
		//선수의 수를 입력받기 위한 출력문
		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		//선수의 수 입력받아 변수에 저장하기
		int num=scanner.nextInt();
		//입력받은 크기의 Person 레퍼런스 배열 생성
		Person []p=new Person[num];
		//nextInt()가 실행되고 남아있는 엔터값 지워주기
		String s=scanner.nextLine();
		//for문을 사용해 선수의 이름 입력받고 Person객체 생성하여 레퍼런스 배열에 하나씩 대입
		for(int i=0;i<num;i++) {
			System.out.print((i+1)+"번째 선수 이름>>");
			String name=scanner.nextLine();
			p[i]=new Person(name);
		}
		//무한루프, 승자가 나올 경우 무한루프 탈출
		while (true) {
			//엔터를 입력받기 위한 출력문
			//for문을 사용해 입력받은 수만큼 반복
			for (int n=0;n<num;n++) {
				System.out.print("["+p[n].name+"]:<Enter>");
				//엔터 입력받기
				String str=scanner.nextLine();
				//엔터를 입력받으면 random()메소드 호출
				if (str.equals("")) {
					//세 난수가 모두 같은 경우, 승자 출력, 종료
					if(p[n].random()) {
						System.out.println(p[n].name+"님이 이겼습니다!");
						scanner.close();
						return;
					}
					//세 난수가 다른 경우
					else
						System.out.println("아쉽군요!");
				}
			}
			
		}
		
	}

}
