package model;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = Cliente.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public class Cliente extends Entidade {
	
	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "cliente_sequence";
	
    private int sexo;
    
    private int dataNasc;
    
}
