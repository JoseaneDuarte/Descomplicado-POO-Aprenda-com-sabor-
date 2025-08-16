public class App {        

    public static void main(String[] args) {

        // 🌰 Criando dois bolos simples (da classe Bolo)
        Bolo bolo1 = new Bolo("chocolate", 30, 20); // sabor, preço, tamanho
        Bolo bolo2 = new Bolo("ameixa", 25, 15);

        // 📋 Mostrando as infos do primeiro bolo
        bolo1.exibirInfo(); // mostra sabor, preço e tamanho
        bolo1.desconto(10); // aplica 10% de desconto

        System.out.println("-----------------------------------");

        // 📋 Mostrando as infos do segundo bolo
        bolo2.exibirInfo();
        bolo2.desconto(15); // aplica 15% de desconto

        System.out.println("____________alterando atributos__________");

        // ✏️ Mudando o sabor e o preço do segundo bolo
        bolo2.setSabor("laranja");
        bolo2.setPreco(20);

        // 📋 Mostrando as infos atualizadas
        bolo2.exibirInfo();
        bolo2.desconto(5); // aplica 5% de desconto

        System.out.println("____________novo produto__________________________________________");

        // 🎉 Criando um bolo de festa (classe filha BoloDeFesta)
        BoloDeFesta bolofesta = new BoloDeFesta("prestígio", 100, 30, 2); // sabor, preço, tamanho, camadas

        // 📋 Mostrando as infos do bolo de festa (inclui número de camadas)
        bolofesta.exibirInfo();

        // 🎀 Decorando o bolo de festa
        bolofesta.decorar();

        // 🧁 Aqui você viu herança e polimorfismo em ação:
        // - bolofesta é um BoloDeFesta, mas também é um Bolo (herança)
        // - exibirInfo() se comporta diferente dependendo do tipo de bolo (polimorfismo)

    }
}


