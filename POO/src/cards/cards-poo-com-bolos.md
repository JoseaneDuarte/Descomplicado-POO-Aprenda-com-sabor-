# 🍰 Descomplicado POO – Aprenda com Sabor

Aprenda os principais conceitos de **Programação Orientada a Objetos (POO)** em Java, de forma simples e divertida, usando a analogia de um bolo! 🎂

---

## 🃏 Card 1: O que é uma Classe?

📦 **Classe** é como uma receita de bolo.  
Ela diz o que o bolo tem e o que ele pode fazer.

```java
public class Bolo {
    private String sabor;
    private double preco;
    // ...
}

👉 Você ainda não tem um bolo real, só a ideia de como ele seria.

🃏 Card 2: O que é um Objeto?

🎂 Objeto é o bolo pronto!
Você usou a receita (classe) e criou um bolo de verdade.
Bolo meuBolo = new Bolo("chocolate", 30, 20);

Agora sim, temos um bolo com sabor, preço e tamanho definidos.
🃏 Card 3: Herança

🧬 Herança é quando uma classe filha puxa tudo da mãe —
tipo um bolo de festa que já é um bolo normal, mas com extras.
public class BoloDeFesta extends Bolo {
    private int numeroDeCamadas;
}

BoloDeFesta já tem sabor, preço e tamanho porque herdou de Bolo.

🃏 Card 4: Polimorfismo

🌀 Polimorfismo: mesma ação, diferentes comportamentos.
Cada tipo de bolo mostra suas informações do seu jeitinho.

bolo.exibirInfo();       // mostra infos básicas
bolofesta.exibirInfo();  // mostra infos + camadas


O método exibirInfo() se adapta ao tipo de bolo.

🃏 Card 5: Encapsulamento

🔐 Encapsulamento é guardar os ingredientes dentro da classe
e só deixar mexer com permissão.

private String sabor;

public String getSabor() { 
    return sabor; 
}


Protege os dados e controla o acesso com get e set.

🃏 Card 6: Abstração

🎭 Abstração foca só no que importa.
Não precisa saber como o bolo é feito por dentro, só como usar.

bolo.desconto(10);


Você usa o método sem se preocupar com os cálculos internos.

🃏 Card 7: Main vs Classes

▶️ Main vs Classes
As classes são as receitas. A Main é o chef que põe a mão na massa.

Bolo bolo1 = new Bolo("chocolate", 30, 20);
bolo1.exibirInfo();


Separar ajuda a manter o código limpo e organizado.

🃏 Card 8: Super e Override

🔁 super & @Override
Reaproveita o que já existe e só muda o que for necessário.

@Override
public void exibirInfo() {
    super.exibirInfo();
    System.out.println("Número de camadas: " + numeroDeCamadas);
}


Usa o método da mãe (super) e adiciona o toque especial da filha.
