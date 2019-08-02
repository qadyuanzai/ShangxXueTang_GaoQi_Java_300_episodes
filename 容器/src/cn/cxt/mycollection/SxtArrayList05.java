package cn.cxt.mycollection;

/**
 * ����remove
 * @author qadyuanzai
 *
 */
public class SxtArrayList05<E> {
	private	 Object[] elementData;
	private int size;
	private static final int DEFALT_CAPACITY = 10;
	
	
	public SxtArrayList05() {
		elementData = new Object[DEFALT_CAPACITY];
	}
	
	public SxtArrayList05(int capacity) {
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
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
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
	
	public void remove(E element) {
		//element����������Ԫ�ذ����Ƚϣ���õ�һ���Ƚ�Ϊtrue�ģ�����
		for(int i = 0; i < elementData.length; i++) {
			if(element.equals(get(i))) {
				remove(i);
				break;
			}
		}
	}
	
	public void remove(int index) {
		//a,b,c,d,e,f
		//0,1,2,3,4,5
		checkRange(index);
		if(index < elementData.length - 1) {
			System.arraycopy(elementData, index+1, elementData, index, elementData.length - index - 1);			
			//elementData[size-1] = null;//���Բ��ü�
		}else {
			elementData[index] = null;
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
		SxtArrayList05<String> s1 = new SxtArrayList05<>(20);
		s1.add("aa");
		s1.add("bb");
		s1.add("cc");

		
		s1.remove("aa");
		System.out.println(s1);
		System.out.println(s1.isEmpty());
	}
}
