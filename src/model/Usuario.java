package model;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = Usuario.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public class Usuario extends Entidade{

	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "usuario_sequence";
   
    private String senha;
    
    private String login;
    
    private String nome;
    
    private boolean nivelAcesso;
    
}
