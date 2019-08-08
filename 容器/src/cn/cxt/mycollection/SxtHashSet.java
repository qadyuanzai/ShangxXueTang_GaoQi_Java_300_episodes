package cn.cxt.mycollection;

import java.util.HashMap;

/**
 * 手动实现一个HashSet
 * @author qadyuanzai
 *
 */
public class SxtHashSet {
	private HashMap map;
	private static final Object PRESENT = new Object();
	
	public SxtHashSet() {
		map = new HashMap();
	}
	
	public int size() {
		return map.size();
	}
	
	public void add(Object o) {
		map.put(o, PRESENT);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Object o : map.keySet()) {
			sb.append(o);
		}
		
		return sb.toString();
	}
}
