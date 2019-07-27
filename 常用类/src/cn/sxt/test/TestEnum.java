package cn.sxt.test;

public class TestEnum {
	public static void main(String[] args) {
		Season s = Season.SPRING;
		switch(s) {
		case SPRING:
			System.out.println("春天来了");
			break;
		case SUMMER:
			System.out.println("夏天到了");
			break;
		case AUTUMN:
			System.out.println("红叶枫了");
			break;
		case WINTER:
			System.out.println("冬天走了");
			break;
		}
		
		
	}
}

enum Season{
	SPRING,SUMMER,AUTUMN,WINTER
}

enum Week{
	星期一,星期二,星期三,星期四,星期五,星期六,星期日
}