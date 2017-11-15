package week8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Contactbook contactBook = new Contactbook();
	List<EnderecoPostal> enderecoPostal = new ArrayList<>();
	List<TarefasPendentes> tarefasPendentes = new ArrayList<>();
	List<TarefasConcluidas> tarefasConcluidas = new ArrayList<>();
	Contactbook colaboradores = new Contactbook();

	Person person1 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);
	Person person2 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	// colaboradores.contactAdd(person1);
	//
	// colaboradores.devolvePessoa("1").setName("Asdrubalx");
	// assertEquals("Asdrubalx", colaboradores.devolvePessoa("1").getName());
	//
	// person1.getContactBook().contactAdd(person2);
	// System.out.println(person1.getContactBook().toString());
	//
	// System.out.println(colaboradores.devolvePessoa("1").getContactBook().toString());

	person1.adicionarEnderecoPostal("Rua do Amial", "Porto", "4250000", "Portugal");
	person1.adicionarEnderecoPostal("Rossio", "Lisboa", "4250000", "Esp");

    }

}
