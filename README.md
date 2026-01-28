# 🎬 ScreenMatch


## 📝 Descrição

O **ScreenMatch** é uma aplicação Java focada em Orientação a Objetos, simulando o backend de um serviço de streaming. O sistema modela filmes e séries, calcula o tempo necessário para maratonas e possui um sistema de recomendação baseado em classificações e visualizações.

Projeto desenvolvido durante a formação Java da **Alura**.

## 🔨 Funcionalidades

- **Modelagem de Domínio:** Classes representando `Filme`, `Serie` e `Episodio` com herança compartilhada de `Titulo`.
- **Cálculo de Maratona:** A classe `CalculadoraDeTempo` soma automaticamente a duração de todos os títulos (considerando temporadas e episódios para séries).
- **Sistema de Classificação:** Interface `Classificavel` que padroniza como filmes e episódios são avaliados:
  - **Filmes:** Baseado na média das notas (0 a 10).
  - **Episódios:** Baseado no número de visualizações (> 100 views ganha destaque).
- **Motor de Recomendação:** A classe `FiltroRecomendacao` sugere conteúdos filtrando os "Preferidos do Momento" e "Bem Avaliados".

## 🛠️ Tecnologias e Conceitos

- **Java 17**
- **Paradigma OO:**
  - **Herança:** `Filme extends Titulo`, `Serie extends Titulo`.
  - **Polimorfismo:** `CalculadoraDeTempo` aceita qualquer objeto do tipo `Titulo`.
  - **Interfaces:** Uso de `Classificavel` para desacoplar a lógica de recomendação.
  - **Encapsulamento:** Atributos privados protegidos por Getters e Setters.

## 📂 Como rodar o projeto

1. Clone o repositório.
2. Abra o projeto na sua IDE (IntelliJ/Eclipse).
3. Localize a classe `alura.screenmatch.Principal.Principal.java` em `alura.screenmatch.principal`.
4. Execute o método `main`.

Exemplo de Saída no Console:
```text
nome do filme: O Poderoso Chefão
ano de lançamento: 1970
...
Tamanho da lista: 3
Primeiro filme: Dogville
