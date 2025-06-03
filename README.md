1 - Explique por que é considerado boa prática usar getters e setters em vez de tornar os atributos públicos em uma classe. Dê um exemplo onde usar um setter permite controlar melhor a integridade dos dados de um objeto.

R: 
  A orientação a objetos surgiu com o intuito de tornar a programação mais próxima ao mundo real, e o conceito de encapsulamento é um dos exemplos que representa isso.
Quando indico um atributo com o modificador de acesso private, estou dizendo para o meu programa que aquele atributo não deve ser acessado ou modificado por outra classe que não seja aquela a qual o atributo pertença, fazendo com que os meus atributos não sejam vistos ou alterados por todo mundo. Para isso, cria-se os métodos getters e setters, os getters para recuperar um valor e os setters para alterar um valor.

Um exemplo simples de aplicação errada desse conceito seria o seguinte:
````
public class Filme {
	int anoDeLançamento;
}
````
Com o método declarado dessa maneira, o acesso ao atributo anoDeLancamento poderá ser alterado de qualquer lugar, tornando a informação algo inconstante. Ao invés disso, a melhor alternativa seria:

````
public class Filme {
	private int anoDeLancamento;

	public int getAnoDeLancamento {
		return anoDeLancamento;
	}

	public int setAnoDeLancamento (int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento ;
}
}
````

2 - Considere que você está modelando um sistema de controle de biblioteca.
Responda:
Quais informações você considera relevantes para representar um livro em um sistema?
Por que podemos dizer que uma classe Livro seria uma abstração no seu código?
Liste ao menos 3 métodos que fariam sentido existir nessa classe.

R:

A - Título, Número de páginas, autor edata de lançamento.

B  - Uma classe classe livro pode ser considerada uma abstração pelo fato de que em orientação a objetos, uma abstração consiste em modelar identidades do mundo real destacando somente os atributos e comportamentos mais importantes para o contexto do programa.

C - métodos getters de acesso como getNumeroPaginasa(), getTitulo(), getAutor(), além de métodos que simulam comportamentos como estaDisponivel() e emprestar().










