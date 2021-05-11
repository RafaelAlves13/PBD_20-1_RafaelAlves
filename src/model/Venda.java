package model;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "venda")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = Venda.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public class Venda extends Entidade{
	
	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "produto_sequence";
    
    private String produto;
    
    private Cliente cliente;
    
    private String data;
    
    private double precoTotal;
    
    private int qnt;
    
    private double desconto;
    
}
