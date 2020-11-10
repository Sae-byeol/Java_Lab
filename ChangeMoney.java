import java.util.Scanner;
public class ChangeMoney {

	public static void main(String[] args) {
		//환산할 돈의 종류를 나타내는 배열 생성하기
		int [] unit= {50000,10000,1000,500,100,50,10,1};
		//Scanner 객체 생성
		Scanner scanner=new Scanner(System.in);
		//"금액을 입력하시오>>" 출력
		System.out.print("금액을 입력하시오>>");
		//입력받은 금액을 변수에 저장
		int money=scanner.nextInt();
		
		//for 반복문을 사용하여 배열의 각 원소로 입력받은 금액을 나눠주기
		for (int i=0;i<unit.length;i++) {
			//나눗셈의 몫은 변환 가능한 돈의 개수
			int n=money/unit[i];
			//나눗셈의 나머지를 다시 배열의 다음 원소로 나누기 위함
			money=money%unit[i];
			//변환가능한 개수가 0개인 경우는 출력하지 않음
			if (n!=0) {
				System.out.println(unit[i]+"원 짜리: "+ n+'개');
			}
		}
		//스캐너 종료
		scanner.close();
	}

}
