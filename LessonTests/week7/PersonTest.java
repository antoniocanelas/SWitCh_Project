package week7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {

    @Test
    public void test() {

	Person p1 = new Person("Pedro", "919999999");
	p1.getContactBook().contactAdd(new Person("Ines", "929999999"));// ir ao pedro, ver a lista de contactos, e
									// adicionar a
	// ines
	p1.getContactBook().contactAdd(new Person("Cristina", "939999999"));
	System.out.println(p1.getContactBook().toString());

	ContactBook expected = new ContactBook();
	expected.contactAdd(new Person("Ines", "929999999"));
	expected.contactAdd(new Person("Cristina", "939999999"));

	assertEquals(expected, p1.getContactBook());
    }

    @Test
    public void test1() {

	Person p1 = new Person("Pedro", "919999999");
	p1.getContactBook().contactAdd(new Person("Ines", "929999999"));// ir ao pedro, ver a lista de contactos, e
									// adicionar a
	// ines
	p1.getContactBook().contactAdd(new Person("Cristina", "939999999"));

	ContactBook expected = new ContactBook();
	expected.contactAdd(new Person("Ines", "999999999")); // alterei o numero aqui
	expected.contactAdd(new Person("Cristina", "939999999"));

    }
}
