package week8;

import java.util.Date;

public class TarefasPendentes {

    private String descricao;
    private Date dataCriacao;
    private Date dataIniciada;
    private Date dataConcluida;

    public String getDescricao() {

	return this.descricao;
    }

    public void setDescricao(String descricao) {

	this.descricao = descricao;
    }

    public Date getDataCriacao() {

	return this.dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {

	this.dataCriacao = dataCriacao;
    }

    public Date getDataIniciada() {

	return this.dataIniciada;
    }

    public void setDataIniciada(Date dataIniciada) {

	this.dataIniciada = dataIniciada;
    }

    public Date getDataConcluida() {

	return this.dataConcluida;
    }

    public void setDataConcluida(Date dataConcluida) {

	this.dataConcluida = dataConcluida;
    }

    public TarefasPendentes(String descricao, Date dataCriacao, Date dataIniciada, Date dataConcluida) {

	this.descricao = descricao;
	this.dataCriacao = dataCriacao;
	this.dataIniciada = dataIniciada;
	this.dataConcluida = dataConcluida;
    }

    @Override
    public String toString() {

	return "[descricao=" + this.descricao + ", dataCriacao=" + this.dataCriacao + ", dataIniciada="
		+ this.dataIniciada + ", dataConcluida=" + this.dataConcluida + "]";
    }

    public TarefasPendentes() {

    }

}
