package cn.cxt.mycollection;

/**
 * 实现get方法
 * @author qadyuanzai
 *
 */
public class SxtHashMap03 {
	Node2[] table;	//位桶数组
	int size;		//存放的键值对个数
	public SxtHashMap03() {
		table = new Node2[16];	//2的整数次幂
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
		//如果要完善，还要考虑数组扩容问题
		
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
			size++;
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
				size++;
			}
			
		}
		
	}
	
	public Object get(Object key) {
		int hash = myHash(key.hashCode(), table.length - 1);
		Node2 temp =  table[hash];
		if(temp == null) {
			throw new RuntimeException("不存在键：" + key);
		}
		while(temp != null) {
			if(temp.key.equals(key)) {
				break;
			}
			temp = temp.next;
		}
		if(temp == null) {
			throw new RuntimeException("不存在键：" + key);
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
