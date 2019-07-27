package cn.sxt.test;

import java.io.File;
import java.io.IOException;

/**
 * 测试File类的基本用法
 * @author qadyuanzai
 *
 */
public class TestFile {
	public static void main(String[] args) throws IOException {
		
//		File f = new File("c:/a.txt");
		//c盘根目录不能修改
		File f = new File("C:/Users/张思源/Desktop/a.txt");
		f.renameTo(new File("C:/Users/张思源/Desktop/bb.txt"));
		
		System.out.println(System.getProperty("user.dir"));
		File f2 = new File("gg.txt");
		f2.createNewFile();
		
//        System.out.println("File是否存在："+f.exists());
//        System.out.println("File是否是目录："+f.isDirectory());
//        System.out.println("File是否是文件："+f.isFile());
//        System.out.println("File最后修改时间："+new Date(f.lastModified()));
//        System.out.println("File的大小："+f.length());
//        System.out.println("File的文件名："+f.getName());
//        System.out.println("File的目录路径："+f.getPath());
//												abs绝对路径
//        File f = new File("d:/c.txt");
//        f.createNewFile(); // 会在d盘下面生成c.txt文件
//        f.delete(); // 将该文件或目录从硬盘上删除
//        File f2 = new File("d:/电影/华语/大陆");
//        boolean flag = f2.mkdirs();//目录结构中有一个不存在也没关系；创建整个目录树
//        System.out.println(flag);//创建成功
	}
}
