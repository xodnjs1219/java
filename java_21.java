
public class java_21 {

	public static void main(String[] args) {
		int Age = 25; //Age��� �̸��� ������ ���� �� �ʱ�ȭ
		System.out.println(Age); //Age�� ���� ���
		
		Age = Age + 2000; //Age�� 2000�� ���Ͽ� �ٽ� Age�� ����
		System.out.println(Age);//2025�� ����� Age ���
		
		//�� ������ ���� �ٲٱ�
		int x = 10, y = 20; //x,y�� ���� �� �ʱ�ȭ
		int z; //x�� ���� �ӽ� ������ ���� ����
		System.out.println(x+","+y);
		z=x; //x�� ���� z�� �ӽ� ����
		x=y; //y�� ���� x�� ����
		y=z; //�ӽ� �����ߴ� x�� ���� y�� ����
		System.out.println(x+","+y);
	}

}