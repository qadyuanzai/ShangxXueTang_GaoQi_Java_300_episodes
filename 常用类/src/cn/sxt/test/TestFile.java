package cn.sxt.test;

import java.io.File;
import java.io.IOException;

/**
 * ����File��Ļ����÷�
 * @author qadyuanzai
 *
 */
public class TestFile {
	public static void main(String[] args) throws IOException {
		
//		File f = new File("c:/a.txt");
		//c�̸�Ŀ¼�����޸�
		File f = new File("C:/Users/��˼Դ/Desktop/a.txt");
		f.renameTo(new File("C:/Users/��˼Դ/Desktop/bb.txt"));
		
		System.out.println(System.getProperty("user.dir"));
		File f2 = new File("gg.txt");
		f2.createNewFile();
		
//        System.out.println("File�Ƿ���ڣ�"+f.exists());
//        System.out.println("File�Ƿ���Ŀ¼��"+f.isDirectory());
//        System.out.println("File�Ƿ����ļ���"+f.isFile());
//        System.out.println("File����޸�ʱ�䣺"+new Date(f.lastModified()));
//        System.out.println("File�Ĵ�С��"+f.length());
//        System.out.println("File���ļ�����"+f.getName());
//        System.out.println("File��Ŀ¼·����"+f.getPath());
//												abs����·��
//        File f = new File("d:/c.txt");
//        f.createNewFile(); // ����d����������c.txt�ļ�
//        f.delete(); // �����ļ���Ŀ¼��Ӳ����ɾ��
//        File f2 = new File("d:/��Ӱ/����/��½");
//        boolean flag = f2.mkdirs();//Ŀ¼�ṹ����һ��������Ҳû��ϵ����������Ŀ¼��
//        System.out.println(flag);//�����ɹ�
	}
}
