package cn.cxt.mycollection;

/**
 * 自定义链表
 * 增加remove方法
 * @author qadyuanzai
 *
 */
public class SxtLinkedList04 {
	
	private Node first = null;
	private Node last = null;
	private int size = 0;
	
	public Object get(int index) {
		return getNode(index).element;
	}
	
	private Node getNode(int index) {
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
	
	public void add(int index, Object obj) {
		if(index == size) {
			add(obj);
		}else {			
			Node node = new Node(obj);
			Node temp = getNode(index);
			Node up = temp.previous;
			if(up == null) {
				first = node;
			}else {
				up.next = node;
				node.previous = up;
			}
			node.next = temp;
			temp.previous = node;
			size++;
		}
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
		SxtLinkedList04 list = new SxtLinkedList04();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		list.add("ff");
		list.add(6, "666");
		
		list.remove(6);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(3));
		
	}
}
