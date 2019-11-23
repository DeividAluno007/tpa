package vetores;
import java.util.Scanner;
public class E1 {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		String v[]=new String[12];
		for(int i=0; i<12; i++) {
			System.out.println("Digite o mês "+(i+1)+":");
			v[i]=ler.next();
		}
		for(int i=0; i<12; i++) {
			System.out.println(v[i]);
		}
	}
}