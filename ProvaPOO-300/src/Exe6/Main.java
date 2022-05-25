package Exe6;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String nome, email, telefone, instagram;
		
		RedeSocial [] redesocial = new RedeSocial [2];
		
		redesocial[0]=new RedeSocial ("Eugênio","eugenio.alves@newton.com.br","(31)99999-9999","eugenioalves");
		redesocial[1]=new RedeSocial ("Michele","michelle.hanne@newton.com.br","(31)99999-9999","mihellehanne");

		
		for(int i=0; i<redesocial.length; i++) {
			System.out.println(redesocial[i].mostraDados());
		}
		
		}
}
