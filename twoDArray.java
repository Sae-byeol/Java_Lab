
public class twoDArray {

	public static void main(String[] args) {
		//4x4 2차원 배열 생성
		int array[][]=new int[4][4];
		//배열의 모든 원소를 0으로 초기화
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				array[i][j]=0;
			}
		}
		
		//반복문 돌면서 10개만 랜덤한 정수 생성
		for (int n=0;n<10;) {
			int num=(int)(Math.random()*10+1);
			//배열의 행 인덱스 랜덤하게 생성
			int row=(int)(Math.random()*4);
			//배열의 열 인덱스 랜덤하게 생성
			int col=(int)(Math.random()*4);
			
			//배열 원소가 0이 아니면 이미 값이 저장된 원소이므로 건너뜀
			if (array[row][col]!=0) {
				continue;
			}
			//그렇지 않다면 (해당 위치의 원소가 0이라면) 랜덤숫자 (0~10) 저장
			else {
				array[row][col]=num;
				//생성된 숫자 갯수 증가
				n++;
			}
		}
		//2차원 배열 출력
		for (int a=0;a<4;a++) {
			for (int b=0;b<4;b++) {
				System.out.print(array[a][b]+"   ");
			}
			System.out.println();
		}
		

	}

}
