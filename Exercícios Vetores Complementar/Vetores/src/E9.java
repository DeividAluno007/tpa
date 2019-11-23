public class E9 {
	public static void main(String[]args) {
		//inter=4, 8, 19
		int a[]=new int[] {7, 4, 9, 5, 7, 8, 6, 19, 17, 20};
		int b[]=new int[] {4, 15, 10, 12, 13, 8, 59, 19, 14, 21};
		int c[]=new int[20];
		int i, j;
		for(i=0; i<10; i++) {
			for(j=0; j<10; j++) {
				if(a[i]==b[j]) {
					c[i]=a[i];
				}
			}
		}
		for (i=0; i<20; i++) {
			if(c[i]!=0) {
				System.out.print(c[i]+" ");
			}
		}
	}
}