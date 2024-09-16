package questao02;

import java.util.Scanner;

public class TemLetraA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palavra;
		int contadorDeA = 0;

		System.out.println("Insira uma palavra: ");
		palavra = sc.next();
		
		char[] palavraTemA;
		palavraTemA = new char[palavra.length()];
		
		for (int i = 0; i < palavra.length(); i++) {
			palavraTemA[i] = palavra.charAt(i);
		}
		
		for (int i = 0; i < palavraTemA.length; i++) {
			if(palavraTemA[i] == 'A' || palavraTemA[i] == 'a') {
				contadorDeA ++;
			}
		}
		
		if(contadorDeA > 0) {
			System.out.println("A palavra possui a letra 'A'");
			System.out.println("A letra 'A' aparece " + contadorDeA + " vezes");
		}else {
			System.out.println("Não tem a letra 'A'");
		}
	}

}
