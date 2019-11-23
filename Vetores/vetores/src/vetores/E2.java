package vetores;
import java.util.Scanner;
public class E2 {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		String v[]=new String[7];
		for(int i=0; i<7; i++) {
			System.out.println("Digite um dia da semana:");
			v[i]=ler.next();
		}
		for(int i=0; i<7; i++) {
			System.out.println(v[i]);
		}
	}
}