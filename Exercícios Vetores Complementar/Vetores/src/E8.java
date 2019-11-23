import java.util.Scanner;
public class E8 {
	public static void main(String[] args) {
		int a[]=new int[10];
		int b[]=new int[10];
		Scanner ler=new Scanner(System.in);
		int i=0, j=0, m , n;
		for (i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"° valor:");
			a[i]=ler.nextInt();
		}
		for(i=0; i<10; i++) {
			for(j=9; j>=i; j--) {
				n=0;
				m=n;
				while(n<=a[j]) {
					m+=n;
					n++;
				}
				b[i]=m;
			}
		}
		for(i=0;i<10;i++) System.out.print(a[i]+"	");
		System.out.println("");
		for(i=0;i<10;i++) System.out.print(b[i]+"	");
	}
	
}