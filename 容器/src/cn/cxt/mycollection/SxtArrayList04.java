package cn.cxt.mycollection;

/**
 * ����set��get����
 * ��������߽���
 * @author qadyuanzai
 *
 */
public class SxtArrayList04<E> {
	private	 Object[] elementData;
	private int size;
	private static final int DEFALT_CAPACITY = 10;
	
	
	public SxtArrayList04() {
		elementData = new Object[DEFALT_CAPACITY];
	}
	
	public SxtArrayList04(int capacity) {
		if(capacity<=0) {
			throw new RuntimeException("������������С����");
		}else {
			elementData = new Object[capacity];			
		}
	}
	
	public void add(E e) {
		//ʲôʱ�����ݣ�
		if(size == elementData.length) {
			//��ô���ݣ�
			Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
																//λ�������ȼ���	//���ԭ�ȵ�1.5��
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;
		}
		elementData[size++] = e;
	}
	
	public E get(int index) {
		checkRange(index);
		return (E)elementData[index];
	}
	
	public void set(E element, int index) {
		//�����Ϸ��ж�
		checkRange(index);
		elementData[index] = element;
	}
	
	public void checkRange(int index) {
		if(index<0||index>=size) {
			//���Ϸ�ʱ�׳�����
			throw new RuntimeException("�������Ϸ�:"+index);
		}
	}
	
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < size; i++) {
			sb.append(elementData[i]+",");
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}
	
	public static void main(String[] args) {
		SxtArrayList04<String> s1 = new SxtArrayList04<>(20);
		s1.add("aa");
		s1.add("bb");
		s1.add("cc");
		for(int i = 0; i < 40; i++) {
			s1.add(""+i);
		}
		
		System.out.println(s1);
		s1.set("PPoih", 1);
		System.out.println(s1.get(100));
	}
}
