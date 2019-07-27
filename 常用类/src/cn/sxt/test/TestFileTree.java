package cn.sxt.test;

import java.io.File;

/**
 * ʹ�õݹ��㷨��ӡĿ¼��
 * @author qadyuanzai
 *
 */
public class TestFileTree {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\��˼Դ\\Videos\\TubeGet");
		printFile(f, 0);
	}
	
	static void printFile(File file, int level) {
		for(int i = 0; i < level; i++) {
			System.out.print("-");
		}
		System.out.println(file.getName());
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for(File temp : files) {
				printFile(temp, level + 1);
			}
		}
	}
}
