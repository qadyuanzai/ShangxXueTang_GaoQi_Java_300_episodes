package cn.sxt.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * ����HashMap��ʹ��
 * @author qadyuanzai
 *
 */
public class TestMap {
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<>();
		
		m1.put(1, "one");
		m1.put(2, "two");
		m1.put(3, "three");

		System.out.println(m1.get(1));
		
	}
}
