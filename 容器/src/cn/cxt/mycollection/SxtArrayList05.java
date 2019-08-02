package cn.cxt.mycollection;

/**
 * 增加remove
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
			throw new RuntimeException("容器容量不能小于零");
		}else {
			elementData = new Object[capacity];			
		}
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
		//索引合法判断
		checkRange(index);
		elementData[index] = element;
	}
	
	public void checkRange(int index) {
		if(index<0||index>=size) {
			//不合法时抛出错误
			throw new RuntimeException("索引不合法:"+index);
		}
	}
	
	public void remove(E element) {
		//element将它和所有元素挨个比较，获得第一个比较为true的，返回
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
			//elementData[size-1] = null;//可以不用加
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
