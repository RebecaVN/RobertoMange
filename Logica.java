package EstruturaDeDecisaoLogica;

public class Logica {
	public static void main (String [] args) {
		
		int numero1 = -6;
		int numero2 = -5;
		int numero3 =  8;
		int numero4 =  9;
		
		int numeroTeste = numero3;
		
		if(numeroTeste > 0 & numeroTeste%2 == 0){
			System.out.println("O n�mero � positivo e divis�vel por 2.");
		}else{
			System.out.println("N�o � positivo ou n�o � par.");
		}		
	}
}
