package vetores;
import java.util.Scanner;
public class E3 {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
			String v[]=new String[26];
			for(int i=0; i<26; i++) {
				System.out.println("Digite a "+(i+1)+" ª letra:");
				v[i]=ler.next();
			}
			System.out.print("(");
			for(int i=0; i<26; i++) {
				if(i==25) {
					System.out.print(v[i]+")");
				}
				else {
				System.out.print(v[i]+", ");
				}
			}
	}
}