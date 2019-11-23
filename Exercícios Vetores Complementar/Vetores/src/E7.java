public class E7 {
	public static void main(String[] args) {
		int a[]=new int[15];
		int b[]=new int[15];
		int aux, fat=0, i=0, j=0;
		aux=fat;
		for(i=0; i<15; i++) {
			a[i]=i;
		}
		for(j=0; j<15; j++) {
			fat=a[j];
			aux=fat;
			fat=1;
			while(aux>1) {
				fat=fat*aux;
				aux--;
			}
			b[j]=fat;
		}
		for(i=0; i<15; i++) {
			System.out.println((i)+"! = "+b[i]);
		}
	}
}