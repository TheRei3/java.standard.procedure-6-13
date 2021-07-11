package ex6no13;

public class ex6no13 {  //  267p
	public static void main(String[] args) {
		ex6no13 r = new ex6no13();
		
		int result = r.add(3,5);
		System.out.println(result);
		
		int[] result2 = {0};
		r.add(3,5,result2);
		System.out.println(result2[0]);
	}

	private int add(int a, int b) {
		return a+b;
	}

	private void add(int a, int b, int[] result) {
		result[0] = a+b;
	}

}
