package cn.cxt.mycollection;

/**
 * 自定义一个HashMpa
 * @author qadyuanzai
 *
 */
public class SxtHashMap01 {
	Node2[] table;	//位桶数组
	int size;		//存放的键值对个数
	public SxtHashMap01() {
		table = new Node2[16];	//2的整数次幂
	}
	
	public void put(Object key, Object value) {
		//定义了新的节点对象
		Node2 newNode = new Node2();
		newNode.hash = myHash(key.hashCode(), table.length);
		
		newNode.key = key;
		newNode.value = value;
		newNode.next = null;
		
		Node2 temp = table[newNode.hash];
		Node2 iterLast = null;
		
		if(temp == null) {
			//此处数组元素为空，则直接将新节点放进去
			table[newNode.hash] = newNode;
		}else {
			//此处数组元素不为空，则遍历对应链表
			while(temp!=null) {
				//判断K是否重复，若重复，则覆盖
				if(temp.key.equals(key)) {
					System.out.println("重复了");
					temp.value = value;	//只是覆盖value，其他值保持不变
					break;
				}
				
				//key不重复
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
