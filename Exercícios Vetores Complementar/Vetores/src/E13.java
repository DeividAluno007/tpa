public class E13 {
	public static void main(String[]args) {
		int a[]=new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int b[]=new int[10];
		int i, j;
		for(i=0; i<10; i++) {
			if(a[i]%2==0) {
				b[i]=1;
			}
			else {
				b[i]=0;
			}
			System.out.print(b[i]+" ");
		}
	}
}