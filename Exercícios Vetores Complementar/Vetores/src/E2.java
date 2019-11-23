public class E2 {
	public static void main(String[]args) {
		int a[]=new int[]{1, 2, 3, 4, 5};
		for(int i=0; i<5; i++) {
			for(int aux=1; aux<=10; aux++) {
				System.out.println(a[i]+" X "+aux+" = "+a[i]*aux);
			}
			System.out.println(" ");
		}
	}
}