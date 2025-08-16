// Essa é a classe BoloDeFesta — ela é uma "versão especial" do Bolo comum
// Aqui usamos HERANÇA: BoloDeFesta é filha da classe Bolo
public class BoloDeFesta extends Bolo {

    // Esse é um atributo exclusivo do bolo de festa: número de camadas
    private int numeroDeCamadas;

    /*
     * Esse é o construtor da classe filha.
     * Quando criamos um BoloDeFesta, precisamos passar as infos do Bolo normal (sabor, preço, tamanho)
     * e também o número de camadas.
     * Usamos super() pra chamar o construtor da classe mãe (Bolo).
     */
    public BoloDeFesta(String sabor, double preco, int tamanho, int numeroDeCamadas) {
        super(sabor, preco, tamanho); // chama o construtor da classe Bolo
        this.numeroDeCamadas = numeroDeCamadas; // define o novo atributo
    }

    // Métodos get e set para acessar ou alterar o número de camadas
    public int getNumeroDeCamadas() {
        return numeroDeCamadas;
    }

    public void setNumeroDeCamadas(int numeroDeCamadas) {
        this.numeroDeCamadas = numeroDeCamadas;
    }

    /*
     * Aqui estamos sobrescrevendo (@Override) o método exibirInfo da classe mãe.
     * Isso significa que vamos mostrar as infos do Bolo normal + as infos extras do BoloDeFesta.
     * Usamos super.exibirInfo() pra reaproveitar o que já existe na classe mãe.
     */
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // mostra sabor, tamanho e preço
        System.out.println("Número de camadas: " + numeroDeCamadas); // mostra o extra
    }

    /*
     * Esse é um método exclusivo do BoloDeFesta.
     * Ele simula a decoração do bolo com base no número de camadas.
     * Aqui usamos getSabor() porque o atributo sabor está na classe mãe e é privado.
     */
    public void decorar() {
        System.out.println("O bolo de " + getSabor() + " foi decorado com " + numeroDeCamadas + " camadas!");
    }

    /*
     * Dica importante:
     * Quando a classe filha tem atributos ou comportamentos novos,
     * é legal sobrescrever os métodos da classe mãe pra incluir essas novidades.
     * E o super.metodo() ajuda a não repetir código — só adiciona o que for diferente.
     */
}
