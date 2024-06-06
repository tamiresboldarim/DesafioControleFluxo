import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {
	public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
	
		    
        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		    
        System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		

		try {
			//chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
			
		}catch (InputMismatchException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(e.getMessage());
		}
		
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		} else{
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for(parametroUm = 0; parametroUm <= parametroDois; parametroUm++ ) {
            System.out.println(parametroUm + " - parâmetro(s)");
		}  
       }
		
    }
	
}