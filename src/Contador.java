import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;
import excecao.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		int parametroUm = 0;
		int parametroDois = 0;
	
		try {  
			System.out.println("Digite o primeiro parâmetro");
			parametroUm = input.nextInt();
				
			System.out.println("Digite o segundo parâmetro");
			parametroDois = input.nextInt();
		} catch(InputMismatchException e){
			System.out.println("Por favor, digite um número inteiro.");
		}
		

		try {
			//chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
			
		} catch(ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(e.getMessage());
		}
		
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}

		int conta = parametroDois - parametroUm;
		
		//realizar o for para imprimir os números com base na variável contagem
        for(int count = 0; count <= conta; count ++)  {
            System.out.println(count + " - parâmetro(s)");
		} 
    }
	
	   
}
	
