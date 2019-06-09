package cn.sxt.oo2;

public class TestSuper01 { 
    public static void main(String[] args) {
        System.out.println("开始创建一个ChildClass对象......");
        new ChildClass1();
    }
}
class FatherClass1 {
    public FatherClass1() {
        System.out.println("创建FatherClass1");
    }
}
class ChildClass1 extends FatherClass1 {
    public ChildClass1() {
    	super();//这句话写于不写都会加上，调用父类构造器
        System.out.println("创建ChildClass1");
    }
}