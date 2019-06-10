package cn.sxt.oo2;

/**
 * 测试封装
 * @author 张思源
 *
 */
public class TestEncapsulation {
	public static void main(String[] args) {
		Human h = new Human();
		h.name = "";//Default同一包可用
		
		Person1 p1 = new Person1();
		p1.setAge(18);
		p1.setName("Percy");
	}
}



class boy extends Human{
	void sayName() {
		System.out.println(name);
	}
	void sayHeight() {
		System.out.println(height);
	}
}