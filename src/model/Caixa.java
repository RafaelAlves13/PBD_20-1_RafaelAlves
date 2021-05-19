package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "caixa")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = Caixa.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public class Caixa extends Entidade{

	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "caixa_sequence";

    @Column
    private double entrada;

    @Column
    private double saida;

    @Column
    private double saldo;

    @Column
    private double verTotal;

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public double getSaida() {
        return saida;
    }

    public void setSaida(double saida) {
        this.saida = saida;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getVerTotal() {
        return verTotal;
    }

    public void setVerTotal(double verTotal) {
        this.verTotal = verTotal;
    }
}
