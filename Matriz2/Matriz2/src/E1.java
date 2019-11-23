import java.util.*;
public class E1 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		Random ale = new Random();
		int n, i=0, j=0, p=0, negativos=0;
		System.out.println("Digite a ordem da matriz:");
		n = ler.nextInt();
		int m[][] = new int[n][n];
		int diagonal[] = new int[n];
		System.out.print("\n");
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				m[i][j]=ale.nextInt()%50;
				if (m[i][j]<0) {
					negativos++;
				}
			}
		}
		for(p=0; p<n; p++) {
			diagonal[p]=m[p][p];
		}
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				System.out.print("[ "+m[i][j]+" ]");
				if(j==n-1) {
					System.out.print("\n");
				}
			}
		}
		System.out.print("\n");
		System.out.print("Main diagonal: ");
		for(int aux=0; aux<n; aux++) {
			System.out.print(diagonal[aux]+" ");
		}
		System.out.print("\n");
		System.out.println("Negative numbers: "+negativos);
	}
}