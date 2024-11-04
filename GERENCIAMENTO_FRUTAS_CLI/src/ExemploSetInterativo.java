import java.util.HashSet; //Importação de Classes e Bibliotecas necessárias para funcionalidade do código
import java.nio.file.spi.FileSystemProvider;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

// Criação da Classe ExemploSetInterativo
public class ExemploSetInterativo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); // Cria o Objeto scanner para receber os números digitado
		Set<String> frutas = new HashSet<>(); // Cria um Set para armazenar nomes de frutas
		
		// Enquanto o usuário digitar os números dentre as opções, a operação continua
		while(true) {
			try {
				// Exibição das opções do Usuário
				System.out.println("\nEscolha uma opção:\n"); 
				System.out.println("1. Adicionar uma Fruta");
				System.out.println("2. Listar todas as Frutas");
				System.out.println("3. Remover uma Fruta");
				System.out.println("4. Verificar se uma Fruta está presente");
				System.out.println("5. Sair");
				System.out.println("------------------------------------------------");
				System.out.println("\nOpção: ");
				
				
				int opcao = scanner.nextInt(); // Váriavel que armazenará o número digitado pelo Usuário
				scanner.nextLine(); // Pula de linha após inserção do dígito
				
				// Inicialização do Switch de escolhas do Usuário
				switch(opcao) {
				case 1:  // Caso o Usuário escolha a Opção 1 (Adição de uma Fruta)
					System.out.println("Digite o nome da Fruta para adicionar");
					String novaFruta = scanner.nextLine(); // Armazena a Fruta inserida
				
					if (frutas.add(novaFruta)) {
						System.out.println(novaFruta+" foi adicionada."); // Se for uma Fruta nova, será informado que a mesma foi adicionada
					} else {
						System.out.println(novaFruta+" já está presente no conjunto."); // Se não for uma Fruta nova, será informado que a mesma  já está presente no conjunto
					}
					break; // Após informar a condição da Fruta digitada, as operações pararão
					
					
				case 2: // Caso o Usuário escolha a Opção 2 (Listar as Frutas contidas no conjunto)
					System.out.println("Frutas: "+frutas); // Exibição das Frutas contiudas no conjunto
					break; // Após informar as Frutas contidas, as operações pararão
				
					
				case 3: // Caso o Usuário escolha a Opção 3 (Remoção de uma Fruta)
					System.out.println("Digite o Nome da Fruta que deseja remover: "); // 
					String frutaRemover = scanner.nextLine(); // Armazena a Fruta que será removida
					
					if (frutas.remove(frutaRemover)) {
						System.out.println(frutaRemover + " foi removida"); // Se a Fruta existir no conjunto, será removida
					} else {
						System.out.println(frutaRemover + " não foi encontrada"); // Se a Fruta não existir no conjunto, será informado que a mesma não foi encontrada para ser removida
					}
					break; // Após realizar a remoção ou informar que a Fruta não existe no conjunto, as operações pararão
				
					
				case 4: // Caso o Usuário escolha a Opção 4 (Verificar se uma Fruta está presente)
					System.out.println("Digite o Nome da Fruta para verificar: ");
					String frutaVerificar = scanner.nextLine(); // Armazena a Fruta digitada para verificar se a mesma está no conjuntp
					
					if(frutas.contains(frutaVerificar)) {
						System.out.println(frutaVerificar + " está presente no conjunto."); // Se a Fruta digitada for localizada no conjunto, será informado que a mesma está presente
					} else {
						System.out.println(frutaVerificar + " não foi encontrada no conjunto"); // Se a Fruta digitada não for localizada no conjunto, será informado que a mesma não foi encontrada
					}
					break; // Após realização de consulta, as operações pararão
					
					
				case 5: // Caso o Usuário queira sair do sistema (Sair)
					System.out.println("Saindo..."); // Mensagem que informa a saída
					scanner.close();
					return; // Encerra o programa
				default:
					System.out.println("Opção inválida. Tente novamente."); // Caso o Usuário digite um número inválido
				}
				
				
			} catch (InputMismatchException e) {
                // Caso o Usuário insira algum tipo de dado incorreto no lugar dos dígitos designidados
				System.out.println("Entrada inválida. Por favor, digite um número.");
				scanner.nextLine();
			}
		}
	}
}
