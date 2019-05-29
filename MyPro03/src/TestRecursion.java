/**
 * ≤‚ ‘µ›πÈ
 * @author ’≈Àº‘¥
 *
 */
public class TestRecursion {
	public static void main(String[] args) {
		a();
	}
	static int n = 0;
	public static void a() {
		System.out.println("^_^");
		n++;
		if(n<10) { 
			a();
		}else {
			return ;
		}
	}
}
