public class E3 {
	public static void main(String[]args) {
		int a[]=new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i=0; i<10; i++) {
			int primo=0;
			for(int aux=1; aux<=a[i]; aux++) {
				if(a[i]%aux==0) {
					primo++;
				}
			}
			if(primo!=2) {
				System.out.println(a[i]+" nao eh primo");
			}
			else {
				System.out.println(a[i]+" eh primo");
			}
		}
	}
}