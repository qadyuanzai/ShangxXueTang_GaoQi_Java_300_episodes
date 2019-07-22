package cn.sxt.test;

public class TestStringBuilder2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 26; i++) {
			sb.append((char)('a'+i));
		}
		
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.setCharAt(3, '��');
		System.out.println(sb);
		
		//��ʽ���ã����ľ��Ǹ÷���return this;
		sb.insert(3, '��').insert(3, '��');
		System.out.println(sb);
		
		sb.delete(2, 3).delete(6, 7);
		System.out.println(sb);
	}
}
