package week8;

import java.util.ArrayList;
import java.util.List;

public class Contactbook {

    public List<Person> contactBook = new ArrayList<>();

    public boolean contactAdd(Person c) {

	if (!hasContact(c)) {
	    return this.contactBook.add(c);

	}
	return false;

    }

    public boolean contactRemove(Person c) {

	if (hasContact(c)) {
	    return this.contactBook.remove(c);
	}
	return false;

    }

    public boolean find(String c) {

	c = c.toLowerCase();
	for (Person t : this.contactBook) {

	    if (t.getName().toLowerCase().contains(c)) {
		return true;
	    }
	}
	return false;

    }

    public List<Person> getContactBook() {

	return contactBook;
    }

    public void setContactBook(List<Person> contactBook) {

	this.contactBook = contactBook;
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
	Contactbook other = (Contactbook) obj;
	if (this.contactBook == null) {
	    if (other.contactBook != null) {
		return false;
	    }
	} else if (!this.contactBook.equals(other.contactBook)) {
	    return false;
	}
	return true;
    }

    public boolean hasContact(Person c) {

	for (Person other : this.contactBook) {// por cada objecto contacto dentro do contentor (da lista) contactBook
	    if (other.getPhoneNumber().equals(c.getPhoneNumber())) {
		return true;
	    }

	}
	return false;

    }

    public Contactbook commonPerson(Contactbook cb) {

	Contactbook result = new Contactbook();

	for (Person p1 : this.contactBook) {
	    for (Person p2 : cb.contactBook) {
		if (p1.getPhoneNumber() == p2.getPhoneNumber()) {
		    result.contactAdd(p1);
		}
	    }

	}
	return result;

    }

    public Person devolvePessoa(String numeroMecanografico) {

	for (Person p : contactBook) {
	    if (p.getNumeroMecanografico() == numeroMecanografico) {
		return p;
	    }
	}
	return null;
    }
    // TODO ÇLKSDJKLÇSDFJÇK DFASDF SDFADSFAS

}
