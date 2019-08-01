package cn.cxt.mycollection;

/**
 * 自定义实现一个ArrayList
 * @author qadyuanzai
 *
 */
public class SxtArrayList01 {
	private	 Object[] elementData;
	private int size;
	private static final int DEFALT_CAPACITY = 10;
	
	
	public SxtArrayList01() {
		elementData = new Object[DEFALT_CAPACITY];
	}
	
	public SxtArrayList01(int capacity) {
		elementData = new Object[capacity];
	}
	
	public void add(Object obj) {
		elementData[size++] = obj;
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
		SxtArrayList01 s1 = new SxtArrayList01(20);
		s1.add("aa");
		s1.add("bb");
		s1.add("cc");
		
		System.out.println(s1);
		
	}
}
