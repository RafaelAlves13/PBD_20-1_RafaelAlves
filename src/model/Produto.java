package model;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = Produto.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public class Produto extends Entidade{
	
	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "produto_sequence";
    
    private String codigo;
    
    private String marca;
    
    private Fornecedor fornecedor;
    
    private String nome;
    
    
}
