package model;


import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "caixa")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = Caixa.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public class Caixa extends Entidade{

	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "caixa_sequence";
    
    private boolean fecharCaixa;
    
    private int addDinheiro;
    
    private int retirarDinheiro;
    
    private String verTotal;
	
}
