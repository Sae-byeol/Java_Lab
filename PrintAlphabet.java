import java.util.Scanner;

public class PrintAlphabet {

	public static void main(String[] args) {
		//Scanner 객체 생성
		Scanner scanner=new Scanner(System.in);
		//"소문자 알파벳 하나를 입력하시오>>" 출력
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		//입력받은 문자열 읽기
		String s=scanner.next();
		//문자열의 첫번쨰 문자 읽기
		char c=s.charAt(0);
		//중첩반복문을 사용하여 문자 'a'부터 입력받은 문자까지 출력하기
		
		for (int i=0;i<=c;i++) {
			for (char j='a';j<=c-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		//스캐너 종료
		scanner.close();
	}

}
