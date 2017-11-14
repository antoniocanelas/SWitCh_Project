package week7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ContactBookTest {

    @Test
    public void findTrue1() {

	ContactBook contactBook = new ContactBook();

	Person c1 = new Person("Manel", "96 456 456 456");
	Person c2 = new Person("Carlos", "96 456 456 456");
	Person c3 = new Person("José Manel", "96 456 222 222");
	contactBook.contactAdd(c1);
	contactBook.contactAdd(c2);
	contactBook.contactAdd(c3);

	assertTrue(contactBook.find("Manel"));
    }

    @Test
    public void findTrue2() {

	ContactBook contactBook = new ContactBook();

	Person c1 = new Person("Manel", "96 456 456 456");
	Person c2 = new Person("Carlos", "96 456 456 456");
	Person c3 = new Person("josé Manel", "96 456 222 222");
	contactBook.contactAdd(c1);
	contactBook.contactAdd(c2);
	contactBook.contactAdd(c3);

	assertTrue(contactBook.find("José"));
    }

    @Test
    public void findFalse() {

	ContactBook contactBook = new ContactBook();

	Person c1 = new Person("Manel", "96 456 456 456");
	Person c2 = new Person("Carlos", "99 999 999 999");
	Person c3 = new Person("José Manel", "96 456 222 222");
	contactBook.contactAdd(c1);
	contactBook.contactAdd(c2);
	contactBook.contactAdd(c3);

	assertFalse(contactBook.find("Ze"));
    }

    @Test
    public void contactAddTrue() {

	ContactBook contactBook = new ContactBook();

	Person c1 = new Person("Manel", "96 456 456 456");
	Person c2 = new Person("dfsz", "99 999 999 999");
	contactBook.contactAdd(c1);

	assertTrue(contactBook.contactAdd(c2));

    }

    @Test
    public void contactAddFalse() {

	ContactBook contactBook = new ContactBook();

	Person c1 = new Person("Manel", "96 456 456 456");
	Person c2 = new Person("Manel", "96 456 456 456");
	contactBook.contactAdd(c1);

	assertFalse(contactBook.contactAdd(c2));
    }

    @Test
    public void contactRemoveTrue() {

	ContactBook contactBook = new ContactBook();

	Person c1 = new Person("Manel", "96 456 456 456");
	contactBook.contactAdd(c1);

	assertTrue(contactBook.contactRemove(c1));

    }

    @Test
    public void contactRemoveFalse() {

	ContactBook contactBook = new ContactBook();

	Person c1 = new Person("Manel", "96 456 456 456");
	Person c2 = new Person("Manel", "99 999 999 999");
	contactBook.contactAdd(c1);

	assertFalse(contactBook.contactRemove(c2));

    }

    @Test
    public void hasContactTrue() {

	ContactBook contactBook = new ContactBook();

	Person c1 = new Person("Manel", "96 456 456 456");
	Person c2 = new Person("Manel", "99 999 999 999");
	contactBook.contactAdd(c1);
	contactBook.contactAdd(c2);

	assertTrue(contactBook.hasContact(c1));
    }

    @Test
    public void hasContactFalse() {

	ContactBook contactBook = new ContactBook();

	Person c1 = new Person("Manel", "96 456 456 456");
	Person c2 = new Person("Manel", "99 999 999 999");
	contactBook.contactAdd(c1);

	assertFalse(contactBook.hasContact(c2));
    }

    @Test
    public void commonPersonTrue1() {

	ContactBook contactBook1 = new ContactBook();
	ContactBook contactBook2 = new ContactBook();
	ContactBook contactBookExpected = new ContactBook();

	Person c1 = new Person("Manel", "111");
	Person c2 = new Person("Ze", "222");
	Person c3 = new Person("Carlos", "333");
	contactBook1.contactAdd(c1);
	contactBook1.contactAdd(c2);
	contactBook2.contactAdd(c2);
	contactBook2.contactAdd(c3);

	contactBookExpected.contactAdd(c2);

	assertEquals(contactBookExpected, contactBook1.commonPerson(contactBook2));
    }

    @Test
    public void commonPersonTrue2() {

	ContactBook contactBook1 = new ContactBook();
	ContactBook contactBook2 = new ContactBook();
	ContactBook contactBookExpected = new ContactBook();

	Person c1 = new Person("Manel", "111");
	Person c2 = new Person("Ze", "222");
	Person c3 = new Person("Paulo", "333");
	Person c4 = new Person("Asdrubal", "333");
	contactBook1.contactAdd(c1);
	contactBook1.contactAdd(c2);
	contactBook1.contactAdd(c3);
	contactBook2.contactAdd(c2);
	contactBook2.contactAdd(c3);
	contactBook2.contactAdd(c4);

	contactBookExpected.contactAdd(c2);
	contactBookExpected.contactAdd(c3);

	assertEquals(contactBookExpected, contactBook1.commonPerson(contactBook2));
    }

    @Test
    public void commonPersonTrue3() {

	ContactBook contactBook1 = new ContactBook();
	ContactBook contactBook2 = new ContactBook();
	ContactBook contactBookExpected = new ContactBook();

	Person c1 = new Person("Manel", "111");
	Person c2 = new Person("Ze", "222");
	Person c3 = new Person("Paulo", "333");
	Person c4 = new Person("Asdrubal", "333");
	contactBook1.contactAdd(c1);
	contactBook1.contactAdd(c2);
	contactBook1.contactAdd(c3);
	contactBook2.contactAdd(c2);
	contactBook2.contactAdd(c3);
	contactBook2.contactAdd(c4);

	contactBookExpected.contactAdd(c2);

	assertNotEquals(contactBookExpected, contactBook1.commonPerson(contactBook2));
    }
}
