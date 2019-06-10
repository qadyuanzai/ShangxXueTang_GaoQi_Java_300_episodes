package cn.sxt.oo2;
/**
 * 测试多态
 * @author 张思源
 *
 */
public class TestPolymorphism {
	public static void main(String[] args) {
		Animal a = new Animal();
		animalCry(a);
		
		Animal d = new Dog();//向上造型
		Dog d2 = (Dog)d;//强制向下转型
		
		animalCry(new Cat());//传入Cat对象指向了子类
		animalCry(d);//传入实际为Dog对象，结果指向了子类
	}
	
	static void animalCry(Animal a) {
		a.shout();
	}
}

class Animal {
    public void shout() {
        System.out.println("叫了一声！");
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("旺旺旺！");
    }
    public void seeDoor() {
        System.out.println("看门中....");
    }
}
class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵喵！");
    }
}