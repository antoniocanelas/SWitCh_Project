package week8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person {

	private String name;
	private String phoneNumber;
	private int nif;
	private String email;
	private Date dataNascimento;
	private ContactBook contactBook;
	private int numeroMecanografico;
	private List<EnderecoPostal> enderecoPostal;
	private List<TarefasConcluidas> tarefasConcluidas;
	private List<TarefasPendentes> tarefasPendentes;

	public Person(String name, String phoneNumber, int nif, String email, Date dataNascimento, ContactBook contactBook,
			int numeroMecanografico, List<EnderecoPostal> enderecoPostal, List<TarefasConcluidas> tarefasConcluidas,
			List<TarefasPendentes> tarefasPendentes) {

		enderecoPostal = new ArrayList<>();
		tarefasConcluidas = new ArrayList<>();
		tarefasPendentes = new ArrayList<>();

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

	public int getNif() {
		return nif;
	}

	public void setNif(int nif) {
		this.nif = nif;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public ContactBook getContactBook() {
		return contactBook;
	}

	public void setContactBook(ContactBook contactBook) {
		this.contactBook = contactBook;
	}

	public int getNumeroMecanografico() {
		return numeroMecanografico;
	}

	public void setNumeroMecanografico(int numeroMecanografico) {
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (nif != other.nif)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phoneNumber=" + phoneNumber + ", nif=" + nif + ", email=" + email
				+ ", dataNascimento=" + dataNascimento + ", contactBook=" + contactBook + ", numeroMecanografico="
				+ numeroMecanografico + ", enderecoPostal=" + enderecoPostal + ", tarefasConcluidas="
				+ tarefasConcluidas + ", tarefasPendentes=" + tarefasPendentes + "]";
	}

}
