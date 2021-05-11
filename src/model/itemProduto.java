package model;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "itemproduto")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = itemProduto.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public class itemProduto extends Entidade{
	
	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "intemproduto_sequence";
    
    private double precoVenda;
    
    private double precoCusto;
    
    private int qnt;
    
    private String dataEntrada;
    
    private String categoria;
    
    private String descricao;
    
}
