package Game2;
import java.util.Scanner;
//�� ����ڿ� ���� Ŭ����
class Person{
	//�ʵ�(�̸�,������)
	public String name;
	private int num1,num2,num3;
	
	//�̸��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	public Person(String name){
		this.name=name;
	}
	
	//������ ������ �����ϰ� ������ �ƴ��� �Ǻ��ϴ� �޼ҵ� �ۼ�
	public boolean random() {
		//���� ����
		num1=(int)(Math.random()*3+1);
		num2=(int)(Math.random()*3+1);
		num3=(int)(Math.random()*3+1);
		//������ ���� ���
		System.out.print("\t"+"\t"+num1+"\t"+num2+"\t"+num3+"\t");
		//�� ������ ���� ������ true ����, �ٸ��� false ����
		if (num1==num2&& num2==num3) {
			return true;
		}
		else
			return false;
	}
}

public class GamblingGame2 {

	public static void main(String[] args) {
		//��ĳ�� ��ü ����
		Scanner scanner=new Scanner(System.in);
		//������ ���� �Է¹ޱ� ���� ��¹�
		System.out.print("�׺� ���ӿ� ������ ���� ����>>");
		//������ �� �Է¹޾� ������ �����ϱ�
		int num=scanner.nextInt();
		//�Է¹��� ũ���� Person ���۷��� �迭 ����
		Person []p=new Person[num];
		//nextInt()�� ����ǰ� �����ִ� ���Ͱ� �����ֱ�
		String s=scanner.nextLine();
		//for���� ����� ������ �̸� �Է¹ް� Person��ü �����Ͽ� ���۷��� �迭�� �ϳ��� ����
		for(int i=0;i<num;i++) {
			System.out.print((i+1)+"��° ���� �̸�>>");
			String name=scanner.nextLine();
			p[i]=new Person(name);
		}
		//���ѷ���, ���ڰ� ���� ��� ���ѷ��� Ż��
		while (true) {
			//���͸� �Է¹ޱ� ���� ��¹�
			//for���� ����� �Է¹��� ����ŭ �ݺ�
			for (int n=0;n<num;n++) {
				System.out.print("["+p[n].name+"]:<Enter>");
				//���� �Է¹ޱ�
				String str=scanner.nextLine();
				//���͸� �Է¹����� random()�޼ҵ� ȣ��
				if (str.equals("")) {
					//�� ������ ��� ���� ���, ���� ���, ����
					if(p[n].random()) {
						System.out.println(p[n].name+"���� �̰���ϴ�!");
						scanner.close();
						return;
					}
					//�� ������ �ٸ� ���
					else
						System.out.println("�ƽ�����!");
				}
			}
			
		}
		
	}

}
