
public class twoDArray {

	public static void main(String[] args) {
		//4x4 2���� �迭 ����
		int array[][]=new int[4][4];
		//�迭�� ��� ���Ҹ� 0���� �ʱ�ȭ
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				array[i][j]=0;
			}
		}
		
		//�ݺ��� ���鼭 10���� ������ ���� ����
		for (int n=0;n<10;) {
			int num=(int)(Math.random()*10+1);
			//�迭�� �� �ε��� �����ϰ� ����
			int row=(int)(Math.random()*4);
			//�迭�� �� �ε��� �����ϰ� ����
			int col=(int)(Math.random()*4);
			
			//�迭 ���Ұ� 0�� �ƴϸ� �̹� ���� ����� �����̹Ƿ� �ǳʶ�
			if (array[row][col]!=0) {
				continue;
			}
			//�׷��� �ʴٸ� (�ش� ��ġ�� ���Ұ� 0�̶��) �������� (0~10) ����
			else {
				array[row][col]=num;
				//������ ���� ���� ����
				n++;
			}
		}
		//2���� �迭 ���
		for (int a=0;a<4;a++) {
			for (int b=0;b<4;b++) {
				System.out.print(array[a][b]+"   ");
			}
			System.out.println();
		}
		

	}

}
