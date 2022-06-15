package loop;

public class Addition {

	public static void main(String[] args) {
		int x = 10, y=20;
		System.out.println(x+y);   // 30
		System.out.println(--x);   // 9 
		System.out.println(++y);   //21
		
		System.out.println(--x);   // 8
		System.out.println(x--);  //8
		System.out.println(x-- + y++);  //28


	}

}
