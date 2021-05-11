package model;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = Endereco.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public class Endereco extends Entidade{
	
	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "endereco_sequence";
 
    private String cidade;
    
    private String bairro;
    
    private String estado;
    
    private String cep;
    
    private String numero;
    
    private String logradouro;
    
    private String complemento;
    
}
