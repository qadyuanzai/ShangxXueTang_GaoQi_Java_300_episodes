package cn.cxt.mycollection;

/**
 * �Զ���һ��HashMpa
 * @author qadyuanzai
 *
 */
public class SxtHashMap01 {
	Node2[] table;	//λͰ����
	int size;		//��ŵļ�ֵ�Ը���
	public SxtHashMap01() {
		table = new Node2[16];	//2����������
	}
	
	public void put(Object key, Object value) {
		//�������µĽڵ����
		Node2 newNode = new Node2();
		newNode.hash = myHash(key.hashCode(), table.length);
		
		newNode.key = key;
		newNode.value = value;
		newNode.next = null;
		
		Node2 temp = table[newNode.hash];
		Node2 iterLast = null;
		
		if(temp == null) {
			//�˴�����Ԫ��Ϊ�գ���ֱ�ӽ��½ڵ�Ž�ȥ
			table[newNode.hash] = newNode;
		}else {
			//�˴�����Ԫ�ز�Ϊ�գ��������Ӧ����
			while(temp!=null) {
				//�ж�K�Ƿ��ظ������ظ����򸲸�
				if(temp.key.equals(key)) {
					System.out.println("�ظ���");
					temp.value = value;	//ֻ�Ǹ���value������ֵ���ֲ���
					break;
				}
				
				//key���ظ�
				iterLast = temp;
				temp = temp.next;
			}
			if(temp == null) {
				iterLast.next = newNode;
			}
			
		}
		
	}
	
	public int myHash(int v, int length) {
		System.out.println(v&(length-1));
		return (v&(length-1));
	}
	
	public static void main(String[] args) {
		SxtHashMap01 m = new SxtHashMap01();
		m.put(10, "aa");
		m.put(11, "bb");
		m.put(12, "cc");
//		m.put(12, "dd");
//		m.put(12, "ee");
		m.put(27, "ff");

		
		System.out.println(m);

	}
}
