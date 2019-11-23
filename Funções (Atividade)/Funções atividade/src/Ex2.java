import java.util.Scanner;
public class Ex2 {
	public static void main (String [] args) {
		menu();
	}
	public static void menu() {
		Scanner ler=new Scanner (System.in);
		double tg;
		int op, jur;
		System.out.println("Digite o total de gastos:");
		tg=ler.nextDouble();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Escolha uma op��o:");
		System.out.println("Op��o 1: a vista com 10% de desconto.");
		System.out.println("Op��o 2: em 2 vezes (Pre�o da etiqueta).");
		System.out.println("Op��o 3: de 3 at� 10 vezes com 3% de j�ros ao m�s (Somente para compras acima de R$100,00).");
		System.out.println("-----------------------------------------------------------------------------------------");
		op=ler.nextInt();
		if(op==1) {
				System.out.println("Voc� escolheu a op��o 1.");
				System.out.printf("O valor a vista de sua presta��o com 10% de desconto ser� de: R$ %.2f",op1(tg));
		}
		if(op==2) {
			System.out.println("Voc� escolheu a op��o 2.");
			System.out.printf("O valor da sua presta��o em 2 vezes � de: R$ %.2f",op2(tg));
			System.out.printf(", e o pre�o total � de: R$ %.2f",tg);
		}
		if(op==3) {
			System.out.println("Voc� escolheu a op��o 3.");
			System.out.println("Escolha uma parcela entre 3 at� 10 vezes:");
			jur=ler.nextInt();
			if(tg<100) {
				System.out.println("Este valor n�o � permitido!");
			}
			if(jur<3) {
				System.out.println("Este valor n�o � permitido!");
			}
			else if(jur>10) {
				System.out.println("Este valor n�o � permitido!");
			}
			else {
				System.out.printf("Voc� escolheu parcelar em "+jur+" vezes, e o valor de sua presta��o � de: R$ %.2f",op3(tg, jur));
			}
		}
	}
	public static double op1(double v1) {
		double resultado, por;
		por=v1*10/100;
		resultado=v1-por;
		return resultado;
	}
	public static double op2(double v1) {
		double resultado, div;
		div=v1/2;
		resultado=div;
		return resultado;
	}
	public static double op3(double v1, int v2) {
		double resultado, por, div=0;
		div=v1;
		for(int i=1; i<=v2; i++) {
			por=div*3/100;
			div=div+por;
		}
		resultado=div;
		return resultado;
	}
	
}