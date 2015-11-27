package exe01;

public class Exe01 {

	public static void main(String[] args) {
		
		int num;
		double pesoTer,peso;
		char planetas ,op = 's';
		double res;
		
		while(op == 's'){
		
			System.out.print("Digite seu Peso: ");
			pesoTer = new java.util.Scanner(System.in).nextDouble();
		
			System.out.print("\nDigite o Planeta Escolhido: \n\t1-Mercurio\n \t2-Vênus\n \t3-Marte\n \t4-Júpiter\n \t5-Saturno\n \t6-Urano\n ");
			planetas = new java.util.Scanner(System.in).next().charAt(0);
		
			Planetas Resultado = new Planetas();
		
		
		  		switch(planetas){
					case '1':
					
						System.out.print("No Planeta Mercurio Seu Peso é: " + Resultado.Mercúrio(pesoTer,0));
						break;
					
					case '2':
					
						System.out.print("No Planeta Mercurio Seu Peso é: " + Resultado.Venus(pesoTer,0));
						break;
					
					case '3':

						System.out.print("No Planeta Marte Seu Peso é: " + Resultado.Marte(pesoTer,0));
						break;
					
					case '4':
						System.out.print("No Planeta Júpiter Seu Peso é: " + Resultado.Júpiter(pesoTer,0));
						break;
					
					case '5':
						System.out.print("No Planete Saturno Seu Peso é: " + Resultado.Saturno(pesoTer,0));
						break;
			
					case '6':
						System.out.print("No Planeta Urano Seu Peso é: " + Resultado.Urano(pesoTer,0));
						break;
					
					default:
						System.out.print("\nOpção Invalida!\t");
					
			}
			System.out.print("\nContinuar? s/n: ");
			op = new java.util.Scanner(System.in).next().charAt(0);
		}
		
	}

}
