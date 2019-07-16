package cn.sxt.oop;

public class TestString {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
		//Õ®≥£”√equals
		System.out.println(str1.equals(str3));
		
		
		System.out.println("#################");
		
		String str4 = "Core Java";
		System.out.println(str4.charAt(2));
		
	}
}
