/**
 * ����static
 * @author ��˼Դ
 *
 */
public class TestStatic {
	/*
	 * static��������ģ��������ڶ���ģ����������ʱ��ʹ�����
	 * ���ڶ����Ҫ����������һ�������Ŵ���
	 */
	int a;
	static int b;
	
	static void printa() {
		//System.out.println(a);//�����ھ�̬������ʹ�÷Ǿ�̬��Ա
		printb();//���þ�̬����Ҳû������
	}
	static void printb() {
		System.out.println(b);
	}
}
