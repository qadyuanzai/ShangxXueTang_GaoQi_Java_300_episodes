/**
 * ���Ի����������ͣ����ͱ�����
 * @author ��˼Դ
 *
 */
public class TestPrimitiveDataType {
	public static void main(String[] args) {
		//�������ͱ���
		int a = 15;
		int b = 015; //��0��ͷ��8����
		int c = 0x15; //��0x��ͷ��16����
		int d = 0b1101;//��0b��ͷ��2����
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		byte age = 30;
		short salary = 30000;
		int population = 2000000000;
		long globalPopulation = 7400000000L;//�����L
	}
}
