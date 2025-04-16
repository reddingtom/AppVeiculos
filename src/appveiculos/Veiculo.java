// Pacote que organiza a classe dentro do projeto.
package appveiculos;

// Classe abstrata que representa um veículo genérico. 
// Não pode ser instanciada diretamente.
abstract class Veiculo {

    // Atributo protegido que armazena a capacidade do tanque de combustível.
    protected int capacidadeTanque;

    // Atributo protegido que indica o número de passageiros que o veículo comporta.
    protected int numeroPassageiros;

    // Atributo protegido que representa o preço do veículo.
    protected double preco;

    // Método getter para obter a capacidade do tanque.
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    // Método setter para definir a capacidade do tanque.
    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    // Método getter para obter o número de passageiros.
    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    // Método setter para definir o número de passageiros.
    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    // Método getter para obter o preço do veículo.
    public double getPreco() {
        return preco;
    }

    // Método setter para definir o preço do veículo.
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Construtor padrão (sem parâmetros).
    public Veiculo () {}

    // Construtor que inicializa todos os atributos.
    public Veiculo (int capacidadeTanque, int numeroPassageiros, double preco) {
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }

    // Construtor que inicializa apenas o número de passageiros.
    public Veiculo (int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    // Construtor que inicializa apenas o preço.
    public Veiculo (double preco) {
        this.preco = preco;
    }

    // Método abstrato que deve ser implementado pelas subclasses.
    // Geralmente usado para exibir as informações do veículo.
    public abstract void imprimir();

    // Outro método abstrato, a ser implementado pelas subclasses.
    // Pode ser usado para entrada de dados do veículo.
    public abstract void entrada();
}