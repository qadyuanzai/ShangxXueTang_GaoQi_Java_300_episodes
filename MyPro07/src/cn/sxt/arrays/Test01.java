package cn.sxt.arrays;

public class Test01 {
	public static void main(String[] args) {
		int[] arr01 = new int[10];
		String[] arr02 = new String[5];
		
		User[] arr03 = new User[3];
		arr03[0] = new User(1000,"Percy");
		arr03[1] = new User(1001,"Percy1");
		arr03[2] = new User(1002,"Percy2");
		
		for(int i = 0; i < arr03.length; i++) {
			System.out.println("id:"+arr03[i].getId()+" Name:"+arr03[i].getName());
		}
		
		//静态初始化
		User[] arr04 = {
				new User(1000,"Percy00"),
				new User(1001,"Percy01"),
				new User(1002,"Percy02")
		};
		//注意结尾分号
		
	}
}

class User{
	private int id;
	private String name;

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}