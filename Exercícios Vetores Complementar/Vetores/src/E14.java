public class E14 {
	public static void main(String[]args) {
		//res: -1, -1, 0, 1, -1, 1, 0, -1, 0, 0
		int a[]=new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int b[]=new int[] {2, 3, 3, 1, 10, 1, 7, 15, 9, 10};
		int c[]=new int[10];
		int i, j;
		for(i=0; i<10; i++) {
			if(a[i]>b[i]) {
				c[i]=1;
			}
			else if(a[i]==b[i]) {
				c[i]=0;
			}
			else if(a[i]<b[i]) {
				c[i]=-1;
			}
			System.out.print(c[i]+" ");
		}
	}
}