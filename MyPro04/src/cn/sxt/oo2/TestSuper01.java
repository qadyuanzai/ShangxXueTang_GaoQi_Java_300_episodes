package cn.sxt.oo2;

public class TestSuper01 { 
    public static void main(String[] args) {
        System.out.println("��ʼ����һ��ChildClass����......");
        new ChildClass1();
    }
}
class FatherClass1 {
    public FatherClass1() {
        System.out.println("����FatherClass1");
    }
}
class ChildClass1 extends FatherClass1 {
    public ChildClass1() {
    	super();//��仰д�ڲ�д������ϣ����ø��๹����
        System.out.println("����ChildClass1");
    }
}