public class E6 {
	public static void main(String[]args) {
		int a[]=new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int i, j;
		for(i=0; i<10; i++) {
			a[i]=(int)Math.pow(2, a[i]);
		}
		for(j=0; j<10; j++) {
			System.out.println("2^"+j+"="+a[j]);
		}
	}
}