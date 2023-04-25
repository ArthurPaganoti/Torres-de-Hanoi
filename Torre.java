import java.util.Scanner; // Importação da classe Scanner

public class Torre { // Início da classe Torre
    public static void main(String[] args) { // Início do método principal

        Scanner sc = new Scanner(System.in); // Instanciação da classe Scanner

        ResolverTorre torre = new ResolverTorre(); // Instanciação da classe ResolverTorre

        int quantidadeDiscos; // Declaração da variável para armazenar a quantidade de discos
        int movimentos; // Declaração da variável para armazenar o número de movimentos
        long inicioJogo; // Declaração da variável para armazenar o início do jogo
        long finalJogo; // Declaração da variável para armazenar o fim do jogo
        long totalDuracao; // Declaração da variável para armazenar a duração total do jogo

        System.out.println("==============================");
        System.out.println("Digite a quantidade de discos"); // Impressão na tela da mensagem para digitar a quantidade de discos
        System.out.println("==============================");
        quantidadeDiscos = sc.nextInt(); // Leitura da quantidade de discos digitada pelo usuário

        inicioJogo = System.currentTimeMillis(); // Armazenamento do tempo atual em milissegundos

        movimentos = torre.resolverHanoi(quantidadeDiscos,1,2,3); // Chamada do método resolverHanoi da classe ResolverTorre para resolver o problema das Torres de Hanoi

        finalJogo = System.currentTimeMillis(); // Armazenamento do tempo atual em milissegundos
        totalDuracao = finalJogo - inicioJogo; // Cálculo da duração total do jogo

        System.out.println("==============================");
        System.out.println("O número de movimentos foi: " + movimentos); // Impressão na tela do número de movimentos
        System.out.println("Tempo gasto: " + ResolverTorre.formatandoTempo(totalDuracao)); // Impressão na tela da duração total do jogo formatada
        System.out.println("==============================");
    }
}