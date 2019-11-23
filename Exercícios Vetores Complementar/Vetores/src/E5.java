public class E5 {
	public static void main(String[]args) {
		int a[]=new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i=0; i<10; i++) {
			System.out.println("-----"+a[i]+"-----");
			for(int aux=1; aux<=a[i]; aux++) {
				if(a[i]%aux==0) {
					System.out.println(+aux);
				}
			}
			System.out.println(" ");
		}
	}
}