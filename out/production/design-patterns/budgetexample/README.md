## A review on Design Pattern - Templated Method
#### Notes:
- Crio um novo método abstrato na classe mae "Desconto", que obriga as classes filhas o implementarem.
- Substituo os if e mando para o novo método "deveAplicar", que é um método booleano que retorna a condição.
- A classe Desconto (classe mae), fica a logica o processo de calculo de aplicar o desconto.
- Verifica se tem que ser aplicado, se tiver que ser -> aplica, se não -> chama o proximo.
- As classe-filhas só dizem se tem que ser aplicado e o calculo em si.
- Toda regra que estava repetida nas classes-filhas é extraída pra classe-mãe.

- O método calcular na classe Desconto é o "método template", um modelo. Ele faz parte do processo, mas outra parte ele delega.
- Ele faz o if para verificar se tem que ser aplicado. Se tiver que ser aplicado, ele chama o calculo, se não ele chama o proximo.
- Ele não faz o processo com um todo, pois chama o método deveAplicar(), que é um método abstrato na classe Desconto.
- Na classe-mãe ele faz o if, que é um pedaço do processo (fazer o if), mas a lógica dentro do if está sendo delegada para cada uma das classes-filhas.
- Se passar o if, ele chama o método efetuarCalculo, que também é abstrato, sendo assim, chama a logica da classe-filha.

- Continuação do https://github.com/marciodegan/design-patterns
- Curso: https://www.alura.com.br/curso-online-introducao-design-patterns-java
