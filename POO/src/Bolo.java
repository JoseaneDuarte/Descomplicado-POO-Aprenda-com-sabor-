 
    // Essa é a nossa classe Bolo — ela representa um bolo com sabor, preço e tamanho
    public class Bolo {

    // Aqui estão os atributos, ou seja, as características do bolo
    private String sabor;     // O sabor do bolo (ex: chocolate, morango)
    private double preco;     // O preço do bolo em reais
    private int tamanho;      // O tamanho do bolo em centímetros

    /*
     * Esse é o construtor da classe.
     * Ele é chamado automaticamente quando a gente cria um novo bolo.
     * É como se fosse a "receita" inicial: define o sabor, o preço e o tamanho.
     */
    public Bolo(String sabor, double preco, int tamanho) {
        this.sabor = sabor;       // "this" se refere ao atributo da classe
        this.preco = preco;
        this.tamanho = tamanho;
    }

    // Agora vêm os métodos "get" e "set" — eles servem pra acessar e alterar os atributos

    // Esse método devolve o sabor do bolo
    public String getSabor() {
        return sabor;
    }

    // Esse método permite mudar o sabor do bolo
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    // Esse método devolve o preço atual do bolo
    public double getPreco() {
        return preco;
    }

    // Esse método permite alterar o preço do bolo
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Esse método devolve o tamanho do bolo
    public int getTamanho() {
        return tamanho;
    }

    // Esse método permite mudar o tamanho do bolo
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    // Agora vamos aos métodos que fazem o bolo "agir" — são as ações que ele pode executar

    // Esse método mostra as informações do bolo no console
    public void exibirInfo() {
        System.out.println("Bolo de " + sabor + ", tamanho " + tamanho + " cm, preço: R$ " + preco);
    }

    // Esse método aplica um desconto no preço do bolo
    public void desconto(double porcentagem) {
        // Calcula o valor do desconto e atualiza o preço
        preco = preco - (preco * (porcentagem / 100));
        System.out.println("Desconto aplicado! Novo preço: R$ " + preco);
    }
}



