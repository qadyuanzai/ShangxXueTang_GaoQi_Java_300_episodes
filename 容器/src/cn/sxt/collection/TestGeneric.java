package cn.sxt.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * ≤‚ ‘∑∫–Õ
 * @author qadyuanzai
 *
 */
public class TestGeneric {
	public static void main(String[] args) {
		MyCollection<String> mc = new MyCollection<String>();
		MyCollection<Integer> mc2 = new MyCollection<>();
		
		mc.set("Percy", 0);
		mc2.set(6666, 1);
		
		Integer a = (Integer)mc2.get(1);
		String b = (String)mc.get(0);
		System.out.println(a.toString());
		System.out.println(b);
		
		List list = new ArrayList();
		
	}
}

class MyCollection<E>{
	Object[] objs = new Object[5];
	
	public void set(E e, int index) {
		objs[index] = e;
	}
	
	public E get(int index) {
		return (E)objs[index];
	}
	
}
