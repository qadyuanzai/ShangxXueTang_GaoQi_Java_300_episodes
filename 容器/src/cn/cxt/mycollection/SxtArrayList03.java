package cn.cxt.mycollection;

/**
 * Êý×éÀ©ÈÝ
 * @author qadyuanzai
 *
 */
public class SxtArrayList03<E> {
	private	 Object[] elementData;
	private int size;
	private static final int DEFALT_CAPACITY = 10;
	
	
	public SxtArrayList03() {
		elementData = new Object[DEFALT_CAPACITY];
	}
	
	public SxtArrayList03(int capacity) {
		elementData = new Object[capacity];
	}
	
	public void add(E e) {
		elementData[size++] = e;
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
		SxtArrayList03 s1 = new SxtArrayList03(20);
		s1.add("aa");
		s1.add("bb");
		s1.add("cc");
		
		System.out.println(s1);
		
	}
}
