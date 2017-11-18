package week8;

import java.util.Date;
import java.util.List;

public class Person {

    private String name;
    private String phoneNumber;
    private String nif;
    private String email;
    private String dataNascimento;
    private Contactbook contactBook;
    private String numeroMecanografico;
    private List<EnderecoPostal> enderecoPostal;
    private List<TarefasConcluidas> tarefasConcluidas;
    private List<TarefasPendentes> tarefasPendentes;

    public Person(String name, String phoneNumber, String nif, String email, String dataNascimento,
	    Contactbook contactBook, String numeroMecanografico, List<EnderecoPostal> enderecoPostal,
	    List<TarefasConcluidas> tarefasConcluidas, List<TarefasPendentes> tarefasPendentes) {

	this.name = name;
	this.phoneNumber = phoneNumber;
	this.nif = nif;
	this.email = email;
	this.dataNascimento = dataNascimento;
	this.contactBook = contactBook;
	this.numeroMecanografico = numeroMecanografico;
	this.enderecoPostal = enderecoPostal;
	this.tarefasConcluidas = tarefasConcluidas;
	this.tarefasPendentes = tarefasPendentes;
    }

    public void adicionarEnderecoPostal(String morada, String cidade, String codigoPostal, String pais) {

	EnderecoPostal novoEnderecoPostal = new EnderecoPostal(morada, cidade, codigoPostal, pais);

	enderecoPostal.add(novoEnderecoPostal);
    }

    public void alterarEnderecoPostal(int index, String morada, String cidade, String codigoPostal, String pais) {

	enderecoPostal.get(index).setMorada(morada);
	enderecoPostal.get(index).setCidade(cidade);
	enderecoPostal.get(index).setCodigoPostal(codigoPostal);
	enderecoPostal.get(index).setPais(pais);

    }

    public void eliminarEnderecoPostal(int index) {

	enderecoPostal.remove(index);

    }

    public void adicionarTarefas(String descricao, Date dataCriacao, Date dataIniciada, Date dataConcluida) {

	TarefasPendentes novaTarefa = new TarefasPendentes(descricao, dataCriacao, dataIniciada, dataConcluida);
	tarefasPendentes.add(novaTarefa);
    }

    public void marcarConcluido(int index) {

	TarefasConcluidas tarefaConcluida = new TarefasConcluidas(tarefasPendentes.get(index).getDescricao(),
		tarefasPendentes.get(index).getDataCriacao(), tarefasPendentes.get(index).getDataIniciada(),
		tarefasPendentes.get(index).getDataConcluida());

	tarefasConcluidas.add(tarefaConcluida);

	tarefasPendentes.remove(index);

    }

    public void removerTarefa(int index) {

	tarefasPendentes.remove(index);

    }

    public String getName() {

	return name;
    }

    public void setName(String name) {

	this.name = name;
    }

    public String getPhoneNumber() {

	return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

	this.phoneNumber = phoneNumber;
    }

    public String getNif() {

	return nif;
    }

    public void setNif(String nif) {

	this.nif = nif;
    }

    public String getEmail() {

	return email;
    }

    public void setEmail(String email) {

	this.email = email;
    }

    public String getDataNascimento() {

	return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {

	this.dataNascimento = dataNascimento;
    }

    public Contactbook getContactBook() {

	return contactBook;
    }

    public void setContactBook(Contactbook contactBook) {

	this.contactBook = contactBook;
    }

    public String getNumeroMecanografico() {

	return numeroMecanografico;
    }

    public void setNumeroMecanografico(String numeroMecanografico) {

	this.numeroMecanografico = numeroMecanografico;
    }

    public List<EnderecoPostal> getEnderecoPostal() {

	return enderecoPostal;
    }

    public void setEnderecoPostal(List<EnderecoPostal> enderecoPostal) {

	this.enderecoPostal = enderecoPostal;
    }

    public List<TarefasConcluidas> getTarefasConcluidas() {

	return tarefasConcluidas;
    }

    public void setTarefasConcluidas(List<TarefasConcluidas> tarefasConcluidas) {

	this.tarefasConcluidas = tarefasConcluidas;
    }

    public List<TarefasPendentes> getTarefasPendentes() {

	return tarefasPendentes;
    }

    public void setTarefasPendentes(List<TarefasPendentes> tarefasPendentes) {

	this.tarefasPendentes = tarefasPendentes;
    }

    @Override
    public boolean equals(Object obj) {

	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	Person other = (Person) obj;
	if (nif == null) {
	    if (other.nif != null) {
		return false;
	    }
	} else if (!nif.equals(other.nif)) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {

	return "Colaborador [name=" + name + ", phoneNumber=" + phoneNumber + ", nif=" + nif + ", email=" + email
		+ ", dataNascimento=" + dataNascimento + ", numeroMecanografico=" + numeroMecanografico
		+ ", enderecoPostal=" + enderecoPostal + ", tarefasConcluidas=" + tarefasConcluidas
		+ ", tarefasPendentes=" + tarefasPendentes + "]";
    }

}
