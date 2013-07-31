package listcont;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		float valor = 0;
		int i, m;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tamanho da lista");
		m = scanner.nextInt();
		TListCont1 l1 = new TListCont1(m);
		System.out.println("Digite um numero inteiro");
		for (i = 0; i < m; i++) {
			valor = scanner.nextFloat();
			l1.insereUlt(valor);
		}
		l1.imprime();
		scanner.close();
	}
}
