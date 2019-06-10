package cn.sxt.oo2;
/**
 * ���Զ�̬
 * @author ��˼Դ
 *
 */
public class TestPolymorphism {
	public static void main(String[] args) {
		Animal a = new Animal();
		animalCry(a);
		
		Animal d = new Dog();//��������
		Dog d2 = (Dog)d;//ǿ������ת��
		
		animalCry(new Cat());//����Cat����ָ��������
		animalCry(d);//����ʵ��ΪDog���󣬽��ָ��������
	}
	
	static void animalCry(Animal a) {
		a.shout();
	}
}

class Animal {
    public void shout() {
        System.out.println("����һ����");
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("��������");
    }
    public void seeDoor() {
        System.out.println("������....");
    }
}
class Cat extends Animal {
    public void shout() {
        System.out.println("����������");
    }
}