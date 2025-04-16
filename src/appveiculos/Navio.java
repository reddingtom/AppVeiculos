// Define o pacote onde a classe está organizada dentro do projeto.
package appveiculos;

// Importa as classes necessárias para entrada de dados e tratamento de exceções.
import java.util.Scanner;
import java.util.InputMismatchException;

// Declara a classe pública 'Navio', que herda da classe abstrata 'Veiculo'.
public class Navio extends Veiculo {

    // Atributo privado que representa o nome do navio.
    private String nome;

    // Número de tripulantes a bordo do navio.
    private int numeroTripulantes;

    // Data de lançamento do navio (pode ser ano, ou data completa, dependendo do contexto).
    private String dataLancamento;

    // Getter: retorna o nome do navio.
    public String getNome() {
        return nome;
    }

    // Setter: define o nome do navio.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter: retorna a data de lançamento do navio.
    public String getDataLancamento() {
        return dataLancamento;
    }

    // Setter: define a data de lançamento do navio.
    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    // Construtor padrão (sem parâmetros), que chama o construtor da superclasse.
    public Navio () {
        super();
    }

    // Construtor que inicializa atributos básicos do veículo herdado (sem nome, tripulação ou data).
    public Navio (int capacidadeTanque, int numeroPassageiros, double preco) {
        super(capacidadeTanque, numeroPassageiros, preco);
    }

    // Construtor completo que inicializa todos os atributos do navio.
    public Navio (String nome, int capacidadeTanque, int numeroPassageiros, int numeroTripulantes, double preco, String dataLancamento) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }

    // Construtor que inicializa apenas os atributos específicos da classe Navio.
    public Navio (String nome, int numeroTripulantes, String dataLancamento) {
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }

    // Construtor que inicializa apenas número de passageiros e tripulantes.
    public Navio (int numeroPassageiros, int numeroTripulantes) {
        super(numeroPassageiros);
        this.numeroTripulantes = numeroTripulantes;
    }

    // Sobrescrita do método abstrato 'imprimir' da superclasse.
    // Exibe todos os dados relevantes do objeto Navio.
    @Override
    public void imprimir() {
        System.out.println("Navio - Nome: " + nome
            + ", Capacidade Tanque: " + capacidadeTanque
            + ", Passageiros: " + numeroPassageiros
            + ", Tripulantes: " + numeroTripulantes
            + ", Preço: " + preco
            + ", Data de Lançamento: " + dataLancamento);
    }

    // Sobrescrita do método abstrato 'entrada' da superclasse.
    // Permite ao usuário inserir os dados do navio via console.
    @Override
    public void entrada() {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o nome do navio: ");
            nome = scanner.nextLine();

            System.out.print("Digite a capacidade do tanque: ");
            capacidadeTanque = scanner.nextInt();

            System.out.print("Digite o número de passageiros: ");
            numeroPassageiros = scanner.nextInt();

            System.out.print("Digite o número de tripulantes: ");
            numeroTripulantes = scanner.nextInt();

            System.out.print("Digite o preço: ");
            preco = scanner.nextDouble();

            scanner.nextLine(); // Limpa o buffer após nextDouble()

            System.out.print("Digite a data de lançamento: ");
            dataLancamento = scanner.nextLine();

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Tente novamente.");
            scanner.nextLine(); // Limpa o buffer
            entrada(); // Chamada recursiva para repetir a entrada
        }
    }

    // Método adicional que calcula a média de passageiros por tripulante.
    public double passageirosPorTripulantes() {
    
        return (double) numeroPassageiros / numeroTripulantes;
    
    }

}
