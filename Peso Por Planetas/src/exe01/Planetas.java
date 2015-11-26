package exe01;

public class Planetas {

	 int div = 10;
	 
	public double Mercúrio(double pesoTerra,double retornaPeso)
	{
		
		double pesoMercurio = 0.37;
		retornaPeso = pesoTerra / div;
		retornaPeso = retornaPeso * pesoMercurio;
		return retornaPeso;
		
	}
	
	public double Venus(double pesoTerra,double retornaPeso)
	{
		double pesoVenus = 0.88;
		retornaPeso = pesoTerra / div;
		retornaPeso = retornaPeso * pesoVenus;
		return retornaPeso;
		
	}

	public double Marte(double pesoTerra, double retornaPeso)
	{
		
		double pesoMarte = 0.38;
		retornaPeso = pesoTerra / div;
		retornaPeso = retornaPeso * pesoMarte;
		return retornaPeso;
		
	}
	
	public double Júpiter(double pesoTerra, double retornaPeso)
	{
		
		double pesoJúpiter = 2.64;
		retornaPeso = pesoTerra / div;
		retornaPeso = retornaPeso * pesoJúpiter;
		return retornaPeso;
		
	}
	
	public double Saturno(double pesoTerra, double retornaPeso)
	{
		double pesoSaturno = 1.15;
		retornaPeso = pesoTerra / div;
		retornaPeso = retornaPeso * pesoSaturno;
		return retornaPeso;
		
	}
	
	public double Urano(double pesoTerra, double retornaPeso)
	{
		
		double pesoUrano = 1.17;
		retornaPeso = pesoTerra / div;
		retornaPeso = retornaPeso * pesoUrano;
		return retornaPeso;
	}
	
	
	
	
	
	
	
}
