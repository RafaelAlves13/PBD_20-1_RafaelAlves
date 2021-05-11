package model;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "compra")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = Compra.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public class Compra extends Entidade{
	
	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "compra_sequence";
    
    private String data; 
    
    private Produto produto;
    
    private double preco;
    
    private Fornecedor fornecedor;
    
    private int qnt;
        
}
