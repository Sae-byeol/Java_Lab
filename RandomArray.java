import java.util.Scanner;
public class RandomArray {

	public static void main(String[] args) {
		//��ĳ�� ��ü ����
		Scanner scanner=new Scanner(System.in);
		//����ڷκ��� �Է��� �ޱ� ����  ��¹�
		System.out.print("���� �?");
		//��ĳ�ʸ� ���� �Է°� ����
		int n=scanner.nextInt();
		
		//�Է¹��� ���� ũ�⸸ŭ ���� �迭 ����
		int array[]=new int[n];
		
		//�迭�� ũ�⸸ŭ �ݺ��ϸ鼭
		for (int i=0;i<n;i++) {
			//1~100 ������ ���� ���� r �����ؼ�
			int r=(int)(Math.random()*100+1);
			if (i==0) {
				array[i]=r;
				System.out.print(array[i]+"  ");	
			}
			
			//���� r�� �̹� �迭 array[0]~array[i-1]�� �ִ��� �˻�
			for (int j=0;j<i;j++) {
				
				if (array[j]==r) {
					i--;
					break;
				}
				//���� ���� ���� ���� ����
				if (j==i-1) {
					array[i]=r;
					//�迭�� ȭ�鿡 ���
					System.out.print(array[i]+"  ");
					if (i%10==9)
						System.out.println();
				}
			}
			
			
			
		}
		//��ĳ�� ����
		scanner.close();
	}
}
