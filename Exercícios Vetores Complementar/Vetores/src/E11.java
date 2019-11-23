import java.util.Scanner;
public class E11 {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		int a[]=new int[10];
		int i, x, j, aux=0;
		for(i=0; i<10; i++) {
			System.out.println("Insira o "+(i+1)+"º valor:");
			a[i]=ler.nextInt();
		}
		System.out.println("---------------");
		System.out.println("ROTINA DE BUSCA");
		System.out.println("---------------");
		System.out.println("Pesquise algum número:");
		x=ler.nextInt();
		for(i=0; i<10; i++) {
			for(j=0; j<10; j++){
				if(x==a[i] || x==a[j]) {
					aux+=1;
				}
				else {
					aux+=0;
				}
			}
		}
		if(aux>0) {
			System.out.println("O item " +x+" foi encontrado!");
		}
		else{
			System.out.println("O item " +x+" NÃO foi encontrado!");
		}
	}
}