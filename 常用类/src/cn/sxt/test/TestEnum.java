package cn.sxt.test;

public class TestEnum {
	public static void main(String[] args) {
		Season s = Season.SPRING;
		switch(s) {
		case SPRING:
			System.out.println("��������");
			break;
		case SUMMER:
			System.out.println("���쵽��");
			break;
		case AUTUMN:
			System.out.println("��Ҷ����");
			break;
		case WINTER:
			System.out.println("��������");
			break;
		}
		
		
	}
}

enum Season{
	SPRING,SUMMER,AUTUMN,WINTER
}

enum Week{
	����һ,���ڶ�,������,������,������,������,������
}