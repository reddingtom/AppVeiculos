// Define o pacote onde esta classe está organizada no projeto.
package appveiculos;

// Importa a classe Scanner para entrada de dados pelo teclado.
import java.util.Scanner;

// Importa a exceção que trata erros de tipo na entrada (ex: digitar texto quando espera-se número).
import java.util.InputMismatchException;

// Declara a classe pública Aviao que herda (extends) de Veiculo.
public class Aviao extends Veiculo {

    // Atributo privado que representa o prefixo do avião (identificação única).
    private String prefixo;

    // Atributo privado que armazena a data da última revisão do avião.
    private String dataRevisao;

    // Getter: retorna o valor do prefixo.
    public String getPrefixo() {
        return prefixo;
    }

    // Setter: define o valor do prefixo.
    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    // Getter: retorna a data da última revisão.
    public String getDataRevisao() {
        return dataRevisao;
    }

    // Setter: define a data da última revisão.
    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    // Construtor padrão que chama o construtor da superclasse (Veiculo).
    public Aviao () {
        super();
    }

    // Construtor completo: inicializa todos os atributos do avião.
    public Aviao (String prefixo, int capacidadeTanque, int numeroPassageiros, double preco, String dataRevisao) {
        super(capacidadeTanque, numeroPassageiros, preco); // Chama o construtor da superclasse
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
    }

    // Construtor alternativo: apenas o preço é inicializado, o restante pode ser definido depois.
    public Aviao (double preco) {
        super(preco);
    }

    // Sobrescrita do método abstrato imprimir da superclasse.
    // Exibe todos os dados do objeto avião.
    @Override
    public void imprimir() {
        System.out.println("Avião - Prefixo: " + prefixo 
            + ", Capacidade Tanque: " + capacidadeTanque 
            + ", Passageiros: " + numeroPassageiros 
            + ", Preço: " + preco 
            + ", Data de Revisão: " + dataRevisao);
    }

    // Sobrescrita do método abstrato entrada da superclasse.
    // Solicita ao usuário que digite os dados do avião via console.
    @Override
    public void entrada() {

        // Criação de objeto Scanner para entrada de dados.
        Scanner scanner = new Scanner(System.in);

        try {
            // Leitura dos dados do usuário
            System.out.print("Digite o prefixo do avião: ");
            prefixo = scanner.nextLine();

            System.out.print("Digite a capacidade do tanque: ");
            capacidadeTanque = scanner.nextInt();

            System.out.print("Digite o número de passageiros: ");
            numeroPassageiros = scanner.nextInt();

            System.out.print("Digite o preço: ");
            preco = scanner.nextDouble();

            scanner.nextLine(); // Limpa o buffer do Scanner após nextDouble()

            System.out.print("Digite a data da última revisão: ");
            dataRevisao = scanner.nextLine();

        } catch (InputMismatchException e) {
            // Captura e trata entradas inválidas (ex: letras onde se esperava número)
            System.out.println("Erro: Entrada inválida. Tente novamente.");
            scanner.nextLine(); // Limpa o buffer
            entrada(); // Chama o método novamente (recursivamente)
        }
    }

    // Método adicional: reajusta o preço do avião com base em um percentual informado.
    public double reajustarPreco(double percentual) {
        // Aumenta o preço com base no percentual e retorna o novo valor.
        return preco += preco * (percentual / 100);
    }

}
