package week6;

import java.util.ArrayList;
import java.util.List;

public class ContactList {

    public List<Contact> contactBook = new ArrayList<>();

    public boolean contactAdd(Contact c) {

	if (!hasContact(c)) {
	    return this.contactBook.add(c);

	}
	return false;

    }

    public boolean contactRemove(Contact c) {

	if (hasContact(c)) {
	    return this.contactBook.remove(c);
	}
	return false;

    }

    public boolean find(String c) {

	c = c.toLowerCase();
	for (Contact t : this.contactBook) {

	    if (t.getName().toLowerCase().contains(c)) {
		return true;
	    }
	}
	return false;

    }

    @Override
    public String toString() {

	return "ContactList [contactBook=" + this.contactBook + "]";
    }

    public boolean hasContact(Contact c) {

	for (Contact other : this.contactBook) {// por cada objecto contacto dentro do contentor (da lista) contactBook
	    if (c.equals(other)) {
		return true;
	    }

	}
	return false;

    }
}
