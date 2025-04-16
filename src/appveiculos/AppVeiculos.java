// Define o pacote onde esta classe está localizada.
package appveiculos;

// Classe principal do programa, responsável pela execução do sistema de cadastro de veículos.
public class AppVeiculos {

    // Método principal que inicia a aplicação.
    public static void main(String[] args) {

        // Declara e inicializa um vetor de 20 elementos do tipo Veiculo (classe abstrata).
        // Como Veiculo é abstrata, os objetos reais serão instâncias das subclasses Aviao e Navio.
        Veiculo[] veiculos = new Veiculo[20];

        // Exibe mensagem informando início do cadastro de aviões.
        System.out.println("Cadastro de 10 aviões:");

        // Loop que cria e cadastra 10 objetos do tipo Aviao (índices de 0 a 9).
        for (int i = 0; i < 10; i++) {
            veiculos[i] = new Aviao();       // Instancia um novo objeto Aviao.
            veiculos[i].entrada();           // Chama o método de entrada de dados (polimorfismo).
        }

        // Exibe mensagem informando início do cadastro de navios.
        System.out.println("Cadastro de 10 navios:");

        // Loop que cria e cadastra 10 objetos do tipo Navio (índices de 10 a 19).
        for (int i = 10; i < 20; i++) {
            veiculos[i] = new Navio();       // Instancia um novo objeto Navio.
            veiculos[i].entrada();           // Chama o método de entrada de dados (polimorfismo).
        }

        // Exibe todos os veículos cadastrados.
        System.out.println("\nExibindo todos os veículos cadastrados:");

        // Loop que percorre o vetor de veículos e imprime os dados de cada um.
        for (Veiculo v : veiculos) {
            v.imprimir();                    // Chama o método imprimir da subclasse correspondente.
        }
    }
}