package exe01;

public class Exe01 {

	
	 
	public static void main(String[] args) {
		
		int num;
		double pesoTer,peso;
		char planetas ,op = 's';
		double res;
		
		while(op == 's')
		{
		
			System.out.print("Digite seu Peso: ");
			pesoTer = new java.util.Scanner(System.in).nextDouble();
		
			System.out.print("\nDigite o Planeta Escolhido: \n\t1-Mercurio\n \t2-Vênus\n \t3-Marte\n \t4-Júpiter\n \t5-Saturno\n \t6-Urano\n ");
			planetas = new java.util.Scanner(System.in).next().charAt(0);
		
			Planetas Resultado = new Planetas();
		
		
				switch(planetas)
				{
					case '1':
					
						res = Resultado.Mercúrio(pesoTer,0);
						System.out.print("No Planeta Mercurio Seu Peso é: " + res);
						break;
					
					
						case '2':
					
							res = Resultado.Venus(pesoTer,0);
							System.out.print("No Planeta Mercurio Seu Peso é: " + res);
							break;
					
						case '3':

							res = Resultado.Marte(pesoTer,0);
							System.out.print("No Planeta Marte Seu Peso é: " + res);
							break;
					
						case '4':
							res = Resultado.Júpiter(pesoTer,0);
							System.out.print("No Planeta Júpiter Seu Peso é: " + res);
							break;
					
						case '5':
							res = Resultado.Saturno(pesoTer,0);
							System.out.print("No Planete Saturno Seu Peso é: " + res);
							break;
				
						case '6':
							res = Resultado.Urano(pesoTer,0);
							System.out.print("No Planeta Urano Seu Peso é: " + res);
							break;
					
						default:
							System.out.print("\nOpção Invalida!\t");
					
			}
						System.out.print("\nContinuar? s/n: ");
						op = new java.util.Scanner(System.in).next().charAt(0);
		}
		
	}

}
