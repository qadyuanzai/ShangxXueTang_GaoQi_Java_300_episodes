
public class Student {
	
	//����fields
	int id;
	String name;
	int age;
	Computer comp;
	
	//����
	void study() {
		System.out.println("����ѧϰ��"+comp.brand);
	}
	void play() {
		System.out.println("����ѧϰ����");
	}
	
	//���췽��
	Student(int id, String name, int age, Computer comp){
		this.id = id;
		this.name = name;
		this.age = age;
		this.comp = comp;
	}
	//���췽������
	Student(int id, String name, Computer comp){
		this.id = id;
		this.name = name;
		this.comp = comp;
	}
	
	//����ִ�е���ڣ�����Ҫ��
	public static void main(String[] args) {
		Computer c = new Computer();
		c.brand = "Apple";
		
		Student stu = new Student(666, "Percy", 18, c); //����һ������
		
		stu.study();
		stu.play();
		
	}
}

class Computer {
	String brand;
}
