import java.util.Scanner;

public class CardConvRev {
	//n을 c진수로 변환하는 함수
	//변환한 수를 넣어둔 배열의 크기를 반환
	private static int cardConvRev(int x, int r, char[]d) {
		int digits=0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			d[digits++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		
		return digits;
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n;
		int c;
		char []cno=new char[32];
		int d;
		
		System.out.println("10진수를 기수 변환합니다.");
		//음이 아닌 정수 입력받기
		do {
			System.out.print("변환하는 음이 아닌 정수");
			n=scanner.nextInt();
		}while(n<0);//음수이면 다시 입력받기
		
		do {
			System.out.print("어떤 진수로 변환할까요?(2~36)");
			c=scanner.nextInt();
		}while(c<2||c>36);
		
		//n을 c진수로 변환하기
		d=cardConvRev(n,c,cno);
		
		System.out.print(c+" 진수로는 ");
		//진수를 나타낼땐 윗자리부터 나타냄을 주의
		for (int i=d-1;i>=0;i--) {
			System.out.print(cno[i]);
		}
		System.out.println("입니다.");
		
	}

}
