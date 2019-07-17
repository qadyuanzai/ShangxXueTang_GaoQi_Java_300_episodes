package cn.sxt.array2;

/**
 * ²âÊÔÊý×é¿½±´
 * @author qadyuanzai
 *
 */
public class TestArrayCopy {
	public static void main(String[] args) {
		String[] s = {"aa", "bb", "cc", "dd", "ee"};
		removeElement(s, 0);
		for(String str : s) {
			System.out.println(str);
		}
		
	}
	
	public static String[] removeElement(String[] s, int index) {
		System.arraycopy(s, index + 1, s, index, s.length - index -1);
		s[s.length - 1] = null;
		return s;
	}
	
	public static String[] insertElement(String[] s1, String s2, int index) {
		
		return s1;
	}
}

