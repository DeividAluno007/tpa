import java.util.Scanner;
public class E4 {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		int m[][]=new int[4][4];
		int i=0, j, a, cont=0, k=0, x, win=0, help=0;
		int num[]=new int[16];
		for(a=0;a<num.length;a++){
			int rand=(int)((Math.random()*74)+1);
			boolean existe=false;
			for(int grr=0;grr<a;grr++){
				if(num[grr]==rand){
					existe=true;
					break;
				}
				else{
					existe=false;
				}
			} 
			if(!existe){
				num[a]=rand; 
			}
			else{
				a--;
			}
        }
		for(i=0, help=0; i<=3; i++) {
			for(j=0; j<=3; j++) {
				m[i][j]=num[help];
				help++;
			}
		}
		for(i=0; i<=3; i++) {
			for(j=0; j<=3; j++) {
				System.out.print("[ "+m[i][j]+" ]");
				if(j==3) {
					System.out.print("\n");
				}
			}
		}
		System.out.println(" ");
		while(k==0) {
			System.out.println("Cante um n�mero:");
			x=ler.nextInt();
			for(i=0; i<=3; i++) {
				for(j=0; j<=3; j++) {
					if(x==m[i][j]) {
						win++;
					}
				}
			}
			if(win==16) {
				k+=1;
			}
			else {
				k+=0;
			}
			cont++;
		}
		System.out.println("------");
		System.out.println("BINGO!");
		System.out.println("------");
		System.out.println("O jogador conseguiu no "+cont+"� n�mero");
	}
}