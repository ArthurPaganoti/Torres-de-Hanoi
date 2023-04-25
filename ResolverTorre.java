public class ResolverTorre {

    // Este método usa recursão para mover os discos da torre de origem para a torre de destino, usando a torre auxiliar.
    // O número de movimentos realizados é retornado como um inteiro.
    public int resolverHanoi(int numeroDiscos, int torreOrigem, int torreDestino, int torreAuxiliar) {
        int movimentos = 0; // Começeara zerado de movimentos
        if (numeroDiscos == 1) {
            // Se houver apenas um disco, ele será movido diretamente da torre de origem para a torre de destino.
            System.out.println("Movendo disco da torre " + torreOrigem + " para a torre " + torreDestino);
            movimentos = 1; // Se a condição ocorrer o movimento será igual a 1
        } else {
            // Se houver mais de um disco, o método é chamado recursivamente para mover os discos da torre de origem para a torre auxiliar, usando a torre de destino como auxiliar.
            int movimentosUm = resolverHanoi(numeroDiscos - 1, torreOrigem, torreAuxiliar, torreDestino);
            // Em seguida, o maior disco é movido diretamente da torre de origem para a torre de destino.
            System.out.println("Movendo disco " + numeroDiscos + " da torre " + torreOrigem + " para a torre " + torreDestino);
            // Finalmente, o método é chamado recursivamente para mover os discos da torre auxiliar para a torre de destino, usando a torre de origem como auxiliar.
            int movimentosDois = resolverHanoi(numeroDiscos - 1, torreAuxiliar, torreDestino, torreOrigem);
            // O número total de movimentos realizados é calculado somando o número de movimentos realizados nas duas chamadas recursivas e adicionando 1 para o movimento direto do maior disco.
            movimentos = movimentosUm + movimentosDois + 1;
        }
        return movimentos;
    }

    // Este método formata um tempo em milissegundos em um formato de string amigável.
    public static String formatandoTempo(long duracaoTempo) {
        // O tempo é dividido em horas, minutos, segundos e milissegundos.
        long milisegundos = duracaoTempo % 1000;
        long segundos = (duracaoTempo / 1000) % 60;
        long minutos = (duracaoTempo / (1000 * 60)) % 60;
        long hora = (duracaoTempo / (1000 * 60 * 60)) % 24;
        // O tempo é formatado em uma string com zeros à esquerda para garantir que cada valor tenha dois dígitos.
        return String.format("%02d:%02d:%02d:%03d", hora, minutos, segundos, milisegundos);
    }
}