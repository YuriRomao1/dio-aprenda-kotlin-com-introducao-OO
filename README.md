# Aprenda Kotlin Com Exemplos: Desafio de Projeto (Lab)

Desafio de Projeto criado para avaliação do conteúdo técnico explorado no repositório [aprenda-kotlin-com-exemplos](https://github.com/digitalinnovationone/aprenda-kotlin-com-exemplos). **Nesse contexto, iremos abstrair o seguinte domínio de aplicação:**

**A [DIO](https://web.dio.me) possui `Formacoes` incríveis que têm como objetivo oferecer um conjunto de `ConteudosEducacionais` voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho. `Formacoes` possuem algumas características importantes, como `nome`, `nivel` e seus respectivos `conteudosEducacionais`. Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio, definido pela capacidade de `matricular` um ou mais `Alunos`.**

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Projeto: Sistema de Matrícula em Formaçōes Educacionais
Este projeto é uma aplicação em Kotlin que simula um sistema de matrículas em formações educacionais. O sistema permite que os usuários se inscrevam em diferentes formações que consistem em uma série de conteúdos educacionais voltados para uma stack tecnológica específica. A aplicação visa praticar conceitos de orientação a objetos (OO) e boas práticas de desenvolvimento em Kotlin.


## Funcionalidades
A aplicação contém as seguintes funcionalidades principais:

Formação: Representa um conjunto de conteúdos educacionais com um nome e nível de dificuldade (Básico, Intermediário ou Difícil). Cada formação pode ter vários alunos inscritos.
Matrícula de Alunos: Usuários podem se matricular em diferentes formações. Ao se inscrever, o nome do aluno é registrado na lista de inscritos da formação.
Conteúdos Educacionais: Cada formação contém uma lista de conteúdos educacionais, onde cada conteúdo tem um nome e uma duração (em minutos).
Listagem de Inscritos: É possível listar os alunos que estão matriculados em uma determinada formação.

## Estrutura do Código
Nivel: Enumeração que define os três níveis de dificuldade de uma formação: BASICO, INTERMEDIARIO, DIFICIL.
Usuario: data class que representa o aluno com um atributo nome.
ConteudoEducacional: data class que representa um conteúdo educacional com dois atributos: nome e duracao (tempo em minutos).
Formacao: Classe que representa uma formação. Ela contém:
nome: Nome da formação.
conteudos: Uma lista de conteúdos educacionais que fazem parte da formação.
nivel: O nível de dificuldade da formação.
inscritos: Uma lista de alunos matriculados na formação.
Métodos para matricular alunos e listar os inscritos.

## Como Funciona
Ao rodar a aplicação, os seguintes cenários são simulados:

Criação de Conteúdos: São criados três conteúdos educacionais: Kotlin, Java, e Desenvolvimento Web, com diferentes durações.
Criação de Formação: Uma formação chamada "Desenvolvedor Fullstack" é criada com os três conteúdos educacionais e nível "Intermediário".
Matrícula de Usuários: Três usuários (Alice, Bob, e Carol) são matriculados na formação.
Listagem de Inscritos: O sistema exibe os nomes dos alunos que estão matriculados na formação.

```
Exemplo de Saída
Usuário Alice foi matriculado na formação Desenvolvedor Fullstack.
Usuário Bob foi matriculado na formação Desenvolvedor Fullstack.
Usuários matriculados na formação Desenvolvedor Fullstack:
- Alice
- Bob
Usuário Carol foi matriculado na formação Desenvolvedor Fullstack.
Usuários matriculados na formação Desenvolvedor Fullstack:
- Alice
- Bob
- Carol
```

### Como Executar
Para executar este projeto, basta rodar o método main que está no arquivo principal. Isso pode ser feito usando qualquer IDE que suporte Kotlin, como IntelliJ IDEA ou VS Code com suporte para Kotlin.


### Melhoria Contínua
Este projeto foi desenvolvido com boas práticas de orientação a objetos e encapsulamento. Futuras melhorias podem incluir:

Validação de dados durante a matrícula.
Implementação de diferentes tipos de formações com conteúdo específico.
Persistência de dados usando banco de dados ou arquivos.
