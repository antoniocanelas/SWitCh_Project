package week8;

import java.util.Date;

public class TarefasConcluidas {

    private String descricao;
    private Date dataCriacao;

    private Date dataIniciada;

    private Date dataConcluida;

    public TarefasConcluidas() {

	// TODO Auto-generated constructor stub
    }

    public TarefasConcluidas(String descricao, Date dataCriacao, Date dataIniciada, Date dataConcluida) {

	super();
	this.descricao = descricao;
	this.dataCriacao = dataCriacao;
	this.dataIniciada = dataIniciada;
	this.dataConcluida = dataConcluida;
    }

    public String getDescricao() {

	return descricao;
    }

    @Override
    public String toString() {

	return "[descricao=" + descricao + ", dataCriacao=" + dataCriacao + ", dataIniciada=" + dataIniciada
		+ ", dataConcluida=" + dataConcluida + "]";
    }

    public void setDescricao(String descricao) {

	this.descricao = descricao;
    }

    public Date getDataCriacao() {

	return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {

	this.dataCriacao = dataCriacao;
    }

    public Date getDataIniciada() {

	return dataIniciada;
    }

    public void setDataIniciada(Date dataIniciada) {

	this.dataIniciada = dataIniciada;
    }

    public Date getDataConcluida() {

	return dataConcluida;
    }

    public void setDataConcluida(Date dataConcluida) {

	this.dataConcluida = dataConcluida;
    }

}
