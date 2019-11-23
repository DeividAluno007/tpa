public class E10 {
	public static void main(String[]args) {
		//dif=7, 9, 5, 6, 17, 20, 24
		int a[]=new int[] {4, 24, 9, 5, 7, 8, 6, 19, 17, 20};
		int b[]=new int[] {4, 15, 10, 12, 13, 8, 59, 19, 14, 21};
		int c[]=new int[30];
		int i, j;
		for(i=0; i<10; i++) {
			for(j=0; j<10; j++) {
				if(a[i]==b[j]) {
					c[i]=a[i];
				}
			}
		}
		for (i=0; i<10; i++) {
			if(a[i]!=c[i]) {
				System.out.print(a[i]+" ");
			}
		}
	}
}