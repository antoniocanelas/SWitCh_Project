package week6;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ContactListTest {

    @Test
    public void findTrue1() {

	ContactList contactBook = new ContactList();

	Contact c1 = new Contact("Manel", "96 456 456 456");
	Contact c2 = new Contact("Carlos", "96 456 456 456");
	Contact c3 = new Contact("José Manel", "96 456 222 222");
	contactBook.contactAdd(c1);
	contactBook.contactAdd(c2);
	contactBook.contactAdd(c3);

	assertTrue(contactBook.find("Manel"));
    }

    @Test
    public void findTrue2() {

	ContactList contactBook = new ContactList();

	Contact c1 = new Contact("Manel", "96 456 456 456");
	Contact c2 = new Contact("Carlos", "96 456 456 456");
	Contact c3 = new Contact("josé Manel", "96 456 222 222");
	contactBook.contactAdd(c1);
	contactBook.contactAdd(c2);
	contactBook.contactAdd(c3);

	assertTrue(contactBook.find("José"));
    }

    @Test
    public void findFalse() {

	ContactList contactBook = new ContactList();

	Contact c1 = new Contact("Manel", "96 456 456 456");
	Contact c2 = new Contact("Carlos", "99 999 999 999");
	Contact c3 = new Contact("José Manel", "96 456 222 222");
	contactBook.contactAdd(c1);
	contactBook.contactAdd(c2);
	contactBook.contactAdd(c3);

	assertFalse(contactBook.find("Ze"));
    }

    @Test
    public void contactAddTrue() {

	ContactList contactBook = new ContactList();

	Contact c1 = new Contact("Manel", "96 456 456 456");
	Contact c2 = new Contact("dfsz", "99 999 999 999");
	contactBook.contactAdd(c1);

	assertTrue(contactBook.contactAdd(c2));

    }

    @Test
    public void contactAddFalse() {

	ContactList contactBook = new ContactList();

	Contact c1 = new Contact("Manel", "96 456 456 456");
	Contact c2 = new Contact("Manel", "96 456 456 456");
	contactBook.contactAdd(c1);

	assertFalse(contactBook.contactAdd(c2));
    }

    @Test
    public void contactRemoveTrue() {

	ContactList contactBook = new ContactList();

	Contact c1 = new Contact("Manel", "96 456 456 456");
	contactBook.contactAdd(c1);

	assertTrue(contactBook.contactRemove(c1));

    }

    @Test
    public void contactRemoveFalse() {

	ContactList contactBook = new ContactList();

	Contact c1 = new Contact("Manel", "96 456 456 456");
	Contact c2 = new Contact("Manel", "99 999 999 999");
	contactBook.contactAdd(c1);

	assertFalse(contactBook.contactRemove(c2));

    }
}
