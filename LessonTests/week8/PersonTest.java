package week8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Test;

public class PersonTest {

    @Test
    public void EqualsTrue() {

	Contactbook contactBook = new Contactbook();
	List<EnderecoPostal> enderecoPostal = new ArrayList<>();
	List<TarefasPendentes> tarefasPendentes = new ArrayList<>();
	List<TarefasConcluidas> tarefasConcluidas = new ArrayList<>();

	Person person1 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	Person person2 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	assertTrue(person1.equals(person2));

    }

    @Test
    public void EqualsFalse() {

	Contactbook contactBook = new Contactbook();
	List<EnderecoPostal> enderecoPostal = new ArrayList<>();
	List<TarefasPendentes> tarefasPendentes = new ArrayList<>();
	List<TarefasConcluidas> tarefasConcluidas = new ArrayList<>();

	Person person1 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	Person person2 = new Person("Asdrubal", "96 999 999 9", "9999999", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	assertFalse(person1.equals(person2));

    }

    @Test
    public void setEmailEquals() {

	Contactbook contactBook = new Contactbook();
	List<EnderecoPostal> enderecoPostal = new ArrayList<>();
	List<TarefasPendentes> tarefasPendentes = new ArrayList<>();
	List<TarefasConcluidas> tarefasConcluidas = new ArrayList<>();
	Contactbook colaboradores = new Contactbook();

	Person person1 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	colaboradores.contactAdd(person1);

	colaboradores.devolvePessoa("1").setEmail("Asdrubal@gmail.pt");

	assertEquals("Asdrubal@gmail.pt", colaboradores.devolvePessoa("1").getEmail());
    }

    @Test
    public void setDataNascimentoEquals() {

	Contactbook contactBook = new Contactbook();
	List<EnderecoPostal> enderecoPostal = new ArrayList<>();
	List<TarefasPendentes> tarefasPendentes = new ArrayList<>();
	List<TarefasConcluidas> tarefasConcluidas = new ArrayList<>();
	Contactbook colaboradores = new Contactbook();

	Person person1 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	colaboradores.contactAdd(person1);

	colaboradores.devolvePessoa("1").setDataNascimento("21/05/1981");
	assertEquals("21/05/1981", colaboradores.devolvePessoa("1").getDataNascimento());

    }

    @Test
    public void setNameEquals() {

	Contactbook contactBook = new Contactbook();
	List<EnderecoPostal> enderecoPostal = new ArrayList<>();
	List<TarefasPendentes> tarefasPendentes = new ArrayList<>();
	List<TarefasConcluidas> tarefasConcluidas = new ArrayList<>();
	Contactbook colaboradores = new Contactbook();

	Person person1 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);
	Person person2 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	colaboradores.contactAdd(person1);

	colaboradores.devolvePessoa("1").setName("Asdrubalx");
	assertEquals("Asdrubalx", colaboradores.devolvePessoa("1").getName());

	person1.getContactBook().contactAdd(person2);

	assertEquals("Asdrubalx", colaboradores.devolvePessoa("1").getName().toString());

    }

    @Test
    public void adicionarEnderecoPostalTrue() {

	Contactbook contactBook = new Contactbook();
	List<EnderecoPostal> enderecoPostal = new ArrayList<>();
	List<TarefasPendentes> tarefasPendentes = new ArrayList<>();
	List<TarefasConcluidas> tarefasConcluidas = new ArrayList<>();

	Person person1 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	EnderecoPostal enderecoPostalTeste = new EnderecoPostal("Rua do Amial", "Porto", "4250-480", "Portugal");

	person1.adicionarEnderecoPostal("Rua do Amial", "Porto", "4250-480", "Portugal");

	Contactbook colaboradores = new Contactbook();
	colaboradores.contactAdd(person1);

	assertEquals(enderecoPostalTeste.toString(),
		colaboradores.devolvePessoa("1").getEnderecoPostal().get(0).toString());

    }

    @Test
    public void adicionarEnderecoPostalNotEquals() {

	Contactbook contactBook = new Contactbook();
	List<EnderecoPostal> enderecoPostal = new ArrayList<>();
	List<TarefasPendentes> tarefasPendentes = new ArrayList<>();
	List<TarefasConcluidas> tarefasConcluidas = new ArrayList<>();

	Person person1 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	EnderecoPostal enderecoPostalTeste = new EnderecoPostal("xxx", "Porto", "4250-480", "Portugal");

	person1.adicionarEnderecoPostal("Rua do Amial", "Porto", "4250-480", "Portugal");

	Contactbook colaboradores = new Contactbook();
	colaboradores.contactAdd(person1);

	assertNotEquals(enderecoPostalTeste.toString(),
		colaboradores.devolvePessoa("1").getEnderecoPostal().get(0).toString());

    }

    @Test
    public void alterarEnderecoPostalEquals() {

	Contactbook contactBook = new Contactbook();
	List<EnderecoPostal> enderecoPostal = new ArrayList<>();
	List<TarefasPendentes> tarefasPendentes = new ArrayList<>();
	List<TarefasConcluidas> tarefasConcluidas = new ArrayList<>();

	Person person1 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	EnderecoPostal enderecoPostalTeste = new EnderecoPostal("Rua do Amial", "Porto", "4250-480", "Portugal");

	person1.adicionarEnderecoPostal("xxx", "Porto", "4250-480", "Portugal");

	person1.alterarEnderecoPostal(0, "Rua do Amial", "Porto", "4250-480", "Portugal");

	Contactbook colaboradores = new Contactbook();
	colaboradores.contactAdd(person1);

	assertEquals(enderecoPostalTeste.toString(),
		colaboradores.devolvePessoa("1").getEnderecoPostal().get(0).toString());

    }

    @Test
    public void alterarEnderecoPostalNotEquals() {

	Contactbook contactBook = new Contactbook();
	List<EnderecoPostal> enderecoPostal = new ArrayList<>();
	List<TarefasPendentes> tarefasPendentes = new ArrayList<>();
	List<TarefasConcluidas> tarefasConcluidas = new ArrayList<>();

	Person person1 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	EnderecoPostal enderecoPostalTeste = new EnderecoPostal("Rua do Amial", "Porto", "4250-480", "Portugal");

	person1.adicionarEnderecoPostal("Rua do Amial", "Porto", "4250-480", "Portugal");

	person1.alterarEnderecoPostal(0, "xxx", "Porto", "4250-480", "Portugal");

	Contactbook colaboradores = new Contactbook();
	colaboradores.contactAdd(person1);

	assertNotEquals(enderecoPostalTeste.toString(),
		colaboradores.devolvePessoa("1").getEnderecoPostal().get(0).toString());

    }

    @Test
    public void eliminarEnderecoPostalEquals() {

	Contactbook contactBook = new Contactbook();
	List<EnderecoPostal> enderecoPostal = new ArrayList<>();
	List<TarefasPendentes> tarefasPendentes = new ArrayList<>();
	List<TarefasConcluidas> tarefasConcluidas = new ArrayList<>();

	Person person1 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	EnderecoPostal enderecoPostalTeste = new EnderecoPostal("Rua do Amial", "Porto", "4250-480", "Portugal");

	person1.adicionarEnderecoPostal("Rua do Amial", "Porto", "4250-480", "Portugal");

	Contactbook colaboradores = new Contactbook();

	colaboradores.contactAdd(person1);

	person1.eliminarEnderecoPostal(0);

	assertTrue(!(colaboradores.devolvePessoa("1").toString().contains(enderecoPostalTeste.toString())));

    }

    @Test
    public void adicionarTarefasEquals() {

	Contactbook contactBook = new Contactbook();
	List<EnderecoPostal> enderecoPostal = new ArrayList<>();
	List<TarefasPendentes> tarefasPendentes = new ArrayList<>();
	List<TarefasConcluidas> tarefasConcluidas = new ArrayList<>();

	Person person1 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	TarefasPendentes tarefasPendenteTeste = new TarefasPendentes("tarefa1", new Date(20, 05, 1981),
		new Date(20, 05, 1981), new Date(20, 05, 1981));

	person1.adicionarTarefas("tarefa1", new Date(20, 05, 1981), new Date(20, 05, 1981), new Date(20, 05, 1981));

	Contactbook colaboradores = new Contactbook();

	colaboradores.contactAdd(person1);
	assertEquals(tarefasPendenteTeste.toString(),
		colaboradores.devolvePessoa("1").getTarefasPendentes().get(0).toString());
    }

    @Test
    public void adicionarTarefasNotEquals() {

	Contactbook contactBook = new Contactbook();
	List<EnderecoPostal> enderecoPostal = new ArrayList<>();
	List<TarefasPendentes> tarefasPendentes = new ArrayList<>();
	List<TarefasConcluidas> tarefasConcluidas = new ArrayList<>();

	Person person1 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	TarefasPendentes tarefasPendenteTeste = new TarefasPendentes("tarefaDiferente", new Date(20, 05, 1981),
		new Date(20, 05, 1981), new Date(20, 05, 1981));

	person1.adicionarTarefas("tarefa1", new Date(20, 05, 1981), new Date(20, 05, 1981), new Date(20, 05, 1981));

	Contactbook colaboradores = new Contactbook();

	colaboradores.contactAdd(person1);
	assertNotEquals(tarefasPendenteTeste.toString(),
		colaboradores.devolvePessoa("1").getTarefasPendentes().get(0).toString());
    }

    @Test
    public void marcarConcluidoTrueEquals() {

	Contactbook contactBook = new Contactbook();
	List<EnderecoPostal> enderecoPostal = new ArrayList<>();
	List<TarefasPendentes> tarefasPendentes = new ArrayList<>();
	List<TarefasConcluidas> tarefasConcluidas = new ArrayList<>();

	Person person1 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	TarefasPendentes tarefasConcluidaTeste = new TarefasPendentes("tarefa1", new Date(20, 05, 1981),
		new Date(20, 05, 1981), new Date(20, 05, 1981));

	person1.adicionarTarefas("tarefa1", new Date(20, 05, 1981), new Date(20, 05, 1981), new Date(20, 05, 1981));

	Contactbook colaboradores = new Contactbook();

	colaboradores.contactAdd(person1);

	person1.marcarConcluido(0);

	// assertTrue(colaboradores.devolvePessoa("1").getTarefasConcluidas().toString().contains("tarefa1"));

	assertEquals(tarefasConcluidaTeste.toString(),
		colaboradores.devolvePessoa("1").getTarefasConcluidas().get(0).toString());

	// System.out.println(tarefasConcluidaTeste.toString());
	// System.out.println(colaboradores.devolvePessoa("1").getTarefasConcluidas().get(0).toString());

    }

    @Test
    public void marcarConcluidoFalseEquals() {

	Contactbook contactBook = new Contactbook();
	List<EnderecoPostal> enderecoPostal = new ArrayList<>();
	List<TarefasPendentes> tarefasPendentes = new ArrayList<>();
	List<TarefasConcluidas> tarefasConcluidas = new ArrayList<>();

	Person person1 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	TarefasPendentes tarefasConcluidaTeste = new TarefasPendentes("tarefa1", new Date(20, 05, 1981),
		new Date(20, 05, 1981), new Date(20, 05, 1981));

	person1.adicionarTarefas("tarefa1", new Date(20, 05, 1981), new Date(20, 05, 1981), new Date(20, 05, 1981));
	person1.adicionarTarefas("tarefa2", new Date(20, 05, 1981), new Date(20, 05, 1981), new Date(20, 05, 1981));

	Contactbook colaboradores = new Contactbook();

	colaboradores.contactAdd(person1);

	person1.marcarConcluido(0);

	assertFalse(colaboradores.devolvePessoa("1").getTarefasConcluidas().toString().contains("tarefa2"));

	assertEquals(tarefasConcluidas.get(0).toString(),
		colaboradores.devolvePessoa("1").getTarefasConcluidas().get(0).toString());

    }

    @Test
    public void marcarConcluidoTrueNotEquals() {

	Contactbook contactBook = new Contactbook();
	List<EnderecoPostal> enderecoPostal = new ArrayList<>();
	List<TarefasPendentes> tarefasPendentes = new ArrayList<>();
	List<TarefasConcluidas> tarefasConcluidas = new ArrayList<>();

	Person person1 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	TarefasPendentes tarefasConcluidaTeste = new TarefasPendentes("tarefa1", new Date(20, 05, 1981),
		new Date(20, 05, 1981), new Date(20, 05, 1981));

	person1.adicionarTarefas("tarefa1", new Date(20, 05, 1981), new Date(20, 05, 1981), new Date(20, 05, 1981));
	person1.adicionarTarefas("tarefa2", new Date(20, 05, 1981), new Date(20, 05, 1981), new Date(20, 05, 1981));

	Contactbook colaboradores = new Contactbook();

	colaboradores.contactAdd(person1);

	person1.marcarConcluido(0);

	assertTrue(colaboradores.devolvePessoa("1").getTarefasConcluidas().toString().contains("tarefa1"));

	// assertNotEquals(tarefasConcluidaTeste.toString(),
	// colaboradores.devolvePessoa("1").getTarefasConcluidas().get(0).toString());
	// TODO VERIFICAR TOSTRING
    }

    @Test
    public void removerTarefaTrue() {

	Contactbook contactBook = new Contactbook();
	List<EnderecoPostal> enderecoPostal = new ArrayList<>();
	List<TarefasPendentes> tarefasPendentes = new ArrayList<>();
	List<TarefasConcluidas> tarefasConcluidas = new ArrayList<>();

	Person person1 = new Person("Asdrubal", "96 999 999 9", "207867161", "Asdrubal@gmail.com", "20/05/1981",
		contactBook, "1", enderecoPostal, tarefasConcluidas, tarefasPendentes);

	TarefasPendentes tarefasConcluidaTeste = new TarefasPendentes("tarefa1", new Date(20, 05, 1981),
		new Date(20, 05, 1981), new Date(20, 05, 1981));

	person1.adicionarTarefas("tarefa1", new Date(20, 05, 1981), new Date(20, 05, 1981), new Date(20, 05, 1981));
	person1.adicionarTarefas("tarefa2", new Date(20, 05, 1981), new Date(20, 05, 1981), new Date(20, 05, 1981));

	Contactbook colaboradores = new Contactbook();

	colaboradores.contactAdd(person1);

	person1.removerTarefa(0);

	assertTrue(!colaboradores.devolvePessoa("1").getTarefasConcluidas().toString().contains("tarefa1"));

	// assertNotEquals(tarefasConcluidaTeste.toString(),
	// colaboradores.devolvePessoa("1").getTarefasConcluidas().get(0).toString());
	// TODO VERIFICAR TOSTRING
    }

}
