package cn.cxt.mycollection;

/**
 * 数组扩容
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
		//什么时候扩容？
		if(size == elementData.length) {
			//怎么扩容？
			Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
																//位运算优先级低	//变成原先的1.5倍
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;
		}
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
		SxtArrayList03<String> s1 = new SxtArrayList03<>(20);
		s1.add("aa");
		s1.add("bb");
		s1.add("cc");
		for(int i = 0; i < 40; i++) {
			s1.add(""+i);
		}
		
		System.out.println(s1);
		
	}
}
