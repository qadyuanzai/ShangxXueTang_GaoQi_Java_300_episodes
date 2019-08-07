package cn.sxt.collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * ����TreeMap��ʹ��
 * @author qadyuanzai
 *
 */
public class TestTreeMap {
	public static void main(String[] args) {
		Map<Integer, String> treemap1 = new TreeMap<>();
		treemap1.put(20, "aa");
		treemap1.put(3, "bb");
		treemap1.put(6, "cc");
		treemap1.put(5, "dd");
		
		//����key�����ķ�ʽ����
		for(Integer key : treemap1.keySet()) {
			System.out.println(key + "------" + treemap1.get(key));
		}
		
		Map<Emp, String> emps = new TreeMap<>();
		emps.put(new Emp(1, "��1", 200), "");
		emps.put(new Emp(3, "��2", 200), "");
		emps.put(new Emp(2, "��3", 200), "");
		
		for(Emp temp : emps.keySet()) {
			System.out.println(temp);
		}
	}
}

class Emp implements Comparable<Emp> {
	int id;
	String name;
	double salary;
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Emp o) {
		if(this.id < o.id) {
			return -1;
		}else {
			return 1;
		}
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
