
public class Student {
	
	//属性fields
	int id;
	String name;
	int age;
	Computer comp;
	
	//方法
	void study() {
		System.out.println("我在学习！"+comp.brand);
	}
	void play() {
		System.out.println("我在学习！！");
	}
	
	//构造方法
	Student(int id, String name, int age, Computer comp){
		this.id = id;
		this.name = name;
		this.age = age;
		this.comp = comp;
	}
	//构造方法重载
	Student(int id, String name, Computer comp){
		this.id = id;
		this.name = name;
		this.comp = comp;
	}
	
	//程序执行的入口，必须要有
	public static void main(String[] args) {
		Computer c = new Computer();
		c.brand = "Apple";
		
		Student stu = new Student(666, "Percy", 18, c); //创建一个对象
		
		stu.study();
		stu.play();
		
	}
}

class Computer {
	String brand;
}
