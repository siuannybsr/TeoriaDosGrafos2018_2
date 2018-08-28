package examples;

import java.io.Serializable;
import java.util.Map;

import org.jgrapht.io.Attribute;


/*
 * > Duvidas sobre como eh a implementacao de alguma classe ou metodo?
 * 
 * @link https://jgrapht.org/javadoc/ <- JavaDoc JGraphT
 * @link https://github.com/rcpoison/jgrapht <- GitHub JGraphT
 */
/**
 * Entidade que representa um vertice. Esse vertive possui um ID (identificador)
 * e um mapa de atributos relacionados. Ha tambem os metodos basicos: getID,
 * getLable, equals, hashCode e toString.
 */
public class DefaultVertex implements Serializable {

	/**
	 * Atributo responsavel pela compatibilidade de versoes.
	 */
	private static final long serialVersionUID = -4861285584479124799L;

	// Atributos do vertice
	private Object id;
	private Map<String, Attribute> att;

	/**
	 * Contrutor da classe DefaultVertex. Inicializa os atributos da classe de
	 * acordo com os parametros passados.
	 * 
	 * @param id  objeto identificador do vertice
	 * @param att atributos do vertice. (muito usado em importacao)
	 */
	public DefaultVertex(Object id, Map<String, Attribute> att) {
		this.id = id;
		this.att = att;
	}

	/**
	 * Metodo responsavel por retornar o id de um determinado vertice.
	 * 
	 * @return objeto contendo o id do vertice desejado.
	 */
	public Object getId() {
		return id;
	}

	/**
	 * Metodo responsavel por retornar o lable de um determinado vertice.
	 * 
	 * @return String contendo o lable do vertice desejado.
	 */
	public String getLabel() {
		return (att.get("label")).toString(); // captura o lable do vertice em seus atributos e retorna o toString deste.
	}

	/**
	 * Representacao inteira de um determinado vertice de acordo com a tabela hash.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * Metodo responsavel por realizar a comparacao entre dois vertices. Dois
	 * vertices sao considerados iguais quando possuem o mesmo id.
	 * 
	 * @param v vertice o qual deseja-se comparar.
	 * @return boolean sinalizando se os vertices sao iguais (true) ou nao (false).
	 */
	public boolean equals(DefaultVertex v) {
		return this.id.equals(v.id);
	}

	/**
	 * Representacao textual de um determinado vertice. O toString de um
	 * DefaultVertex eh composto basicamente por seu lable.
	 */
	public String toString() {
		return this.getLabel();
	}

}