# 🐾 Sistema de Herança em Java - Classe Animal

Este repositório contém um exemplo prático de **herança em Java**, utilizando classes abstratas e polimorfismo. O código demonstra uma hierarquia de classes para representar **animais**, incluindo mamíferos e cães.

## 📌 Estrutura do Código

- **`Animal` (classe abstrata)**: Classe base com atributos comuns como peso, idade e número de membros. Possui um método abstrato `fazerSom()`, que será implementado nas subclasses.
- **`Mamifero` (herda de `Animal`)**: Adiciona o atributo `corPelo` e implementa o método `fazerSom()`.
- **`Cachorro` (herda de `Mamifero`)**: Adiciona o atributo `raca`, sobrescreve `fazerSom()` e inclui o método `abanarRabo()`.

## 🚀 Funcionalidades

- **Criação de objetos da classe `Cachorro`** com nome, peso, idade, membros, cor do pelo e raça.
- **Uso do método `toString()`** para exibir as informações do animal.
- **Demonstração de polimorfismo** com a sobrescrita do método `fazerSom()`.

## 🎭 Estudo do Polimorfismo

O polimorfismo é um dos pilares da programação orientada a objetos e permite que um mesmo método tenha diferentes comportamentos dependendo da classe que o implementa. No nosso código:

- O método `fazerSom()` é declarado na classe `Animal` como **abstrato**.
- A classe `Mamifero` implementa `fazerSom()` de forma genérica.
- A classe `Cachorro` sobrescreve `fazerSom()` para representar um latido (`"Au Au!"`).
- Isso permite que, ao chamar `fazerSom()` em um objeto do tipo `Animal`, o método adequado seja executado, dependendo da instância real do objeto.

### **Exemplo de Ação**:
```java
Cachorro meuCachorro = new Cachorro(20.1f, 5, 4, "preto", "Rex");
meuCachorro.fazerSom(); // Saída: Cachorro latindo: Au Au!
meuCachorro.abanarRabo(); // Saída: Cachorro abanando o rabo
meuCachorro.alimentar(); // Saída: Cachorro comendo
```

Isso ocorre porque `meuAnimal` é do tipo `Animal`, mas a instância real é `Cachorro`, então a implementação de `fazerSom()` da classe `Cachorro` é utilizada.


## 📌 Exemplo de Saída
```sh
Nome: Rex
Peso: 10.5
Idade: 5
Membros: 4
Cor do Pelo: Marrom
Cachorro latindo: Au Au!
Cachorro abanando o rabo...
Cachorro comendo ... 
```

## 📜 Licença
Este projeto é de código aberto e pode ser utilizado para fins educacionais.

---

Se gostou do projeto, ⭐ **star no repositório!**

📩 **Contribuições são bem-vindas!** Feel free para abrir uma issue ou um pull request. 😊

