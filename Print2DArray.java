
public class Print2DArray {

	public static void main(String[] args) {
		//배열 선언 및 초기화
		int n[][]= {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		//중첩반복문과 length를 사용하여 이차원 배열 출력
		for (int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print(n[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
