package cn.cxt.mycollection;

/**
 * 自定义链表
 * 增加remove方法
 * @author qadyuanzai
 *
 */
public class SxtLinkedList03 {
	
	private Node first = null;
	private Node last = null;
	private int size = 0;
	
	public Object get(int index) {
		return getNode(index).element;
	}
	
	public Node getNode(int index) {
		checkRange(index);
		Node temp = null;
		if(index <= (size>>1)) {
			temp = first;
			for(int i = 0; temp != null; i++) {
				if(i == index) {
					break;
				}
				temp = temp.next;
			}			
		}else {
			temp = last;
			for(int i = size - 1; temp != null; i--) {
				if(i == index) {
					break;
				}
				temp = temp.previous;
			}
		}
		return temp;
	}
	
	public void remove(int index) {
		Node temp = getNode(index);
		Node up = temp.previous;
		Node down = temp.next;
		if(up == null) {
			first = down;
			down.previous = null;
		}else if(down == null) {
			last = up;
			up.next = null;
		}else {
			up.next = down;
			down.previous = up;
		}
		size--;
	}
	
	private void checkRange(int index) {
		if(index < 0 || index >= size) {
			throw new RuntimeException("索引不正确"+index);
		}
		return;
	}

	public void add(Object obj) {
		Node node = new Node(obj);
		if(first == null) {
			first = node;
			node.previous = null;
		}else {
			last.next = node;			
			node.previous = last;
		}
		last = node;
		node.next = null;
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(first == null) {
			sb.append("[]");
		}else {
			sb.append('[');
			Node temp;
			temp = first;
			while(temp != null) {
				sb.append(temp.element+",");
				temp = temp.next;
			}			
			sb.setCharAt(sb.length() - 1, ']');
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {
		SxtLinkedList03 list = new SxtLinkedList03();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		list.add("ff");
		
		list.remove(0);
		
		System.out.println(list);
		System.out.println(list.get(3));
		
	}
}
