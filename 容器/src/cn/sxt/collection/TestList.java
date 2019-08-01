package cn.sxt.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 测试Collection接口中的方法
 * @author qadyuanzai
 *
 */
public class TestList {
	public static void main(String[] args) {

		//test02();
		test03();
		
		
		
	}
	
	public static void test01() {
		Collection<String> c = new ArrayList<>();
		
		c.add("Percy");
		c.add("Percy2");
		
		Object[] objs = c.toArray();
		System.out.println(objs);
		
		System.out.println(c.contains("Percy"));
		
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		
		//remove只是移除，不是删除
		c.remove("Percy2");
		System.out.println(c);
		c.clear();
	}
	
	public static void test02() {
		List<String> list01 = new ArrayList<String>();
		list01.add("aa");
		list01.add("bb");
		list01.add("cc");
		
		List<String> list02 = new ArrayList<String>();
		list02.add("aa");
		list02.add("dd");
		list02.add("ee");
		
		System.out.println("list01:"+list01);
		
		//list01.addAll(list02);		//全部加上
		//list01.removeAll(list02);		//移除并集
		//list01.retainAll(list02);		//保留交集
		
		System.out.println("list01:"+list01);
	}
	
	public static void test03() {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list);
		
		list.add(2, "Percy");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.set(2, "Percy");
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		//返回指定元素第一次出现的索引地址
		System.out.println(list.indexOf("A"));
		//返回指定元素倒序第一次出现地址
		System.out.println(list.lastIndexOf("A"));
		
		
	}
	
	
}
