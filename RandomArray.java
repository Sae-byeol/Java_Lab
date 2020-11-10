import java.util.Scanner;
public class RandomArray {

	public static void main(String[] args) {
		//스캐너 객체 생성
		Scanner scanner=new Scanner(System.in);
		//사용자로부터 입력을 받기 위한  출력문
		System.out.print("정수 몇개?");
		//스캐너를 통한 입력값 저장
		int n=scanner.nextInt();
		
		//입력받은 값의 크기만큼 정수 배열 생성
		int array[]=new int[n];
		
		//배열의 크기만큼 반복하면서
		for (int i=0;i<n;i++) {
			//1~100 범위의 랜덤 정수 r 생성해서
			int r=(int)(Math.random()*100+1);
			if (i==0) {
				array[i]=r;
				System.out.print(array[i]+"  ");	
			}
			
			//정수 r이 이미 배열 array[0]~array[i-1]에 있는지 검사
			for (int j=0;j<i;j++) {
				
				if (array[j]==r) {
					i--;
					break;
				}
				//같은 값이 없을 때만 저장
				if (j==i-1) {
					array[i]=r;
					//배열을 화면에 출력
					System.out.print(array[i]+"  ");
					if (i%10==9)
						System.out.println();
				}
			}
			
			
			
		}
		//스캐너 종료
		scanner.close();
	}
}
