package cn.cxt.mycollection;

/**
 * ʵ��get����
 * @author qadyuanzai
 *
 */
public class SxtHashMap03 {
	Node2[] table;	//λͰ����
	int size;		//��ŵļ�ֵ�Ը���
	public SxtHashMap03() {
		table = new Node2[16];	//2����������
	}
	
	public String toString() {
		//{10:aa,20:bb}
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		for(int i = 0; i < table.length; i++) {
			Node2 temp = table[i];
			while(temp != null) {
				sb.append(temp.key + ":" + temp.value + ",");
				temp = temp.next;
			}
		}
		if(sb.charAt(sb.length() - 1) == '[') {
			sb.append(']');
		}else {
			sb.setCharAt(sb.length() - 1, ']');			
		}
		return sb.toString();
	}
	
	public void put(Object key, Object value) {
		//���Ҫ���ƣ���Ҫ����������������
		
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
			size++;
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
				size++;
			}
			
		}
		
	}
	
	public Object get(Object key) {
		int hash = myHash(key.hashCode(), table.length - 1);
		Node2 temp =  table[hash];
		if(temp == null) {
			throw new RuntimeException("�����ڼ���" + key);
		}
		while(temp != null) {
			if(temp.key.equals(key)) {
				break;
			}
			temp = temp.next;
		}
		if(temp == null) {
			throw new RuntimeException("�����ڼ���" + key);
		}
		
		return temp.value;
		
	}
	
	public int myHash(int v, int length) {
		System.out.println(v&(length-1));
		return (v&(length-1));
	}
	
	public static void main(String[] args) {
		SxtHashMap03 m = new SxtHashMap03();
		m.put(10, "aa");
		m.put(11, "bb");
		m.put(12, "cc");
		m.put(12, "dd");
		m.put(28, "ee");
		m.put(28, "ff");
		
		System.out.println(m.get(28));

	}
}
